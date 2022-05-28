package eapli.base.agv.application;

import eapli.base.agv.Repository.AGVRepository;
import eapli.base.agv.Repository.AutomaticTaskRepository;
import eapli.base.agv.Repository.InfoRepository;
import eapli.base.agv.domain.AGV;
import eapli.base.agv.domain.AutomaticTask;
import eapli.base.agv.domain.Info;
import eapli.base.agv.domain.Status;
import eapli.base.infrastructure.persistence.PersistenceContext;

import java.util.*;

public class AutomaticTaskController {


    private final InfoRepository infoTarefaRepository = PersistenceContext.repositories().info();
    private final AutomaticTaskRepository tarefaAutomaticaRepository = PersistenceContext.repositories().automaticTask();
    private final AGVRepository executorTarefasRepository = PersistenceContext.repositories().agv();

    public List<Info> listarTarefasAutomaticasPorAtribuir(){
        List<Info> tarefas = (List<Info>) infoTarefaRepository.findAll();
        List<AutomaticTask> tarefasAutomaticas = (List<AutomaticTask>) tarefaAutomaticaRepository.findAll();
        List<Info> listaFinal = new ArrayList<>();
        for(Info it : tarefas){
            for(AutomaticTask ta : tarefasAutomaticas){
                if(it.getTask().getId()==ta.getId()){
                    if(it.getStatus()== Status.NOT_STARTED){
                        listaFinal.add(it);
                    }
                }
            }
        }
        return listaFinal;
    }

    public List<AGV> obterExecutoresDisponiveisPorOrdemId(){
        List<AGV> executores = (List<AGV>) executorTarefasRepository.findAll();
        Collections.sort(executores, new Comparator<AGV>() {
            @Override
            public int compare(AGV et1, AGV et2) {
                return et1.getId() - et2.getId();
            }
        });
        return executores;
    }

    public List<Info> fcfs() {

        List<Info> tarefasPorAtribuir = listarTarefasAutomaticasPorAtribuir();
        Collections.sort(tarefasPorAtribuir, new Comparator<Info>() {
            @Override
            public int compare(Info it1, Info it2) {
                return it1.getDataInicio().compareTo(it2.getDataInicio());
            }
        });
        return tarefasPorAtribuir;
    }

    public boolean atribuirTarefas1(Info t1){
        AGV executorEscolhido = null;
        List<AGV> executores = obterExecutoresDisponiveisPorOrdemId();
        if(executores.size()==0){
            System.out.println("Não existem executores disponíveis para a tarefa"+t1.getId()+"!\n");
            return false;
        } else if(executores.size()==1){
            executorEscolhido = executores.get(0);
            System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 1, pelo facto de só haver um executor de tarefas disponível!\n", t1.getId());
            guardarExecutorEscolhido(executorEscolhido, t1);
            return true;
        } else {
            int contadorExecutoresOcupados=0;
            for(AGV et : executores){
                if(et.isOcuppied()==true){
                    contadorExecutoresOcupados++;
                }
            }
            if(contadorExecutoresOcupados==0){
                executorEscolhido = executores.get(0);
                System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 1, pelo facto de nenhum executor estar ocupado!\n", t1.getId());
                guardarExecutorEscolhido(executorEscolhido, t1);
                return true;
            }

            if(contadorExecutoresOcupados != 0 && contadorExecutoresOcupados < executores.size()){
                for(AGV et : executores){
                    if(et.isOcuppied()==false){
                        executorEscolhido = et;
                        System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 1, pelo facto do executor não estar ocupado!\n", t1.getId());
                        guardarExecutorEscolhido(executorEscolhido, t1);
                        return true;
                    }
                }
            }
            if(contadorExecutoresOcupados == executores.size()){
                Date dataMaisRecenteExecutor = executores.get(0).getTasks().get(0).getDataInicio();
                Date dataMaisAntigaGeral = dataMaisRecenteExecutor;
                executorEscolhido = executores.get(0);
                for(AGV et : executores){
                    List<Info> tarefasExecutor = et.getTasks();
                    if(et!=executores.get(0)){
                        dataMaisRecenteExecutor = et.getTasks().get(0).getDataInicio();
                    }
                    for(Info it : tarefasExecutor){
                        if(it.getDataInicio().compareTo(dataMaisRecenteExecutor)>0){
                            dataMaisRecenteExecutor = it.getDataInicio();
                        }
                    }
                    if(et==executores.get(0)){
                        dataMaisAntigaGeral = dataMaisRecenteExecutor;
                    }
                    if(dataMaisRecenteExecutor.compareTo(dataMaisAntigaGeral)<0){
                        dataMaisAntigaGeral = dataMaisRecenteExecutor;
                        executorEscolhido = et;
                    }
                }
                System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 1 a um executor!\n", t1.getId());
                guardarExecutorEscolhido(executorEscolhido, t1);
                return true;
            }

        }
        return true;
    }

    public boolean atribuirTarefas2(Info t2){
        AGV executorEscolhido = null;
        List<AGV> executores = obterExecutoresDisponiveisPorOrdemId();
        if(executores.size()==0){
            System.out.println("Não existem executores disponíveis para a tarefa"+t2.getId()+"!\n");
            return false;
        } else if(executores.size()==1){
            executorEscolhido = executores.get(0);
            System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 2, pelo facto de só haver um executor de tarefas disponível!\n", t2.getId());
            guardarExecutorEscolhido(executorEscolhido, t2);
            return true;
        } else {
            int contadorExecutoresOcupados=0;
            for(AGV et : executores){
                if(et.isOcuppied()==true){
                    contadorExecutoresOcupados++;
                }
            }
            if(contadorExecutoresOcupados==0){
                executorEscolhido = executores.get(0);
                System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 2, pelo facto de nenhum executor estar ocupado!\n", t2.getId());
                guardarExecutorEscolhido(executorEscolhido, t2);
                return true;
            }

            if(contadorExecutoresOcupados != 0 && contadorExecutoresOcupados < executores.size()){
                for(AGV et : executores){
                    if(et.isOcuppied()==false){
                        executorEscolhido = et;
                        System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 2, pelo facto do executor não estar ocupado!\n", t2.getId());
                        guardarExecutorEscolhido(executorEscolhido, t2);
                        return true;
                    }
                }
            }
            if(contadorExecutoresOcupados == executores.size()){
                int numeroTarefasExecutor = executores.get(0).getTasks().size();
                executorEscolhido = executores.get(0);
                for(AGV et : executores){
                    if(et.getTasks().size() < numeroTarefasExecutor){
                        numeroTarefasExecutor = et.getTasks().size();
                        executorEscolhido = et;
                    }
                }
                System.out.printf("InfoTarefa com o id %d atribuída com sucesso pela forma 2 a um executor!\n", t2.getId());
                guardarExecutorEscolhido(executorEscolhido, t2);
                return true;
            }

        }
        return true;
    }


    public void guardarExecutorEscolhido(AGV executorEscolhido, Info infoTarefa){
        executorEscolhido.acceptTask(infoTarefa);
        if(executorEscolhido.isOcuppied()==false){
            executorEscolhido.changeOcuppied(true);
        }
        infoTarefa.associateAGV(executorEscolhido);
        infoTarefa.changeStatus(Status.ASSOCIATED);
        executorTarefasRepository.save(executorEscolhido);
        infoTarefaRepository.save(infoTarefa);
    }


}
