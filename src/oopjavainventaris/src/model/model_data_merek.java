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
public class model_data_merek
{
    public void tambahdata(String namaMerk) throws SQLException
    {
        try
        {
            String sql = "call insertdatamerk(?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namaMerk);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penyimpanan gagal");
            System.out.println(e);
        }
        
      
    }
    public void hapusdata(String namaMerk) throws SQLException
    {
        try
        {
            String sql = "call hapusdatamerk (?)";
            Connection con = (Connection)Koneksi.getKoneksi();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,namaMerk);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
        }catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "penghapusan gagal");
        }
        
       
    }
    
}
