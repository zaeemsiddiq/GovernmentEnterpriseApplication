/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entitites.ServiceUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Zaeem
 */
@Stateless
public class ServiceController implements ServiceControllerRemote {

    private EntityManager entityManager;
    private final EntityManagerFactory entityManagerFactory;

    @Override
    public void businessMethod() {
        System.out.println("Call db here:");

    }

    public ServiceController() {
        entityManagerFactory = Persistence.createEntityManagerFactory("GovernmentServices-commonPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void addUser(ServiceUser parameter) {
        System.out.println("Add user here:" + parameter.getAddress());
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            System.out.println("Inside try");
            entityManager.persist(parameter);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }

    }

}
