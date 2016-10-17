/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asistensi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Rofiqo Fauzan F
 */
public class ServerDataMahasiswa {
    public static void main(String arg[]) throws Exception {

        System.out.println("Server is ready");
        ServerSocket serversoc = new ServerSocket(9);
        Socket clientsoc = serversoc.accept();
//        PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);
        OutputStream out = clientsoc.getOutputStream();
        PrintStream pout = new PrintStream(out);

        BufferedReader in = new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
        Vector list;

        System.out.println("check data list");
        try {
            FileInputStream fin = new FileInputStream("list1.out");
            ObjectInputStream oin = new ObjectInputStream(fin);

            try {
                Object obj = oin.readObject();
                list = (Vector) obj;
            } catch (ClassCastException oce) {
                list = new Vector();
            } catch (ClassNotFoundException cnfe) {
                list = new Vector();
            }
            fin.close();
        } catch (FileNotFoundException fnfe) {
            list = new Vector();
        }
        try {
            while (true) {
                String s, op = "";
                int i = 0, c = 0;
//                int[] a = null ;
                while (true) {

                    s = in.readLine();

                    if (s.equals("2")) {
                        pout.println(list.size());
                        for (Enumeration enu = list.elements(); enu.hasMoreElements();) {
                            pout.println(enu.nextElement().toString());
                        }
                    } else {
//                        a[i] = Integer.parseInt(s);
                        list.addElement(s);
                        FileOutputStream fout = new FileOutputStream("list1.out");
                        ObjectOutputStream oout = new ObjectOutputStream(fout);
                        oout.writeObject(list);
                        System.out.println(list);
                        i++;
                    }
                }
            }
        } catch (Exception e) {

            System.exit(0);
        }
    }
}
