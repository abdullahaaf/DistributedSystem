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

public class Terima extends Thread{
    

    public void run() {
        System.out.println("Angka genap sebanyak 10 kali");
           int angka;
            int tampung = 0;
            for (angka= 1; angka < 20; angka++) {
                if (angka % 2 == 0) {
                    System.out.println(angka);
                    tampung++;
                    if(tampung >=10){
                        break;
                    }
                }
            }
        

    }
    
    public static void main(String[] args) {
        Thread t1 = new Terima();
        t1.start();
    }
}

    

