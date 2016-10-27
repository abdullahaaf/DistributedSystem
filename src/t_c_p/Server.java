/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_c_p;
import java.io.*;
import java.net.*;
import javax.swing.*;
/**
 *
 * @author vectorr
 */
public class Server extends Thread{
    private ServerSocket server = null;
    private static Socket client = null;
    private static final int service_port = 13;
    private DataInputStream is = null;
    private PrintStream os = null;
    private  static Server[] threads;
    
     public Server(Socket clientsocket, Server[] threads)
    {
        this.client = clientsocket;
        this.threads = threads;
    }
     
     public void run()
    {
        try
        {
            is = new DataInputStream(client.getInputStream());
            os = new PrintStream(client.getOutputStream());
            os.println("masukkan nama anda");
            String nama = is.readLine().trim();
            os.println("Selamat datang "+nama+" ke chat room.\n untuk keluar tekan quit\nuntuk input gambar tekan 1");
            int i = 0;
            for (;;)
            {
                i++;
//                if (threads[i] != null && threads[i] != this)
//                {
//                    threads[i].os.println("*** pengguna baru "+nama+" memasuki chat room");
//                }
                is.close();
                os.close();
                client.close();
            }
            
        }
        catch (IOException e)
        {
            
        }
    }
    
    public static void main(String[] args) {
        Socket clientsocket = ;
        Thread t1 = new Server(clientsocket, threads);
        t1.start();
    }   
}

