/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Koneksi;

/**
 *
 * @author blackhat
 */
public class edit_data_inventaris extends javax.swing.JFrame {

    
    /**
     * 
     * Creates new form tambah_data_inventaris
     */

    public edit_data_inventaris()  {
        initComponents();
    }
public void datakecbsupplier() throws SQLException
{
    try
    {
        Connection con = (Connection) Koneksi.getKoneksi();
        Statement st = con.createStatement();
        String sql = "select data_supplier.namaSupplier from data_supplier";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            cbsupplier.addItem(rs.getString("namaSupplier"));
        }
    }catch (SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void datakecbmerek() throws SQLException
{
    try
    {
        Connection con = (Connection) Koneksi.getKoneksi();
        Statement st = con.createStatement();
        String sql = "select merk_inventaris.namaMerk from merk_inventaris";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            cbmerek.addItem(rs.getString("namaMerk"));
        }
    }catch (SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void datakecbkategori()throws SQLException
{
    try
    {
        Connection con = (Connection) Koneksi.getKoneksi();
        Statement st = con.createStatement();
        String sql = "select kategori_inventaris.jenisKategori from kategori_inventaris";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            cbkategoriinventaris.addItem(rs.getString("jenisKategori"));
        }
    }catch (SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void datakecbkondisi()throws SQLException
{
    try
    {
        Connection con = (Connection) Koneksi.getKoneksi();
        Statement st = con.createStatement();
        String sql = "select kondisi_inventaris.jenisKondisi from kondisi_inventaris";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            cbkeadaan.addItem(rs.getString("jenisKondisi"));
        }
    }catch (SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnamainventaris = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbkategoriinventaris = new javax.swing.JComboBox();
        txtjumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbkeadaan = new javax.swing.JComboBox();
        btsimpan = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        try
        {
            Connection cn = (Connection) Koneksi.getKoneksi();
            String query = "SELECT namaSupplier from pemasok";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                cbsupplier.addItem(rs.getString((String)"namaSupplier"));
            }

            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
        }catch (Exception ex)
        {

        }
        cbsupplier = new javax.swing.JComboBox();
        cbmerek = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        cbcalendar = new org.freixas.jcalendar.JCalendarCombo();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Edit Data");

        jLabel2.setText("Nama Inventaris");

        txtnamainventaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamainventarisActionPerformed(evt);
            }
        });

        jLabel3.setText("Kategori");

        jLabel4.setText("Jumlah");

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        jLabel5.setText("Kondisi");

        btsimpan.setText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btbatal.setText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        jLabel6.setText("Supplier");

        cbsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbsupplierMouseClicked(evt);
            }
        });
        cbsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsupplierActionPerformed(evt);
            }
        });

        jLabel7.setText("Merek");

        jLabel8.setText("Type");

        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        jLabel9.setText("Tanggal Masuk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbkeadaan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbmerek, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnamainventaris)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbkategoriinventaris, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btsimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btbatal)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtnamainventaris, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cbcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbkategoriinventaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbmerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbkeadaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsimpan)
                    .addComponent(btbatal))
                .addGap(27, 27, 27))
        );

        setSize(new java.awt.Dimension(510, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtnamainventarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamainventarisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamainventarisActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
data_inventaris a = null;
        try {
            a = new data_inventaris();
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
a.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btbatalActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void cbsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsupplierActionPerformed
   
    }//GEN-LAST:event_cbsupplierActionPerformed

    private void cbsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbsupplierMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsupplierMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            datakecbsupplier();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            datakecbmerek();
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            datakecbkondisi();
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datakecbkategori();
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
model.model_data_inventaris a = new model.model_data_inventaris();
String inven = txtnamainventaris.getText();
String tanggal = (String) cbcalendar.getSelectedItem();
String supli = (String)cbsupplier.getSelectedItem();
String kate = (String)cbkategoriinventaris.getSelectedItem();
String merek = (String)cbmerek.getSelectedItem();
String kondis = (String)cbkeadaan.getSelectedItem();
String tipe = txttype.getText();
String jumla = txtjumlah.getText();

        try {
          a.ubahdata(inven, tanggal, supli, kate, merek, kondis, tipe, jumla);
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        try {
            new data_inventaris().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(edit_data_inventaris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edit_data_inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_data_inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_data_inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_data_inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                    new edit_data_inventaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btsimpan;
    private org.freixas.jcalendar.JCalendarCombo cbcalendar;
    public javax.swing.JComboBox cbkategoriinventaris;
    public javax.swing.JComboBox cbkeadaan;
    public javax.swing.JComboBox cbmerek;
    public javax.swing.JComboBox cbsupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnamainventaris;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
