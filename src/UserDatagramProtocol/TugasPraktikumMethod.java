/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDatagramProtocol;

import java.io.Serializable;

/**
 *
 * @author abdullahaaf
 */
public class TugasPraktikumMethod implements Serializable{
      String nim;
      String nama;
      String asal;
      String jurusan;
 
    public TugasPraktikumMethod(String nim, String nama, String asal, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
        this.jurusan = jurusan;
    }
    
    public String getNim()
    {
        return nim;
    }
    public  String getNama()
    {
        return nama;
    }
    
    public String getAsal()
    {
        return asal;
    }
    
    public String getJurusan()
    {
        return jurusan;
    }
    
    public void setNim(String nim)
    {
        this.nim = nim;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void setAsal(String asal)
    {
        this.asal = asal;
    }
    public void setJurusan(String jurusan)
    {
        this.jurusan = jurusan;
    }
    
    @Override
    public String toString()
    {
        return (nim)+ " "+nama+" "+jurusan+" "+asal ;
    }    

    


}
