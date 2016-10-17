/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author vectorr
 */
public class Runnablethread implements Runnable {
    public void run()
    {
        System.out.println("I'am an instance of the java.lang.Runnable interface");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable project");
        
        Runnable run = (Runnable) new Runnablethread();
        
        System.out.println("Creating first thread");
        Thread t1 = new Thread(run);
        
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        System.out.println("Starting both threada");
        t1.start();
        t2.start();
    }
}
