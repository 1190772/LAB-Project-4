package eapli.base.agv.domain.model;

import eapli.base.Application;
import eapli.base.agv.application.AutomaticTaskController;

public class ThreadAutomaticTask extends Thread{
    Info it;


    private AutomaticTaskController atac = new AutomaticTaskController();

    public ThreadAutomaticTask(Info it) {
        this.it = it;
    }

    public void run(){
        int opcao = Application.settings().getAlgortihmOption2();
        if (opcao == 1){
            atac.atribuirTarefas1(it);
        }
        if (opcao == 2){
            atac.atribuirTarefas2(it);
        }
        System.out.println("Thread Terminada Com Sucesso!!");
    }
}
