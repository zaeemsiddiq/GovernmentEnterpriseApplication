/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Service;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Zaeem
 */
@Stateless
public class ServiceController implements ServiceControllerRemote {

    private static final String PERSISTENCE_UNIT = "GovernmentServices-commonPU";

    private final EntityManager entityManager;
    private final EntityManagerFactory entityManagerFactory;

    public ServiceController() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    @Override
    public void businessMethod() {
        System.out.println("test");
        System.out.println(this.entityManager.createNamedQuery(Service.GET_ALL).getResultList());
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Service> getAllServices() {
        return this.entityManager.createNamedQuery(Service.GET_ALL).getResultList();
    }
}
