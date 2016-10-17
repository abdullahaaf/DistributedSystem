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
import java.io.IOException;

public class tugas3 extends Thread {

    static boolean ganjil = false;
    static boolean berhenti = false;

    @Override
    public void run() {
        int count = 0;
        while (true) {
            count++;
            if (count % 2 == 0) {
                System.out.print(count + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                   
                }
            } else if (ganjil == true) {
                while (true) {
                    count--;
                    if (count % 2 == 1) {
                        System.out.print(count + " ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                           
                        }
                    } else if (berhenti == true) {
                        System.out.println("Counter selesai");
                        System.exit(0);
                    }
                }
            }
       }
    }

    public static void main(String[] args) throws IOException {
        Thread t = new tugas3();
        t.start();
        System.out.println("Tekan Enter untuk Bilangan Ganjil");
        System.in.read();
        ganjil = true;
        System.out.println("Tekan Enter Untuk Berhenti");
        System.in.read();
        berhenti = true;
    }
}

    

