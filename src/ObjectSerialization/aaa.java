/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectSerialization;
import java.io.*;
/**
 *
 * @author abdullahaaf
 */
public class aaa implements Serializable{
    private String nim;
    private String nama;
    private String jurusan;
    private String asal;
    
        public  aaa (String nim,String nama,String jurusan,String asal)
        {
            this.nim = nim;
            this.nama = nama;
            this.jurusan = jurusan;
            this.asal = asal;
        }

        
        public String getnim ()
        {
            return nim;
        }
        
        public String getnama()
        {
            return nama;
        }
        
        public String getjurusan()
        {
            return jurusan;
        }
        
        public String getasal()
        {
            return asal;
        }
        
        public void setnim (String nim)
        {
            this.nim = nim;
        }
        public void setnama (String nama)
        {
            this.nama = nama;
        }
        public void setjurusan (String jurusan)
        {
            this.jurusan = jurusan;
        }
        public void setasal (String asal)
        {
            this.asal = asal;
        }
        
        @Override
        public String toString()
        {
            return nama+" "+jurusan+" "+asal+" "+"("+nim+")";
        }
            
}
