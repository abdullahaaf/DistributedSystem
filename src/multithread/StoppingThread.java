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
public class StoppingThread extends Thread
{
    public void run()
    {
        int count = 1;
        System.out.println("i cant count, watch me go");
        
        for(;;)
        {
            System.out.print(count++   + " ");
            try
            {
                Thread.sleep(500);
            }catch (InterruptedException ie)
            {
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter = new StoppingThread();
        counter.start();
        
        System.out.println("press any enter to stop the count");
        System.in.read();
        
        counter.stop();
    }
}
