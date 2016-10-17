/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 */
public class ClientDataMahasiswa {

    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        Socket clientsoc = new Socket(hostname, 9);
        System.out.println("Enter the input");
        OutputStream out = clientsoc.getOutputStream();
        PrintStream pout = new PrintStream(out);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader pil = new BufferedReader(new InputStreamReader(System.in));
        String pilih;
        String userinput;
        try {
            while (true) {
                System.out.println("Input");
                do {
                    System.out.println("Pilihan\n1. Input Data Mahasiswa\n2. Tampilkan Data Mahasiswa \n3. keluar \n Masukkan Pilihan : ");
                    pilih = pil.readLine();
                    if (pilih.equals("1")) {
                        System.out.print("Masukkan NIM : ");
                        String nim = stdin.readLine();
                        pout.println(nim);
                        System.out.print("Masukkan Nama : ");
                        String nama = stdin.readLine();
                        pout.println(nama);
                        System.out.print("Masukkan Jurusan : ");
                        String jurusan = stdin.readLine();
                        pout.println(jurusan);
                        System.out.print("Masukkan Asal : ");
                        String asal = stdin.readLine();
                        pout.println(asal);
                        System.out.println("Data Tersimpan");
                    }
                    pout.println(pilih);
                    if (pilih.equals("3")) {
                        System.exit(0);
                    }
                } while (!pilih.equals("2"));
                String size = in.readLine();
                int z = Integer.parseInt(size);
                System.out.println("Data Mahasiswa");
                for (int i = 0; i < z; i++) {
                    System.out.print(in.readLine() + "  ");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
