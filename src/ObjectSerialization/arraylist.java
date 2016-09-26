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
public class arraylist implements Serializable {
    private final String firsname;
    private final String lastname;
    private int age;
 
    public arraylist(String firsname, String lastname, int age) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.age = age;
    }
    
    public String getFirstname()
    {
        return firsname;
    }
    public  String getLastname()
    {
        return lastname;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return firsname + " " + lastname + "("+age+")";
    }    
}
