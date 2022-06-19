package eapli.base.agv.application;

import eapli.base.agv.domain.model.*;
import eapli.base.agv.repositories.AGVRepository;
import eapli.base.agv.repositories.TaskRepository;
import eapli.base.communications.Backoffice_AGVManagerClient;
import eapli.base.customer.PasswordGenerator.PasswordGenerator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.repositories.OrderRepository;

import java.io.IOException;

public class AssignTaskManualController {
    private final OrderRepository orderRepository = PersistenceContext.repositories().order();
    private final AGVRepository agvRepository = PersistenceContext.repositories().agv();
    private final TaskRepository taskRepository = PersistenceContext.repositories().tasks();


    public Iterable<Order> getTotalOrders() {
        return orderRepository.totalOrders();
    }

    public Iterable<AGV> getAvailableAgv() {
        //     System.out.println(agvRepository.agvById(2));
        return agvRepository.allActiveNotInUseAGV();
    }

    public void forceOrder(int agv, int order) {
        // System.out.println("Mocked: Task Updated.");
        String s = agv + " " + order;

        // System.out.println(agvRepository.agvById(1).getId() +" is the agv id 1 nice");

        try {
            Backoffice_AGVManagerClient client = new Backoffice_AGVManagerClient(13, s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Task createTask(String agvString, String orderString) {

        Long agvId = Long.valueOf(agvString);

//        System.out.println(agvRepository.agvById(Integer.parseInt(agvString)).getId());
//        System.out.println("Checkpoint 2");



        AGV agv = null;
        Order order = null;

        //NumericID orderId = new NumericID(Integer.parseInt(orderString));



        try {
        //    agv = agvRepository.findAGVById(agvId);
            System.out.println("acedeu ao repo de agvs");
        } catch (Exception e) {
            System.out.println("Error in AGV Repository: " + e.getMessage());
        }

       AGVStatus status = AGVStatus.OCCUPIED;

        try {
         //   Order orderID = new Order(Integer.parseInt(orderString));
         //   order = orderRepository.findOrderById(orderID);
            System.out.println("acedeu ao repo de orders");
        } catch (Exception e) {
            System.out.println("Error in Order repository" + e.getMessage());
        }
        //Delete previous task associated with the order on a different AGV
        //      taskRepository.delete(taskRepository.TaskByOrder(order.identity()));

        //Create new task associated with the order on the new AGV
        String id = PasswordGenerator.passwordGenerator();
        System.out.println("O id da task é :" + id);
        Task t1 = new Task(id,agv, order, Status.DOING, new Priority(0));
        //order.changeOrderStatus(OrderStatus.IN_RESOLUTION);
        //   orderRepository.save(order);
        taskRepository.save(t1);


        return t1;

    }

}