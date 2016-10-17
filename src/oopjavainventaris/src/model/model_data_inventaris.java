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
public class model_data_inventaris
{
    public void tambahdata(String namaInventaris,String tanggalmasuk,String namaSupplier,String jenisKategori,String namaMerk,String jenisKondisi,String type,String jumlah) throws SQLException
    {
        try
        {
            String sql = "call insertdatainventaris(?,?,?,?,?,?,?,?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namaInventaris);
            st.setString(2, tanggalmasuk);
            st.setString(3, namaSupplier);
            st.setString(4, jenisKategori);
            st.setString(5, namaMerk);
            st.setString(6, jenisKondisi);
            st.setString(7, type);
            st.setString(8, jumlah);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penyimpanan gagal");
            System.out.println(e);
        }
        
      
    }
        public void ubahdata(String namaInventaris,String tanggalmasuk,String namaSupplier,String jenisKategori,String namaMerk,String jenisKondisi,String type,String jumlah) throws SQLException
    {
        try
        {
            String sql = "call editdatainventaris(?,?,?,?,?,?,?,?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namaInventaris);
            st.setString(2, tanggalmasuk);
            st.setString(3, namaSupplier);
            st.setString(4, jenisKategori);
            st.setString(5, namaMerk);
            st.setString(6, jenisKondisi);
            st.setString(7, type);
            st.setString(8,jumlah);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penyimpanan gagal");
            System.out.println(e);
        }
        
      
    }
    
    public void hapusdata(String namaInventaris) throws SQLException
    {
        try
        {
            String sql = "call hapusdatainventaris (?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,namaInventaris);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penghapusan gagal");
        }
        
       
    }
    
  
    
}
