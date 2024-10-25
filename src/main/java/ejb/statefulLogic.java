/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package ejb;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author vishwa
 */
@Stateful
public class statefulLogic implements statefulLogicLocal {


   int i;
   
   @PostConstruct
   public void initialize()
   {
       i=0;
   }

    @Override
    public int increment() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return i++;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method") 
}