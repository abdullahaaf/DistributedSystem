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
public class model_data_kondisi
{
    
    view.tambah_data_kondisi a = new view.tambah_data_kondisi();
    view.edit_data_kondisi b = new view.edit_data_kondisi();
    
    

    public void tambahdata(String jenisKondisi) throws SQLException
    {
        try
        {
            String sql = "call insertdatakondisi(?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, jenisKondisi);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penyimpanan gagal");
            System.out.println(e);
        }
        
      
    }
        public void ubahdata(String jenisKondisi) throws SQLException

    {
       try
       {
           String sql = "call ubahdatakondisi (?)";
           Connection con = (Connection)Koneksi.getKoneksi();
           PreparedStatement st = con.prepareStatement(sql);
           st.setString(1, jenisKondisi);
           st.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "berhasil disimpan");
       }catch (SQLException | HeadlessException e)
               {
                  
                   JOptionPane.showMessageDialog(null, "penyimpanan gagal");
               }
      
    }
    
    public void hapusdata(String jenisKondisi) throws SQLException
    {
        try
        {
            String sql = "call hapusdatakondisi (?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,jenisKondisi);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "penghapusan gagal");
            System.out.println(e);
        }
        
       
    }
    
}
