/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpprak;

import java.io.*;
import java.net.*;
import java.util.*;
//import static tugas3.Contoh3_6.BUFSIZE;
//import static tugas3.Contoh3_6.SERVICE_PORT;

/**
 *
 * @author vector
 */
public class Client {

    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 256;

    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {

        Vector list;

        try {
            FileInputStream fis = new FileInputStream("mahasiswa.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                Object obj = ois.readObject();
                list = (Vector) obj;
            } catch (ClassCastException oce) {
                list = new Vector();
            } catch (ClassNotFoundException cnfe) {
                list = new Vector();
            }
            fis.close();
        } catch (FileNotFoundException fnfe) {
            list = new Vector();
        }

        String hostname = "localhost";
        InetAddress addr = null;
        addr = InetAddress.getByName(hostname);

        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(2000);

        BufferedReader pilih = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);

            System.out.println("Data Mahasiswa : ");
            System.out.println("1 Tambahkan Data");
            System.out.println("2 lihat data");
            System.out.println("3 Update data");
            System.out.println("4 keluar");
            System.out.println("pilih : ");
            String jawab = pilih.readLine();
            int choice = Integer.parseInt(jawab);
            switch (choice) {
                case 1:
                    System.out.println("Masukan NIM");
                    String nim = reader.readLine();
                    list.addElement(nim);
                    DatagramPacket packet = new DatagramPacket(nim.getBytes(), nim.length(), addr, SERVICE_PORT);
                    System.out.println("Sending packet to " + hostname);
                    socket.send(packet);
                    System.out.println("Masukan Nama");
                    String nama = reader.readLine();
                    list.addElement(nama);
                    packet = new DatagramPacket(nama.getBytes(), nama.length(), addr, SERVICE_PORT);
                    System.out.println("Sending packet to " + hostname);
                    socket.send(packet);
                    System.out.println("Masukan Jurusan");
                    String jurus = reader.readLine();
                    list.addElement(jurus);
                    packet = new DatagramPacket(jurus.getBytes(), jurus.length(), addr, SERVICE_PORT);
                    System.out.println("Sending packet to " + hostname);
                    socket.send(packet);
                    System.out.println("Masukan Asal");
                    String asal = reader.readLine();
                    list.addElement(asal);
                    packet = new DatagramPacket(asal.getBytes(), asal.length(), addr, SERVICE_PORT);
                    System.out.println("Sending packet to " + hostname);
                    socket.send(packet);
                    System.out.println("Data Tersimpan");
                    break;
                case 2:
                    String pil = "2";
                    packet = new DatagramPacket(pil.getBytes(), pil.length(), addr, SERVICE_PORT);
                    socket.send(packet);
                    byte[] recbuff = new byte[BUFSIZE];
                    DatagramPacket receivePack = new DatagramPacket(recbuff, BUFSIZE);
                    socket.receive(receivePack);
                    ByteArrayInputStream bin2 = new ByteArrayInputStream(receivePack.getData(), 0, receivePack.getLength());
                    BufferedReader reader3 = new BufferedReader(new InputStreamReader(bin2));
                    String batas = "";
                    for (;;) {
                        String line = reader3.readLine();
                        if (line == null) {
                            break;
                        } else {
                            batas = batas + line;
                        }
                    }
                    int size = Integer.parseInt(batas);
                    socket.send(packet);
                    System.out.println(size);
                    for (int i = 0; i < size; i++) {
                        byte[] recbuf = new byte[BUFSIZE];
                        DatagramPacket receivePacket = new DatagramPacket(recbuf, BUFSIZE);
                        boolean timeout = false;
                        try {
                            socket.receive(receivePacket);
                        } catch (InterruptedIOException e) {
                            timeout = true;
                        }
                        if (!timeout) {
                            ByteArrayInputStream bin = new ByteArrayInputStream(receivePacket.getData(), 0, receivePacket.getLength());
                            BufferedReader reader2 = new BufferedReader(new InputStreamReader(bin));
                            for (;;) {
                                String line = reader2.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    System.out.println(line);
                                }
                            }

                        } else {
                            break;
                        }
                    }
                    break;

                case 3 :
                    
                
                case 4:
                    System.exit(0);

            }

        }
    }
}
