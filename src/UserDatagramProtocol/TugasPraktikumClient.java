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
/**
 *
 * @author abdullahaaf
 */
public class TugasPraktikumClient {
    public static final int Servie_Port = 7;
    public static final int bufsize = 256;
    
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        String hostname = "localhost";
        InetAddress addr = InetAddress.getByName(hostname);
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(2000);
        
        List<TugasPraktikumMethod> student = new ArrayList<TugasPraktikumMethod>();
        serialisasi demo = new serialisasi();
        String a,b,c,d,e;
        try(BufferedReader datain = new BufferedReader(new InputStreamReader(System.in)))
        {
            for(;;){
                System.out.println("Silahkan Pilih : \n1.Input\2.Update\n3.Simpan\n4.Hapus\n5.Print\n6.ketik keluar untuk keluar");
                String option = datain.readLine();
                switch(option){
                    case "1" :
                        System.out.println("masukkan nim :");
                        a = datain.readLine();
                        System.out.println("masukkan nama :");
                        b = datain.readLine();
                        System.out.println("masukkan asal :");
                        c = datain.readLine();
                        System.out.println("masukkan jurusan :");
                        d = datain.readLine();
                        student.add(new TugasPraktikumMethod(a, b, c, d));
                        System.out.println("mahasiswa : "+student);
                        
                        break;
                        
                     case "2" :
                         List<TugasPraktikumMethod> newlist = demo.deserialize("mahasiswa.txt");
                         TugasPraktikumMethod up = newlist.get(0);
                         System.out.println("masukkan nama :");
                         up.setNama(datain.readLine());
                         System.out.println("masukkan asal :");
                         up.setAsal(datain.readLine());
                         System.out.println("masukkan jurusan :");
                         up.setJurusan(datain.readLine());
                         student.remove(0);
                         student.add(up);
                         break;
                         
                     case "3" :
                         demo.serialize(student,"mahasiswa.txt");
                         break;
                         
                     case "4" :
                         File ehm = new File("mahasiswa.txt");
                         if (ehm.delete())
                         {
                             System.out.println("Hapus sukses");
                         }
                         break;
                         
                     case "5" :
                         student = demo.deserialize("mahasiswa.txt");
                         break;
                         
                     case  "6":
                         String kel = datain.readLine();
                         if (kel.equals("exit"))
                         {
                             System.exit(0);
                             socket.close();
                         }
                         
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream put = new PrintStream(bout);
            int aa = Integer.parseInt(option);
            put.write(aa);
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
        }catch (Exception aa)
        {
           aa.getMessage();
        }
    }
}
