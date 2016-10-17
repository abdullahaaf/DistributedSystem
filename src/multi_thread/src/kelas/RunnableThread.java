/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

/**
 *
 * @author ASUS
 */
public class RunnableThread implements Runnable{
    public void run(){
        System.out.println("I'm an instance of java.lang.Runnable interface");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable object");
        
        Runnable run = (Runnable) new RunnableThread();
        
        System.out.println("Creating first thread");
        Thread t1 = new Thread(run);
        
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        System.out.println("Starting both thread");
        t1.start();
        t2.start();
    }
}

    
