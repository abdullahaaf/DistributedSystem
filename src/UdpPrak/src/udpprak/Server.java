/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpprak;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author vector
 */
public class Server {

    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 4096;
    private DatagramSocket socket;

    public Server() {
        try {
            socket = new DatagramSocket(SERVICE_PORT);
            System.out.println("Server active on port " + socket.getLocalPort());
        } catch (Exception e) {
            System.err.println("Unable to bind port");
        }
    }

    public void serviceClients() throws IOException {
        Vector list;

        System.out.println("check data");
        try {
            FileInputStream fis = new FileInputStream("mahasiswa.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                Object obj = ois.readObject();
                list = (Vector) obj;
            } catch (ClassCastException oce) {
                list = new Vector();
            } catch (ClassNotFoundException cnf) {
                list = new Vector();
            }
            fis.close();
        } catch (FileNotFoundException fnfe) {
            list = new Vector();
        }

        byte[] buffer = new byte[BUFSIZE];
        for (;;) {
            try {
                DatagramPacket packet = new DatagramPacket(buffer, BUFSIZE);

                socket.receive(packet);
                System.out.println("Packet received from "
                        + packet.getAddress() + ":"
                        + packet.getPort() + " of length " + packet.getLength());

                ByteArrayInputStream bin = new ByteArrayInputStream(packet.getData(), 0, packet.getLength());
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(bin));
                String kata = "";
                for (;;) {
                    String line = reader2.readLine();
                    if (line == null) {
                        break;
                    } else {
                        kata = kata + line;
//                        System.out.println(kata);
                    }
                }

                if (kata.equals("2")) {
                    String pil = "";
                    String size = String.valueOf(list.size());
                    packet.setData(size.getBytes());
                    socket.send(packet);
                    
                    
                    DatagramPacket packet2 = new DatagramPacket(buffer, BUFSIZE);
                    socket.receive(packet2);

                    for (Enumeration enu = list.elements(); enu.hasMoreElements();) {

                        packet.setData(enu.nextElement().toString().getBytes());
                        socket.send(packet);
                    }

               }
//else if (kata.equals("3")) {
//                    socket.send(packet);
//                } else {
//                    list.addElement(kata);
//                    FileOutputStream fout = new FileOutputStream("mahasiswa.txt");
//                    ObjectOutputStream oout = new ObjectOutputStream(fout);
//                    oout.writeObject(list);
//                    System.out.println(list);
//
//                    socket.send(packet);
//                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Server server = new Server();
        server.serviceClients();
    }
}
