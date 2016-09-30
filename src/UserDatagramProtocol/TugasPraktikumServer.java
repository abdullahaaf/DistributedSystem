/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDatagramProtocol;
import java.io.*;
import java.net.*;
/**
 *
 * @author abdullahaaf
 */
public class TugasPraktikumServer {
    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 4096;
    
    private DatagramSocket socket;
    
    public TugasPraktikumServer()
    {
        try
        {
            socket = new DatagramSocket(SERVICE_PORT);
            System.out.println("Server active on port "+socket.getLocalPort());
            
        }catch (Exception e)
        {
            e.getMessage();
        }
    }
    
    public void serviceClient()
    {
        byte[] buffer = new byte[BUFSIZE];
        for(;;)
        {
            try
            {
                DatagramPacket packet = new DatagramPacket(buffer, BUFSIZE);
            socket.receive(packet);
            
            System.out.println("Packet received from "
            +packet.getAddress() + ":"
            +packet.getPort()
            +"of length\t"+packet.getLength());
            
            socket.send(packet);
            }catch(IOException ioe)
            {
                ioe.getMessage();
            }
            
        }
    }
    
    public static void main(String[] args) {
        TugasPraktikumServer server = new TugasPraktikumServer();
        server.serviceClient();
    }
}
