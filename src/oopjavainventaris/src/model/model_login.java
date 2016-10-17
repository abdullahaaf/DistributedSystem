/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Connection;
import view.dashboard;

/**
 *
 * @author blackhat
 */
public class model_login extends view.login{

    
    public void logina (String username, String password) throws SQLException
    {
        try
        {
            Connection con = (Connection)Koneksi.getKoneksi();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM admin where username = '"+username+"'";
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next())
            {
                if (password.equals(rs.getString("password")))
                {
                    JOptionPane.showMessageDialog(null, "login berhasil");
                    dashboard b = new dashboard();
                    b.setVisible(true);
                    dispose();
                }else
                {
                    JOptionPane.showMessageDialog(null, "login gagal");
                }
                
            }else
            {
                JOptionPane.showMessageDialog(null, "username dan password tidak ada");
            }
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
