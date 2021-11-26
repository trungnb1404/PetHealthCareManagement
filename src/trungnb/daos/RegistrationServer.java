/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungnb.daos;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class RegistrationServer {

    public static void main(String[] args) {
        String serviceName = "rmi://localhost:1098/RegistrationServerImp";
        RegistrationServerImp server;
        try {
            server = new RegistrationServerImp();
            LocateRegistry.createRegistry(1098);
            //register the name of service
            Naming.rebind(serviceName, server);
            System.out.println("You can start");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't connect with server");
        }
    }

}
