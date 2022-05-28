package eapli.base.agv.domain;

import eapli.base.agv.application.AutomaticTaskController;

import java.util.List;

public class MainThreadAutomatic extends Thread {

    private AutomaticTaskController atac = new AutomaticTaskController();

    public void run(){
        for(;;){
            try{
                Thread.sleep(30000);
                List<Info> tarefasPorAtribuir = atac.fcfs();
                if (tarefasPorAtribuir.size() != 0){
                    System.out.printf("O tamanho do array tarefas é %d\n", tarefasPorAtribuir.size());
                    if(tarefasPorAtribuir.size()>1) {
                        for (int i = 0; i < tarefasPorAtribuir.size(); i++) {
                            ThreadAutomaticTask tt = new ThreadAutomaticTask(tarefasPorAtribuir.get(i));
                            System.out.println("Thread Criada!");
                            tt.start();
                            Thread.sleep(10000);
                        }
                    }
                    if(tarefasPorAtribuir.size()==1){
                        ThreadAutomaticTask tt = new ThreadAutomaticTask(tarefasPorAtribuir.get(0));
                        System.out.println("Thread Criada!");
                        tt.start();
                    }
                }
            } catch (InterruptedException ie){
                System.out.println("Erro Thread Principal");
            }
        }
    }
}
