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

public class Kirim2 implements Runnable{
    int angka;
    public void run(){
        System.out.println("Angka ganjil sebanyak 10 kali");
        int tampung = 0;
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
    
//    public static void main(String[] args) {
//        Runnable run = (Runnable) new Kirim2();
//        Thread t1 = new Thread(run);
//        t1.start();
    }


