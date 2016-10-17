/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author LAB_TI
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Client2 {

    /**
     * @param args the command line arguments
     */
    public static final int service=13;
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for(;;){
            String hostname="localhost";
            Socket client=new Socket(hostname,service);
            
            client.setSoTimeout(3000);
            String pesan;
           
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            
            OutputStream out=client.getOutputStream();
            PrintStream pout=new PrintStream(out);
            System.out.print("Masukan Pesan anda\t: ");
            pesan=in.readLine();
            pout.println(pesan+"\nOn\t: "+new java.util.Date()); 
            out.flush();
            out.close();  
            client.close();
            }
        } catch (Exception e) {
            System.out.println("error pada "+e.getMessage());
        }
    }
    
}
