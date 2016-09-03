/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Service;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Zaeem
 */
@Remote
public interface ServiceControllerRemote {

    void businessMethod();

    List<Service> getAllServices();
    
}
