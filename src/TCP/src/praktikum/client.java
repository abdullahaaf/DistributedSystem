/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author ASUS
 */
public class client {
    public static final int SERVICE_PORT = 13;
    public static void main(String[] args) throws IOException {
        try {
                String hostname = "localhost";
                Socket daytime = new Socket(hostname, SERVICE_PORT);
                System.out.println("Connection established");
                
                daytime.setSoTimeout(3000);
                String pesanmasuk;
                String sendMessage;
                
                Socket nextClient = server.accept();
                System.out.println("Received message from : " +nextClient.getInetAddress());
                InputStream istream = nextClient.getInputStream();
                
                BufferedReader receiveRead = new BufferedReader(new InputStreamReader(System.in));
                pesanmasuk = receiveRead.readLine();
                System.out.println("pesan masuk " +pesanmasuk);
                
                OutputStream ostream = nextClient.getOutputStream();
                PrintWriter pwriter = new PrintWriter(ostream, true);
                if("assalamualaikum".equals(pesanmasuk)){
                    
                    sendMessage = "waalaikumsalam";
                    pwriter.println(sendMessage);
                } else {
                    sendMessage = pesanmasuk+ "juga";
                    pwriter.println(sendMessage);
                    
                }
                
                nextClient.close();
        } catch (IOException be) {
            System.out.println("Service already running on port "+SERVICE_PORT);
        }
    } 
    
}
