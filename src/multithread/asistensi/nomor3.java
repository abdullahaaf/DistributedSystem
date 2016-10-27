/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.asistensi;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vectorr
 */
public class nomor3 extends Thread{
int count = 0;
static boolean param =true;
    public void run() {
        System.out.println("I can count, Wath me go !");
        for (;;) {
            if(param){
            count++;
            if (count % 2 == 0) {
                System.out.print(count + " ");
            }
            }else{
                count--;
                if (count % 2 != 0) {
                System.out.print(count + " ");
            }
            }
            
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }
        }
        
    }

    public static void main(String[] args) throws java.io.IOException {
        Thread counter = new nomor3();
        nomor3 jalan = new nomor3();
        counter.start();

        System.out.println("Press any enter to Suspend the thread counting");
        System.in.read();
        counter.suspend();
        
        System.out.println("Press any enter to resume the thread counting");
        System.in.read();
        counter.resume();
        param = false;
        
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        counter.stop();
    }
}
