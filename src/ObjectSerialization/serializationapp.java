/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectSerialization;
import java.util.*;
/**
 *
 * @author LAB_TI
 */
public class serializationapp {
    public static void main(String[] args) {
        List<arraylist> participant = new ArrayList<arraylist>();
        participant.add(new arraylist("Abdullah", "Aaf", 19));
        participant.add(new arraylist("Muhammad", "Nuh", 23));
        
        serializationdemo demo = new serializationdemo();
        demo.serialize(participant, "participant.ser");
        
        System.out.println("Participant" + participant);
    }
}
