/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDatagramProtocol;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author abdullahaaf
 */
public class TugasPraktikumClient {
    public static final int Servie_Port = 7;
    public static final int bufsize = 256;
    
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException, ClassNotFoundException {
        
        Vector list;
        serialisasi ser = new serialisasi();
        List<TugasPraktikumMethod> student = new ArrayList<TugasPraktikumMethod>();
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
        
            BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream put = new PrintStream(bout);
            
        //String a,b,c,d,e;
        
        try
       {
        for (;;)
        {
           
            System.out.println("Pilih menu di bawah ini");
            System.out.println("=========================");
            System.out.println("1. Input data");
            System.out.println("2. Update data");
            System.out.println("3. Hapus data");
            System.out.println("4. Print data");
            System.out.println("5. Exit");
            
            String pil = datain.readLine();
             switch (pil) {
                    case "1":
                        System.out.println("Masukkan nim");
                        String nim = datain.readLine();
                        list.addElement(nim);
                        DatagramPacket paket = new DatagramPacket(nim.getBytes(), nim.length(), addr, Servie_Port);
                        socket.send(paket);
                        System.out.println("Masukkan nama");
                        String nama = datain.readLine();
                        list.addElement(nama);
                        paket = new DatagramPacket(nama.getBytes(), nama.length(), addr, Servie_Port);
                        socket.send(paket);
                        System.out.println("Masukkan jurusan");
                        String jurusan = datain.readLine();
                        list.addElement(jurusan);
                        paket = new DatagramPacket(jurusan.getBytes(), jurusan.length(), addr, Servie_Port);
                        socket.send(paket);
                        System.out.println("Masukkan asal");
                        String asal = datain.readLine();
                        list.addElement(asal);
                        paket = new DatagramPacket(asal.getBytes(), asal.length(), addr, Servie_Port);
                        socket.send(paket);
                        student.add(new TugasPraktikumMethod(nim, nama, jurusan, asal));
                        System.out.println("Mahasiswa : " + student);
                        break;
                        
                    case "2":
                        //List<TugasPraktikumMethod> newlist = ser.deserialize("mahasiswa.txt");
                        TugasPraktikumMethod ab = student.get(0);
                        System.out.println("Masukkan nama");
                        ab.setNama(datain.readLine());
                        list.addElement(ab);
                        DatagramPacket packet = new DatagramPacket(ab.getNama().getBytes(), ab.getNama().length(), addr ,Servie_Port);
                        socket.send(packet);
                        System.out.println("Masukkan jurusan");
                        ab.setJurusan(datain.readLine());
                        list.addElement(ab);
                        packet = new DatagramPacket(ab.getJurusan().getBytes(), ab.getJurusan().length(), addr ,Servie_Port);
                        socket.send(packet);
                        System.out.println("Masukkan asal");
                        ab.setAsal(datain.readLine());
                        list.addElement(ab);
                        packet = new DatagramPacket(ab.getAsal().getBytes(), ab.getAsal().length(), addr ,Servie_Port);
                        socket.send(packet);
                        //System.out.println(participant);
                        student.remove(0);
                        student.add(ab);
                        break;
                        
                    case "3":
                        File file = new File("mahasiswa.txt");
                        if (file.delete()) {
                            System.out.println(file.getName() + "\tis deleted");
                        } else {
                            System.out.println("Delete failed");
                        }
                        break;
                        
                    case "4":
                    String pill = "4";
                    packet = new DatagramPacket(pil.getBytes(), pil.length(), addr, Servie_Port);
                    socket.send(packet);
                    byte[] recbuff = new byte[bufsize];
                    DatagramPacket receivePack = new DatagramPacket(recbuff, bufsize);
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
                        byte[] recbuf = new byte[bufsize];
                        DatagramPacket receivePacket = new DatagramPacket(recbuf, bufsize);
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
                    case "5":
                        System.exit(0);
                        break;
                }
            
        } 

    }catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
    }

