package eapli.base.importwarehouse.application;


import eapli.base.importwarehouse.domain.*;
import eapli.base.importwarehouse.domain.aisles.*;
import eapli.base.importwarehouse.domain.warehouse.Length;
import eapli.base.importwarehouse.domain.warehouse.Name;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class WarehouseJsonReader implements JsonReader<WarehousePlant> {


    @Override
    public WarehousePlant parse(String filePath) throws IOException {
        JSONParser parser = new JSONParser();
        try {
            JSONObject root = ((JSONObject) parser.parse(new FileReader(filePath)));
            List<Aisle> aisles = readAisles(root);
            List<AGVDock> docks = readDocks(root);
            Name name = Name.of(root.get("Warehouse").toString());
            Length length = Length.of(Double.parseDouble(root.get("Length").toString()));
            Length width = Length.of(Double.parseDouble(root.get("Width").toString()));
            Area area = Area.of(Double.parseDouble(root.get("Square").toString()));
            Name unit = Name.of(root.get("Unit").toString());
            return new WarehousePlant(name, length, width, area, unit, aisles, docks);
        } catch (ParseException e) {
            throw new IOException("Not a valid JSON file", e);
        }
    }

    private List<AGVDock> readDocks(JSONObject root) {
        List<AGVDock> docks = new LinkedList<>();
        for (Object o : ((JSONArray) root.get("AGVDocks"))) {
            JSONObject oJSON = (JSONObject) o;
            JSONObject beginJSON = ((JSONObject) oJSON.get("begin"));
            JSONObject endJSON = ((JSONObject) oJSON.get("end"));
            JSONObject depthJSON = ((JSONObject) oJSON.get("depth"));

            docks.add(new AGVDock(new AGVDockId(oJSON.get("Id").toString()),
                    Coords.of(Integer.parseInt(beginJSON.get("lsquare").toString()), Integer.parseInt(beginJSON.get("wsquare").toString())),
                    Coords.of(Integer.parseInt(endJSON.get("lsquare").toString()), Integer.parseInt(endJSON.get("wsquare").toString())),
                    Coords.of(Integer.parseInt(depthJSON.get("lsquare").toString()), Integer.parseInt(depthJSON.get("wsquare").toString())),
                    Accessibility.of(oJSON.get("accessibility").toString())));
        }
        return docks;
    }

    private List<Aisle> readAisles(JSONObject root) {
        List<Aisle> aisles = new LinkedList<>();
        JSONArray aislesJSON = ((JSONArray) root.get("Aisles"));
        for (Object o : aislesJSON) {
            JSONObject oJSON = ((JSONObject) o);
            JSONObject beginJSON = ((JSONObject) oJSON.get("begin"));
            JSONObject endJSON = ((JSONObject) oJSON.get("end"));
            JSONObject depthJSON = ((JSONObject) oJSON.get("depth"));
            List<AisleRow> rows = readRows(oJSON);

            Aisle aisle = new Aisle(new AisleId(Long.parseLong(oJSON.get("Id").toString())),
                    Coords.of(Integer.parseInt(beginJSON.get("lsquare").toString()), Integer.parseInt(beginJSON.get("wsquare").toString())),
                    Coords.of(Integer.parseInt(endJSON.get("lsquare").toString()), Integer.parseInt(endJSON.get("wsquare").toString())),
                    Coords.of(Integer.parseInt(depthJSON.get("lsquare").toString()), Integer.parseInt(depthJSON.get("wsquare").toString())),
                    Accessibility.of(oJSON.get("accessibility").toString()), rows);
            aisles.add(aisle);
        }
        return aisles;
    }

    private List<AisleRow> readRows(JSONObject aislesJSON) {
        List<AisleRow> rows = new LinkedList<>();
        JSONArray rowsJSON = ((JSONArray) aislesJSON.get("rows"));
        for (Object o : rowsJSON) {
            JSONObject oJSON = ((JSONObject) o);
            JSONObject beginJSON = ((JSONObject) oJSON.get("begin"));
            JSONObject endJSON = ((JSONObject) oJSON.get("end"));
            AisleRow row = new AisleRow(new AisleRowId(Long.parseLong(oJSON.get("Id").toString())),
                    Coords.of(Integer.parseInt(beginJSON.get("lsquare").toString()), Integer.parseInt(beginJSON.get("wsquare").toString())),
                    Coords.of(Integer.parseInt(endJSON.get("lsquare").toString()), Integer.parseInt(endJSON.get("wsquare").toString())),
                    Capacity.of(Integer.parseInt(oJSON.get("shelves").toString())));
            rows.add(row);
        }
        return rows;
    }
}
