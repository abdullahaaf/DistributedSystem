/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coba;

/**
 *

 */
import java.io.*;
import java.net.*;

public class ServerCalculator {
    public static final int port=2;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server Started . . . ");
            for(;;){
                Socket nextClient = server.accept();
                System.out.println("Received request from "+nextClient.getInetAddress()+" : "+nextClient.getLocalPort());
                OutputStream out = nextClient.getOutputStream();
            }
        } catch (Exception e) {
        }
        
    }
}
