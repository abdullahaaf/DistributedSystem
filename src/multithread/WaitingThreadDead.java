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
public class WaitingThreadDead extends Thread{
    public void run()
    {
        System.out.println("this thread feels a little ill...");
        
        try
        {
            Thread.sleep(5000);
        }catch (InterruptedException ie)
        {
            
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread dying = new WaitingThreadDead();
        dying.start();
        
        System.out.println("Waiting for thread death");
        dying.join();
        System.out.println("thread has died");
    }
}
