/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author blackhat
 */
public class model_data_kategori
{
    
    view.tambah_data_kategori a = new view.tambah_data_kategori();
    view.edit_data_kategori b = new view.edit_data_kategori();
    
    

    public void tambahdata(String jenisKategori) throws SQLException
    {
        try
        {
            String sql = "call insertdatakategori(?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, jenisKategori);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penyimpanan gagal");
            System.out.println(e);
        }
        
      
    }
        public void ubahdata(String jeniskategoriawal) throws SQLException

    {
       try
       {
           String sql = "call ubahdatakategori (?)";
           Connection con = (Connection)Koneksi.getKoneksi();
           PreparedStatement st = con.prepareStatement(sql);
           st.setString(1, jeniskategoriawal);
           st.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "berhasil disimpan");
       }catch (SQLException | HeadlessException e)
               {
                  
                   JOptionPane.showMessageDialog(null, "penyimpanan gagal");
               }
      
    }
    
    public void hapusdata(String jenisKondis) throws SQLException
    {
        try
        {
            String sql = "call hapusdatakategori (?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,jenisKondis);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penghapusan gagal");
        }
        
       
    }
    
}
