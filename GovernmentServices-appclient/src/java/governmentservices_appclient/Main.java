/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package governmentservices_appclient;

import controller.ServiceControllerRemote;
import entitites.ServiceUser;
import javax.ejb.EJB;

/**
 *
 * @author Zaeem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @EJB
    private static ServiceControllerRemote service;

    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiceUser u = new ServiceUser();
        u.setLastName("lastName");
        u.setAddress("address");
        u.setFirstName("firstName");
        u.setPassword("password");
        u.setPhone("123123");
        u.setType(1); 
        u.setUserid(101);
        
        service.businessMethod();
        service.addUser(u);
        System.out.println("App client is up and running now");
    }

}
