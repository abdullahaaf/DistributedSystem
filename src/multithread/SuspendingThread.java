/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.IOException;

/**
 *
 * @author vectorr
 */
public class SuspendingThread extends Thread{
    public void run()
    {
        int count = 1;
        System.out.println("I cant count, watch me go");
        for(;;)
        {
            System.out.println(count++ + " ");
            try
            {
               Thread.sleep(500);
            }catch(InterruptedException ie)
            {
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter = new SuspendingThread();
        counter.start();
        
        System.out.println("Press any enter to suspend the thread counting");

        System.in.read();
        counter.suspend();
        
        System.out.println("Press any enter to resume the thread counting");
        System.in.read();
        counter.resume();
        
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        counter.stop();
    }
}
