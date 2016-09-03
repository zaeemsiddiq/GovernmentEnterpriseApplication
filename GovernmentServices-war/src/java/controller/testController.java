/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Zaeem
 */
@Named(value = "testController")
@SessionScoped
public class testController implements Serializable {

    @EJB
    private ServiceControllerRemote serviceController;

    /**
     * Creates a new instance of testController
     */
    public testController() {
        
    }
    
    public List<Service> test() {
        return serviceController.getAllServices();
    }
    
}
