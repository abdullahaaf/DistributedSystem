/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectSerialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LAB_TI
 */
public class tugasprak3app {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializationdemo demo = new serializationdemo();
        System.out.println("Masukkan nama awal, nama akhir, umur anda : ");
        List<tugasPrak3> participant = new ArrayList<tugasPrak3>();
        String a,b,c;
        try(BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))){
            for (;;){
                System.out.println("option : 1. Input\n2.Simpan\n3. Print\n4.Keluar");
                String option = dataIn.readLine();
                switch(option){
                    case "1":
                        System.out.println("Masukkan firstname");
                        a = dataIn.readLine();
                        System.out.println("Masukkan lastname");
                        b = dataIn.readLine();
                        System.out.println("Masuukkan Umur");
                        c = dataIn.readLine();
                        participant.add(new tugasPrak3(a, b, c));
                        System.out.println("Participant\t"+participant);
                        break;
                    case "2": demo.serialize(participant, "participant.ser");
                        break;
                    case "3": 
                        System.out.println("Deserialization :");
                        List<tugasPrak3> newlist = demo.deserialize("participant.ser");
                        System.out.println(newlist);
                        break;
                    case "4": System.exit(0);
                        break;
            }
        }
        }catch (IOException e )
        {
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
}
