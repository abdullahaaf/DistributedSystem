/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udp;
import java.io.*;
import java.net.*;
/**
 *
 * @author LAB_TI
 */
public class PacketSendDemo {
    public static void main(String[] args) {
        System.out.println("Packet Send\n===========");
        String hostname = "localhost";
        
        System.out.println("Binding to local port");
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            DatagramSocket socket = new DatagramSocket();
            System.out.println("Bound to local port "+socket.getLocalPort());
            
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            System.out.println("Write your message here...");
            pout.print(data.readLine());
            
            byte[] barray = bout.toByteArray();
            DatagramPacket packet = new DatagramPacket(barray, barray.length);
            System.out.println("Looking up hostname : "+hostname);
            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as"+remote_addr.getHostAddress());
            
            packet.setAddress(remote_addr);
            packet.setPort(2000);
            socket.send(packet);
            
            System.out.println("Packet Send");
        }catch (SocketException e)
        {
            e.getMessage();
        }catch (IOException ex)
        {
            ex.getMessage();
        }
    }
}
