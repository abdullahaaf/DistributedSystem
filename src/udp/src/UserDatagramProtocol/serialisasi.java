/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDatagramProtocol;
import java.io.*;
import java.util.List;
/**
 *
 * @author abdullahaaf
 */
public class serialisasi {
    public void serialize(List<TugasPraktikumMethod>pList, String filename)
    {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            ous.writeObject(pList);
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
   
   public List<TugasPraktikumMethod> deserialize(String filename) throws ClassNotFoundException
    {
        List<TugasPraktikumMethod>pList = null;
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename)))
        {
            pList = (List<TugasPraktikumMethod>) oos.readObject();
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return pList;
    }
}
