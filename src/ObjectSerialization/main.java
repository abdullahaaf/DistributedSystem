/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectSerialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import sun.text.normalizer.RangeValueIterator;

/**
 *
 * @author abdullahaaf
 */
public class main {

    public static void main(String[] args) throws ClassNotFoundException {
        deser demo = new deser();
        System.out.println("Masukkan Nama, Jurusan, Asal, Nim anda : ");
        List<aaa> participant = new ArrayList<aaa>();
        String a, b, c, d;
        try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))) {
            for (;;) {
                System.out.println("option : 1. Input\n2.Simpan\n3Hapus\n4.Update\n5.Print\n6.Exit");
                String option = dataIn.readLine();
                switch (option) {
                    case "1":
                        System.out.println("Masukkan nim");
                        a = dataIn.readLine();
                        System.out.println("Masukkan nama");
                        b = dataIn.readLine();
                        System.out.println("Masuukkan jurusan");
                        c = dataIn.readLine();
                        System.out.println("Masukkan asal");
                        d = dataIn.readLine();
                        participant.add(new aaa(a, b, c, d));
                        System.out.println("Participant\t" + participant);
                        break;
                    case "2":
                        demo.serialize(participant, "participantis.txt");
                        break;
                    case "3":
                        File file = new File("participantis.txt");
                        if (file.delete()) {
                            System.out.println(file.getName() + "\tis deleted");
                        } else {
                            System.out.println("Delete failed");
                        }
                        break;

                    case "4":
                        List<aaa> newlist = demo.deserialize("participantis.txt");
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
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
