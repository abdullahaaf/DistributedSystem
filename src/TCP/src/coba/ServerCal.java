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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *

 */
public class ServerCal {
    public static void main(String args[]) throws IOException {
        // Register service on port 1254
        ServerSocket s = new ServerSocket(1251);
        Socket s1=s.accept(); // Wait and accept a connection
        // Get a communication stream associated with the socket
         
        InputStream s1In = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        int num1 = (dis.readInt());
        int num2 = (dis.readInt());
        String operation = (dis.readUTF());
        //String st = new String (dis.readUTF());
        int ans = 0;
        if (operation.equals("1") == true){
            ans = num1 + num2;
        }
        else if (operation.equals("2")){
            ans = num1 - num2;
        }else if(operation.equals("3")){
            ans = num1 * num2;
        }else if(operation.equals("4")){
            ans = num1 / num2;
        }
        //System.out.println(num1);
         
        OutputStream s1out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream (s1out);
        dos.writeUTF("Server Send "  + " " + ans); // Kirim data String ke Client
        // Close the connection, but not the server socket
        dos.close();
        s1out.close();
        s1.close();
    }
}
