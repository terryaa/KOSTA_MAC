/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author younghoonkim
 */
public class Customer implements Runnable{
    
    private Car_MT car;
    public Customer(Car_MT car) {this.car=car;}

    @Override
    public void run() {
        String carName="";
        for(int i=0;i<20;i++){
            carName=car.getCar();
            Thread t=Thread.currentThread();
            carName=car.pop(t);
            try {
                Thread.sleep((int)(Math.random()*200));
            } catch (InterruptedException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}