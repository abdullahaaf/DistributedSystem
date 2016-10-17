/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDatagramProtocol;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author abdullahaaf
 */
public class TugasPraktikumClient {
    public static final int Servie_Port = 7;
    public static final int bufsize = 256;
    
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException, ClassNotFoundException {
        Vector list;
        serialisasi demo = new serialisasi();
        
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
        
        for (;;)
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            
            System.out.println("Pilih menu di bawah ini");
            System.out.println("=========================");
            System.out.println("1. Input data");
            System.out.println("2. Update data");
            System.out.println("3. Hapus data");
            System.out.println("4. Print data");
            
            String pil = pilih.readLine();
            
           switch (pil) {
                    case "1":
                        System.out.println("Masukkan nim");
                        String nim = reader.readLine();
                        list.addElement(nim);
                        DatagramPacket packet = new DatagramPacket(nim.getBytes(),nim.length(), addr, Servie_Port);
                        socket.send(packet);
                        System.out.println("Masukkan nama");
                        String nama = reader.readLine();
                        list.addElement(nama);
                        packet = new DatagramPacket(nama.getBytes(),nama.length(), addr, Servie_Port);
                        socket.send(packet);
                        System.out.println("Masuukkan jurusan");
                        String jurusan = reader.readLine();
                        list.addElement(jurusan);
                        packet = new DatagramPacket(jurusan.getBytes(),jurusan.length(), addr, Servie_Port);
                        socket.send(packet);
                        System.out.println("Masukkan asal");
                        String asal = reader.readLine();
                        list.addElement(asal);
                        packet = new DatagramPacket(asal.getBytes(),asal.length(), addr, Servie_Port);
                        socket.send(packet);
//                        participant.add(new aaa(nim, nama,jurusan,asal));
//                        System.out.println("Participant\t" + participant);
                        break;

                    case "2":
                        List<TugasPraktikumMethod> newlist = demo.deserialize("participantis.txt");
                        aaa ab = newlist.get(0);
                        System.out.println("Masukkan nama");
                        ab.setnama(dataIn.readLine());
                        System.out.println("Masukkan jurusan");
                        ab.setjurusan(dataIn.readLine());
                        System.out.println("Masukkan asal");
                        ab.setasal(dataIn.readLine());
                        //System.out.println(participant);
                        participant.remove(0);
                        participant.add(ab);
                        break;
                    case "5":
                        System.out.println("Deserialization :");
                        participant = demo.deserialize("participantis.txt");
                        System.out.println(participant);
                        break;
                    case "6":
                        System.exit(0);
                        break;
                }
        }
    }
}
