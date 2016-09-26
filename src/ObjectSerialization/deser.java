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
 * @author abdullahaaf
 */
public class deser {
   public void serialize(List<aaa>pList, String filename)
    {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            ous.writeObject(pList);
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
   
   public List<aaa> deserialize(String filename) throws ClassNotFoundException
    {
        List<aaa>pList = null;
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename)))
        {
            pList = (List<aaa>) oos.readObject();
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return pList;
    }
}
