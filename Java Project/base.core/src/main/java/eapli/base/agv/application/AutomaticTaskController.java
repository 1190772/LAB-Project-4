package eapli.base.agv.application;

import eapli.base.agv.domain.model.AGV;
import eapli.base.agv.domain.model.Priority;
import eapli.base.agv.domain.model.Status;
import eapli.base.agv.domain.model.Task;
import eapli.base.agv.repositories.AGVRepository;
import eapli.base.agv.repositories.TaskRepository;
import eapli.base.customer.PasswordGenerator.PasswordGenerator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;
import eapli.base.order.repositories.OrderRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutomaticTaskController {


    private final AGVRepository executorTarefasRepository = PersistenceContext.repositories().agv();
    private final TaskRepository taskRepository = PersistenceContext.repositories().tasks();
    private final OrderRepository orderRepository = PersistenceContext.repositories().order();


    public List<AGV> AvailableAGVs() { //Verificar se os robots tao ativos
        List<AGV> executores = (List<AGV>) executorTarefasRepository.allActiveAGV();
        List<AGV> usableAGVs = new ArrayList<>();
        for (AGV agv1 : executores) {
            if (agv1.isInUse()) {
                usableAGVs.add(agv1);
            }
        }
        Collections.sort(usableAGVs, new Comparator<AGV>() {
            @Override
            public int compare(AGV et1, AGV et2) {
                return (int) (et1.getId() - et2.getId());
            }
        });
        return usableAGVs;
    }


    public List<Order> OrderList() {
        List<Order> orders = (List<Order>) orderRepository.findAll();
        List<Order> orderList = new ArrayList<>();
        for (Order order : orders) {
            orderList.add(order);
            // order.changeOrderStatus(OrderStatus.BEING_PREPARED,);
        }
        return orderList;
    }

    public List<Order> fifo() {
        List<Order> ordersToDo = OrderList();
        Collections.sort(ordersToDo, new Comparator<Order>() {
            @Override
            public int compare(Order it1, Order it2) {
                return it1.getDate().compareTo(it2.getDate());
            }
        });
        return ordersToDo;
    }


    public List<Task> createTask() {
        List<Order> orderList = fifo();
        int i;
        List<AGV> agvList = AvailableAGVs();
        List<Task> taskList = new ArrayList<>();
        for (i = 0; i < orderList.size(); i++) {
            if (agvList.contains(i)) {
                String id = PasswordGenerator.passwordGenerator();
                Task t1 = new Task(id,agvList.get(i), orderList.get(i), Status.DOING, new Priority(0));
                orderList.get(i).changeStatus(OrderStatus.BEING_PREPARED);
                orderRepository.save(orderList.get(i));
                taskList.add(t1);
                taskRepository.save(t1);
            } else {
                for (int j = 0; j < agvList.size(); j++) {
                    String id = PasswordGenerator.passwordGenerator();
                    Task t2 = new Task(id,agvList.get(j), orderList.get(i), Status.NOT_STARTED, new Priority(0));
                    orderList.get(i).changeStatus(OrderStatus.BEING_PREPARED);
                    orderRepository.save(orderList.get(i));
                    taskList.add(t2);
                    taskRepository.save(t2);
                }
            }
        }


        return taskList;

    }

}
