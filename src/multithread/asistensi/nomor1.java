 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.asistensi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vectorr
 */
public class nomor1 extends Thread{
    public void run()
    {
        try
        {
            int[] arr1 = {6,9,1,2,3,5};
            int[] arr2 = {7,11,6,4,3,1};
            int[] arr3 = {5,4,3,2,1,11};
        
            for (int i = 0 ; i < arr1.length ; i++)
            {
                System.out.println("Thread "+(i + 1)
                +" Penjumlahan array index = "+i+" = " + (arr1[i] + arr2[i] + arr3[i]));
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex) {
            Logger.getLogger(nomor1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new nomor1();
        t1.start();
    }
}
