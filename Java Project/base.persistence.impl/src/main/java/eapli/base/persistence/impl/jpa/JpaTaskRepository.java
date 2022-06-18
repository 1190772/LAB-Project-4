package eapli.base.persistence.impl.jpa;

import eapli.base.agv.domain.model.Task;
import eapli.base.agv.repositories.TaskRepository;
import eapli.base.order.domain.model.Order;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class JpaTaskRepository extends BasepaRepositoryBase<Task,String, String> implements TaskRepository {
    public JpaTaskRepository() {
        super("id");
    }


    @Override
    public Task TaskById(String id) {
        final TypedQuery<Task> query = entityManager().createQuery(
                "SELECT d FROM Task d WHERE id = :ID",
                Task.class);
        query.setParameter("ID", id);

        Task p = null;
        try{
            p= query.getSingleResult();
        }catch (NoResultException nre){
        }
        return p;
    }

    @Override
    public Task TaskByOrder(Order id) {
        final TypedQuery<Task> query = entityManager().createQuery(
                "SELECT d FROM Task d WHERE order.id = :ID",
                Task.class);
        query.setParameter("ID", id);

        Task p = null;
        try{
            p= query.getSingleResult();
        }catch (NoResultException nre){
        }
        return p;
    }
}
