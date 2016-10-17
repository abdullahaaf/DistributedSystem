/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

/**
 *
 * @author ASUS
 */

public class ThreadUtama {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Kirim();
        t1.start();
        
        Thread.sleep(1000);
        
        Thread t2 = new Terima();
        t2.start();
    }
}

    

