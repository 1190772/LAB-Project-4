package domain.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.BinaryOperator;

/**
 * @author DEI-ISEP
 */
public class Algorithms {

    /**
     * Performs breadth-first search of a Graph starting in a vertex
     *
     * @param g    Graph instance
     * @param vert vertex that will be the source of the search
     * @return a LinkedList with the vertices of breadth-first search
     */
    public static <V, E> LinkedList<V> BreadthFirstSearch(Graph<V, E> g, V vert) {

        if (!g.validVertex(vert)) {
            return null;
        }

        LinkedList<V> qbfs = new LinkedList<>();
        LinkedList<V> qaux = new LinkedList<>();
        boolean[] visited = new boolean[g.numVertices()];
        qbfs.add(vert);
        qaux.add(vert);
        visited[g.key(vert)] = true;
        while (!qaux.isEmpty()) {
            V vInf = qaux.remove(0); // vert
            for (V vAdj : g.adjVertices(vInf)) {
                if (!visited[g.key(vAdj)]) {
                    qbfs.add(vAdj);
                    qaux.add(vAdj);
                    visited[g.key(vAdj)] = true;
                }
            }

        }
        return qbfs;
    }

    /**
     * Performs depth-first search starting in a vertex
     *
     * @param g       Graph instance
     * @param vOrig   vertex of graph g that will be the source of the search
     * @param visited set of previously visited vertices
     * @param qdfs    return LinkedList with vertices of depth-first search
     */
    private static <V, E> void DepthFirstSearch(Graph<V, E> g, V vOrig, boolean[] visited, LinkedList<V> qdfs) {

        qdfs.add(vOrig);
        visited[g.key(vOrig)] = true;
        for (V vAdj : g.adjVertices(vOrig)) {
            if (!visited[g.key(vAdj)]) {
                DepthFirstSearch(g, vAdj, visited, qdfs);
            }
        }
    }


    /**
     * Performs depth-first search starting in a vertex
     *
     * @param g    Graph instance
     * @param vert vertex of graph g that will be the source of the search
     * @return a LinkedList with the vertices of depth-first search
     */
    public static <V, E> LinkedList<V> DepthFirstSearch(Graph<V, E> g, V vert) {

        if (!g.validVertex(vert)) {
            return null;
        }

        LinkedList<V> qdfs = new LinkedList<>();
        boolean[] visited = new boolean[g.numVertices()];
        qdfs.add(vert);
        visited[g.key(vert)] = true;
        for (V vAdj : g.adjVertices(vert)) {
            if (!g.validVertex(vAdj)) {
                return null;
            }

            if (!visited[g.key(vAdj)]) {
                DepthFirstSearch(g, vAdj, visited, qdfs);
            }
        }
        return qdfs;
    }


    /**
     * Returns all paths from vOrig to vDest
     *
     * @param g       Graph instance
     * @param vOrig   Vertex that will be the source of the path
     * @param vDest   Vertex that will be the end of the path
     * @param visited set of discovered vertices
     * @param path    stack with vertices of the current path (the path is in reverse order)
     * @param paths   ArrayList with all the paths (in correct order)
    */
    private static <V, E> void allPaths(Graph<V, E> g, V vOrig, V vDest, boolean[] visited,
                                        LinkedList<V> path, ArrayList<LinkedList<V>> paths) {
        LinkedList<V> pathcopy = new LinkedList<>(path);
        LinkedList<V> pathrev = new LinkedList<>();

        visited[g.key(vOrig)] = true;
        path.push(vOrig);
        for (V vAdj : g.adjVertices(vOrig)) {
            if (vAdj.equals(vDest)) {
                path.push(vDest);
                while (!pathcopy.isEmpty()) {
                    pathrev.push(pathcopy.pop());
                    paths.add(path);
                }
                path.pop();
            } else {
                if (!visited[g.key(vAdj)]) {
                    allPaths(g, vAdj, vDest, visited, path, paths);
                }
            }
        }
        V vertex = path.pop();
        visited[g.key(vertex)] = false;
    }

    /**
     * Returns all paths from vOrig to vDest
     *
     * @param g     Graph instance
     * @param vOrig information of the Vertex origin
     * @param vDest information of the Vertex destination
     * @return paths ArrayList with all paths from vOrig to vDest
     */
    public static <V, E> ArrayList<LinkedList<V>> allPaths(Graph<V, E> g, V vOrig, V vDest) {

        ArrayList<LinkedList<V>> paths = new ArrayList<>();
        LinkedList<V> path = new LinkedList<>();
        boolean[] visited = new boolean[g.numVertices()];
        if (g.validVertex(vOrig) && g.validVertex(vDest)) {
            allPaths(g, vOrig, vDest, visited, path, paths);
        }

        return paths;

    }


    /**
     * Computes shortest-path distance from a source vertex to all reachable
     * vertices of a graph g with non-negative edge weights
     * This implementation uses Dijkstra's algorithm
     *
     * @param g        Graph instance
     * @param vOrig    Vertex that will be the source of the path
     * @param visited  set of previously visited vertices
     * @param pathKeys minimum path vertices keys
     * @param dist     minimum distances
     */
    private static <V, E> void shortestPathDijkstra(Graph<V, E> g, V vOrig,

                                                    Comparator<E> ce, BinaryOperator<E> sum, E zero,

                                                    boolean[] visited, V[] pathKeys, E[] dist) {

        int vkey = g.key(vOrig);

        dist[vkey] = zero;

        pathKeys[vkey] = vOrig;

        while (vOrig != null) {

            vkey = g.key(vOrig);

            visited[vkey] = true;

            for (Edge<V, E> edge : g.outgoingEdges(vOrig)) {

                int vkeyAdj = g.key(edge.getVDest());

                if (!visited[vkeyAdj]) {

                    E s = sum.apply(dist[vkey], edge.getWeight());

                    if (dist[vkeyAdj] == null || ce.compare(dist[vkeyAdj], s) > 0) {

                        dist[vkeyAdj] = s;

                        pathKeys[vkeyAdj] = vOrig;

                    }

                }

            }

            E minDist = null;  //next vertice, that has minimum dist

            vOrig = null;

            for (V vert : g.vertices()) {

                int i = g.key(vert);

                if (!visited[i] && dist[i] != null && (minDist == null || ce.compare(dist[i], minDist) < 0)) {

                    minDist = dist[i];

                    vOrig = vert;

                }

            }

        }

    }


    /**
     * Shortest-path between two vertices
     *
     * @param g         graph
     * @param vOrig     origin vertex
     * @param vDest     destination vertex
     * @param ce        comparator between elements of type E
     * @param sum       sum two elements of type E
     * @param zero      neutral element of the sum in elements of type E
     * @param shortPath returns the vertices which make the shortest path
     * @return if vertices exist in the graph and are connected, true, false otherwise
     */
    public static <V, E> E shortestPath(Graph<V, E> g, V vOrig, V vDest,

                                        Comparator<E> ce, BinaryOperator<E> sum, E zero,

                                        LinkedList<V> shortPath) {


        if (!g.validVertex(vOrig) || !g.validVertex(vDest))

            return null;


        shortPath.clear();

        int numVerts = g.numVertices();

        boolean[] visited = new boolean[numVerts]; //default value: false

        @SuppressWarnings("unchecked")

        V[] pathKeys = (V[]) new Object[numVerts];

        @SuppressWarnings("unchecked")

        E[] dist = (E[]) new Object[numVerts];

        for (int i = 0; i < numVerts; i++) {

            dist[i] = null;

            pathKeys[i] = null;

        }


        shortestPathDijkstra(g, vOrig, ce, sum, zero, visited, pathKeys, dist);


        E lengthPath = dist[g.key(vDest)];


        if (lengthPath == null)

            return null;


        getPath(g, vOrig, vDest, pathKeys, shortPath);

        return lengthPath;

    }


    /**
     * Shortest-path between a vertex and all other vertices
     *
     * @param g     graph
     * @param vOrig start vertex
     * @param ce    comparator between elements of type E
     * @param sum   sum two elements of type E
     * @param zero  neutral element of the sum in elements of type E
     * @param paths returns all the minimum paths
     * @param dists returns the corresponding minimum distances
     * @return if vOrig exists in the graph true, false otherwise
     */

    public static <V, E> boolean shortestPaths(Graph<V, E> g, V vOrig,

                                               Comparator<E> ce, BinaryOperator<E> sum, E zero,

                                               ArrayList<LinkedList<V>> paths, ArrayList<E> dists) {


        if (!g.validVertex(vOrig)) return false;


        int numVerts = g.numVertices();

        boolean[] visited = new boolean[numVerts]; //default value: false

        @SuppressWarnings("unchecked")

        V[] pathKeys = (V[]) new Object[numVerts];

        @SuppressWarnings("unchecked")

        E[] dist = (E[]) new Object[numVerts];

        for (int i = 0; i < numVerts; i++) {

            dist[i] = null;

            pathKeys[i] = null;

        }


        shortestPathDijkstra(g, vOrig, ce, sum, zero, visited, pathKeys, dist);


        dists.clear();

        paths.clear();

        for (int i = 0; i < numVerts; i++) {

            paths.add(null);

            dists.add(null);

        }

        for (V vDst : g.vertices()) {

            int i = g.key(vDst);

            if (dist[i] != null) {

                LinkedList<V> shortPath = new LinkedList<>();

                getPath(g, vOrig, vDst, pathKeys, shortPath);

                paths.set(i, shortPath);

                dists.set(i, dist[i]);

            }

        }

        return true;

    }


    /**
     * Extracts from pathKeys the minimum path between voInf and vdInf
     * <p>
     * The path is constructed from the end to the beginning
     *
     * @param g        Graph instance
     * @param vOrig    information of the Vertex origin
     * @param vDest    information of the Vertex destination
     * @param pathKeys minimum path vertices keys
     * @param path     stack with the minimum path (correct order)
     */

    private static <V, E> void getPath(Graph<V, E> g, V vOrig, V vDest,

                                       V[] pathKeys, LinkedList<V> path) {


        if (vOrig.equals(vDest))

            path.push(vOrig);

        else {

            path.push(vDest);

            int vKey = g.key(vDest);

            vDest = pathKeys[vKey];

            getPath(g, vOrig, vDest, pathKeys, path);

        }

    }


    /**
     * Calculates the minimum distance graph using Floyd-Warshall
     *
     * @param g   initial graph
     * @param ce  comparator between elements of type E
     * @param sum sum two elements of type E
     * @return the minimum distance graph
     */
//    public static <V, E> MatrixGraph<V, E> minDistGraph(Graph<V, E> g, Comparator<E> ce, BinaryOperator<E> sum) {
//
//        int numVerts = g.numVertices();
//        if (numVerts == 0)
//            return null;
//        @SuppressWarnings("unchecked")
//
//        E[][] mat = (E[][]) new Object[numVerts][numVerts];
//        for (int i = 0; i < numVerts; i++) {
//            for (int j = 0; j < numVerts; j++) {
//                Edge<V, E> edge = g.edge(i, j);
//                if (edge != null)
//                    mat[i][j] = edge.getWeight();
//            }
//        }
//        for (int k = 0; k < numVerts; k++)
//            for (int i = 0; i < numVerts; i++)
//                if (i != k && mat[i][k] != null)
//                    for (int j = 0; j < numVerts; j++)
//                        if (j != k && j != i && mat[k][j] != null) {
//                            E s = sum.apply(mat[i][j], mat[k][j]);
//                            if (mat[i][j] == null || ce.compare(mat[i][j], s) > 0) // é capaz de ser [k][j] em vez de [i][j]
//                                mat[i][j] = s;
//                        }
//
//        return new MatrixGraph(g.isDirected(), g.vertices(), mat);
//
//    }
}