/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectSerialization;
import java.io.*;
/**
 *
 * @author LAB_TI
 */
public class Participant implements Serializable{
    private String firstname;
    private String lastname;
    private int age;
    
    public Participant(String firstname, String lastname, int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
    public void printData()
    {
        System.out.println("Nama:\t"+firstname+"t"+lastname);
        System.out.println("Usia:\t"+age);
    }
    
    public void savedObject(Participant obj)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            fos.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void readobject (Participant obj) throws ClassNotFoundException
    {
        try
        {
            FileInputStream fis = new FileInputStream("data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (Participant)ois.readObject();
            obj.printData();
            fis.close();
        }catch (IOException a)
        {
            System.out.println(a.getMessage());
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        Participant b = new Participant("Abdullah", "Aaf", 19);
        b.savedObject(b);
        b.readobject(b);
    }
}
