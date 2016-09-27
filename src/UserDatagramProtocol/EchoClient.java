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
public class EchoClient {
    public static final int Servie_Port = 7;
    public static final int bufsize = 256;
    
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        String hostname = "localhost";
        InetAddress addr = InetAddress.getByName(hostname);
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(2000);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(;;)
        {
            System.out.println("Write your message here..");
            String write = br.readLine();
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream put = new PrintStream(bout);
            put.print(write);
            
            if(write.equals("exit"))
            {
                socket.close();
                System.exit(0);
            }
            
            byte[] barray = bout.toByteArray();
            DatagramPacket packet = new DatagramPacket(barray, barray.length, addr, Servie_Port);
            System.out.println("Sending packet to : "+hostname);
            socket.send(packet);
            
            System.out.println("Waiting for packet..");
            byte[] recbuf = new byte[bufsize];
            DatagramPacket receivepacket = new DatagramPacket(recbuf, bufsize);
            boolean timeout = false;
            
            try
            {
                socket.receive(receivepacket);
            }catch(InterruptedIOException ioe)
            {
                timeout = true;
            }
            if (!timeout)
            {
                System.out.println("Packet Received");
                System.out.println("Details " + receivepacket.getAddress());
                ByteArrayInputStream bin = new ByteArrayInputStream(
                receivepacket.getData(), 0,
                receivepacket.getLength());
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(bin));
                System.out.println(reader2.readLine());
            }else
            {
                System.out.println("Packet Lose");
            }
        }
    }
}
