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
public class PacketReceiveDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Packet Receive\n================");
        System.out.println("Binding to local port 2000");
        try
        {
            DatagramSocket socket = new DatagramSocket(2000);
            System.out.println("Bound to local port "+socket.getLocalPort());
            
            DatagramPacket packet = new DatagramPacket(new byte[256], 256);
            socket.receive(packet);
            System.out.println("Packet Received");
            
            InetAddress remote_addr = packet.getAddress();
            System.out.println("Sent by : "+remote_addr.getHostAddress());
            System.out.println("Sent from : "+packet.getPort());
            
            ByteArrayInputStream bin = new ByteArrayInputStream(packet.getData());
            BufferedReader br = new BufferedReader(new InputStreamReader(bin));
            System.out.println("Message : "+br.readLine());
        }catch (IOException ex)
        {
            ex.getMessage();
        }
    }
    
}
