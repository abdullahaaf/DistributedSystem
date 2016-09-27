/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDatagramProtocol;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/**
 *
 * @author abdullahaaf
 */
public class SimplePacketSend {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException{
        DatagramSocket socket = new DatagramSocket();
        String message = "Assalamualaikum";
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length()
                ,InetAddress.getLocalHost(),2000);
        socket.send(packet);
        socket.close();
    }
}
