/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author vectorr
 */
public class ThreadUtama extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new kirimthread();
        t1.start();
        
        Thread.sleep(1000);
        
        Thread t2 = new terimathread();
        t2.start();
    }
}
