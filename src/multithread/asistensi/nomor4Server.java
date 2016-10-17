/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.asistensi;

import java.io.*;
import java.net.*;

/**
 *
 * @author vectorr
 */
public class nomor4Server extends Thread{
    public static final int service_port = 13;
    
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
                        Socket nextclient = server.accept();
                        System.out.println("received request from "+nextclient.getInetAddress()+" : "
                        +nextclient.getPort());
                        
                        OutputStream ous = nextclient.getOutputStream();
                        PrintWriter pw = new PrintWriter(ous, true);
                        
                        String sendmessage = "Ahlan wa Sahlan, anda adalah pengunjung ke "+a;
                        pw.println(sendmessage);
                        
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
            Thread mulai = new nomor4Server();
            mulai.start();
            Thread.sleep(1000);
        }
}
