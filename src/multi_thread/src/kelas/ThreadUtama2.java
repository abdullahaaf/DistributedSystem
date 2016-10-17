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

public class ThreadUtama2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable run = (Runnable) new Kirim2();
        Thread t1 = new Thread(run);
        t1.start();
        
        Thread.sleep(1000);
        
        Runnable run2 = (Runnable) new Terima2();
        Thread t2 = new Thread(run2);
        t2.start();
    }
}

    
