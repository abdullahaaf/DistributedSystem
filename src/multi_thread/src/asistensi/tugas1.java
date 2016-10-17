/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asistensi;

/**
 *
 * @author ASUS
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class tugas1 extends Thread {

    //int jumlah;

    public void run() {
        try {
            int arr1[] = {6, 9, 1, 2, 3, 5};
            int arr2[] = {7, 11, 6, 4, 3, 1};
            int arr3[] = {5, 4, 3, 2, 1, 12};
            
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("Thread "+ (i+1)
                        +": Penjumlahan Array Index " + i + " = " + (arr1[i] + arr2[i] + arr3[i]));
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(tugas1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new tugas1();
        t1.start();
    }
}

    

