/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;


public class Kirim extends Thread {

    
    
    @Override
    public void run() {
        System.out.println("Angka ganjil sebanyak 10 kali");
           int tampung = 0;
           int angka;
            for (angka= 1; angka < 20; angka++) {
                if (angka % 2 == 1) {
                    System.out.println(angka);
                    tampung++;
                    if(tampung >=10){
                        break;
                    }
                }
            }
        

    }
    
    public static void main(String[] args) {
        Thread t1 = new Kirim();
        t1.start();
    }
}
