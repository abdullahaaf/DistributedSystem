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
public class InterruptThread extends Thread{
    public void run()
    {
        System.out.println("Iam sleepy, wake me in eight hours");
        try
        {
            Thread.sleep( 1000 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
        }catch(InterruptedException ie)
        {
            System.err.println("just five more minutes");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread sleepy = new InterruptThread();
        sleepy.start();
        
        System.out.println("press enter to interrupt thread");
        System.in.read();
        sleepy.interrupt(); 
    }
}
