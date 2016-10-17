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
public class ExtendThread extends Thread{
    int threadNummber;
    
    public ExtendThread (int num)
    {
        threadNummber = num;
    }
    
    public void run()
    {
        System.out.println("i'm thread number "+threadNummber);
        try
        {
            Thread.sleep(5000);
        }catch(InterruptedException ie)
        {
            System.out.println(threadNummber + "is finished ");
        }
        
        System.out.println(threadNummber + " is finished");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating thread 1");
        Thread t1 = new ExtendThread(1);
        
        System.out.println("Creating thread 2");
        Thread t2 = new ExtendThread(2);
        
        t1.start();
        t2.start();
    }
}
