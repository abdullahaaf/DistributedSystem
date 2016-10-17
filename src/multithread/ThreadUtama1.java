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
public class ThreadUtama1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable run = (Runnable) new kirimthread1();
        Thread t1 = new Thread(run);
        t1.start();
        
        Thread.sleep(1000);
            
        Runnable run2 = (Runnable) new terimathread1();
        Thread t2 = new Thread(run2);
        t2.start();
    }
}
