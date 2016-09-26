/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectSerialization;
import java.io.*;
import java.util.List;
/**
 *
 * @author LAB_TI
 */
public class serializationdemo {
    public void serialize(List<tugasPrak3>pList, String filename)
    {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            ous.writeObject(pList);
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<tugasPrak3> deserialize(String filename) throws ClassNotFoundException
    {
        List<tugasPrak3>pList = null;
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename)))
        {
            pList = (List<tugasPrak3>) oos.readObject();
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return pList;
    }
}
