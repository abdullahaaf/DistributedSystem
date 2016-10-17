/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Connection;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author blackhat
 */
public class model_data_supplier
{
    
    view.tambah_data_supplier a = new view.tambah_data_supplier();
    view.edit_data_supplier b = new view.edit_data_supplier();
    
    

    public void tambahdata(String namaSupplier, String alamat) throws SQLException
    {
        try
        {
            String sql = "call insertdatasupplier(?,?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namaSupplier);
            st.setString(2, alamat);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "penyimpanan gagal");
            System.out.println(e);
        }
        
      
    }
    
    public void ubahdata(String namasup,String alamat) throws SQLException
    {
       try
       {
           String sql = "call updatedatasupplier (?,?)";
           Connection con = (Connection)Koneksi.getKoneksi();
           PreparedStatement st = con.prepareStatement(sql);
           st.setString(1, namasup);
           st.setString(2, alamat);
           st.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "berhasil disimpan");
       }catch (Exception e)
               {
                  
                   JOptionPane.showMessageDialog(null, "penyimpanan gagal");
               }
      
    }
    
    public void hapusdata(String namasup) throws SQLException
    {
        try
        {
            String sql = "call deletedatasupplier (?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namasup);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "penghapusan gagal");
        }
        
       
    }
    
    
    
  
    
   
}
