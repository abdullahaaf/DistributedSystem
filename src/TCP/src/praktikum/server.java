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
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
    public static final int service=13;
    public static void main(String[] args) {
        try {
            String pesan;
            ServerSocket server=new ServerSocket(service);
            
            for(;;){
                Socket nextclient=server.accept();
            BufferedReader in=new BufferedReader(new InputStreamReader(nextclient.getInputStream()));
                                   
            System.out.println("pesan dari\t: "+nextclient.getInetAddress()+" "+nextclient.getPort());
            System.out.println("Pesan masuk\t: "+in.readLine());
                
            nextclient.close();
            }
            
        } catch (BindException e) {
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }

    static Socket accept() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
