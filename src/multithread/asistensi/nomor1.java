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
  int a;
    int jumlah;
    
            int arr1[] = {6, 9, 1, 2, 3, 5};
            int arr2[] = {7, 11, 6, 4, 3, 1};
            int arr3[] = {5, 4, 3, 2, 1, 12};
    //int jumlah;

    public nomor1 (int a) {
        this.a = a;
    }
    public void run () {
        try {
            jumlah = arr1[a] + arr2[a] + arr3[a];
            System.out.println("Index ke : "+a+ " hasil : "+jumlah);
                Thread.sleep(1000);
     
        } catch (InterruptedException ex) {
            
    }

   
    }
    
     public static void main(String[] args) 
     {
        Thread t1 = new nomor1(0);
        Thread t2 = new nomor1(1);
        Thread t3 = new nomor1(2);
        Thread t4 = new nomor1(3);
        Thread t5 = new nomor1(4);
        Thread t6 = new nomor1(5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();   
    }
}

