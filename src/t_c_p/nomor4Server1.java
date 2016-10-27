/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_c_p;

import multithread.asistensi.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author vectorr
 */
public class nomor4Server1 extends Thread{
    public static final int service_port = 13;
    private DataInputStream is = null;
    private PrintStream os = null;
    private Socket nextclient = null;
    private String[] pengguna;
//        public nomor4Server1(Socket nextclient, nomor4Server1[] Clients)
//        {
//            this.nextclient = nextclient;
//            this.Clients = Clients;
//        }
    
        public void run()
        {
            try
            {
                    int a = 0;
                    ServerSocket server = new ServerSocket(service_port);
                    System.out.println("Koneksi server dimulai");
                    for(;;)
                    {
                        a++;
                        nextclient = server.accept();
                        //Socket nextclient = server.accept();
//                        System.out.println("received request from "+nextclient.getInetAddress()+" : "
//                        +nextclient.getPort());
                        
                        is = new DataInputStream(nextclient.getInputStream());
                        os = new PrintStream(nextclient.getOutputStream());
                        os.println("Masukkan nama anda");
                        String name = is.readLine().trim();
                        os.println("Selamat datang "+name+" ke chat room");
                        
                        
//                        OutputStream ous = nextclient.getOutputStream();
//                        PrintWriter pw = new PrintWriter(ous, true);
                        
                        //String sendmessage = "Ahlan wa Sahlan, anda adalah pengunjung ke "+a;
                        //pw.println(sendmessage);
                        
                        nextclient.close();
                    }
            }catch (BindException e)
            {
                System.err.println("Server already running on port "+e);
            }catch (IOException ioe)
            {
                System.err.println("I / O error "+ioe);
            }
        }
        
        public static void main(String[] args) throws InterruptedException 
        {
            Thread mulai = new nomor4Server1();
            mulai.start();
            Thread.sleep(1000);
        }
}
