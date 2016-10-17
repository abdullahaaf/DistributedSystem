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
public class nomor4Client {
    public static final int service_port = 13;
        public static void main(String[] args) 
        {
            try
            {
                String hostname = "localhost";

                Socket daytime = new Socket(hostname, service_port);
                System.out.println("Connection Established");

                daytime.setSoTimeout(1000);

                BufferedReader reader = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
                System.out.println("Result : "+reader.readLine());
                daytime.close();
            }catch (IOException ioe)
            {
                System.err.println("error"+ ioe);
            }
        }
}
