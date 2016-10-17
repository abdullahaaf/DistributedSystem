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

public class tugas2 extends Thread {

    int i;

    public tugas2(int num) {
        i = num;
    }

    @Override
    public void run() {
        if (i == 1) {
            for (int a = 1; a <= 10; a++) {
                System.out.println("Pasien " + a + " diobati dokter");
            }
        }
        if (i == 2) {
            for (int a = 1; a <= 5; a++) {
                System.out.println("Perawat 1 merawat pasien " + a);
            }
        }
        if (i == 3) {
            for (int a = 6; a <= 10; a++) {
                System.out.println("Perawat 2 merawat pasien " + a);
            }
        }
        if (i == 4) {
            for (int a = 1; a <= 10; a++) {
                System.out.println("Pasien " + a + " membayar di kasir");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        for (int j = 1; j <= 4; j++) {
//            Thread rs = new tugas2(j);
//            rs.start();
//            Thread.sleep(1000);
//        }
        Thread rs = new tugas2(1);
            rs.start();
            Thread.sleep(100);

            Thread pr1 = new tugas2(2);
            pr1.start();
            Thread.sleep(100);

            Thread pr2 = new tugas2(3);
            pr2.start();
            Thread.sleep(100);

            Thread ps = new tugas2(4);
            ps.start();
           Thread.sleep(100);
    }
}

    

