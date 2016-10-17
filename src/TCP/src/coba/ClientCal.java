/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coba;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class ClientCal {
    public static void main(String args[]) throws IOException {
        // Open your connection to a server, at port 1254
        Socket s1 = new Socket("localhost",1251);
        // Get an input file handle from the socket and read the input
        Scanner scanln = new Scanner(System.in);
         
        System.out.print("Angka Pertama: ");
        int num1 = scanln.nextInt();
         
        System.out.print("Angka Kedua: ");
        int num2 = scanln.nextInt();
         
        System.out.println("Pilih Operasi:\n1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian");
        String operation = scanln.next();
         
        OutputStream s1out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream (s1out);
        dos.writeInt(num1); //kirim ke server
        dos.writeInt(num2); //kirim ke server
        dos.writeUTF(operation);
        //dos.writeInt(operation);  //send to server6
         
         
        InputStream s1In = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        String st = new String (dis.readUTF());
         
        System.out.println("" + st);
        // When done, just close the connection and exit
        dis.close();
        s1In.close();
        s1.close();
    }
}
