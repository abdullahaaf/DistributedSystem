/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Koneksi;

/**
 *
 * @author blackhat
 */
public class data_kategori extends javax.swing.JFrame {

    /**
     * Creates new form data_kategori
     */
    public data_kategori() throws SQLException {
        initComponents();
        tampildata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkategori = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bthapus = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttambah.setText("Tambah Data");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        jLabel1.setText("Selamat Datang di Menu Data Inventaris");

        tabelkategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nama Kategori"
            }
        ));
        tabelkategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelkategoriMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelkategori);

        jLabel2.setText("Data Kategori Inventaris");

        bthapus.setText("Hapus");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bthapus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bttambah))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btback)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttambah, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btback)
                .addGap(8, 8, 8))
        );

        setSize(new java.awt.Dimension(686, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
        tambah_data_kategori c = new tambah_data_kategori();
        c.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bttambahActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
dashboard a = new dashboard();
a.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btbackActionPerformed

    private void tabelkategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkategoriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelkategoriMouseClicked

    private void tabelkategoriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkategoriMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelkategoriMousePressed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
int row = tabelkategori.getSelectedRow();
String nama = (String)tabelkategori.getValueAt(row, 0);
model.model_data_kategori mod = new model.model_data_kategori();
        try {
            mod.hapusdata(nama);
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(data_kategori.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setVisible(false);
        try {
            new data_kategori().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(data_kategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bthapusActionPerformed

    public void tampildata() throws SQLException
   {
       DefaultTableModel dtm;
       Connection con = (Connection)Koneksi.getKoneksi();
      try{
         Object [] rows={"Jenis Kategori"};
            dtm=new DefaultTableModel(null,rows);
            tabelkategori.setModel(dtm);
            tabelkategori.setBorder(null);
            int no = 1;
            String jenisKate = "";
            try{
              String sql="select kategori_inventaris.jenisKategori FROM kategori_inventaris";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(sql);
                while(rs.next()){
                   jenisKate=rs.getString("jenisKategori");

                    String [] tampil={jenisKate};
                    dtm.addRow(tampil);
                }
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Query Salah "+e);

            }
        }catch(Exception e){
            e.printStackTrace();

        }
   }
    
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
            java.util.logging.Logger.getLogger(data_kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new data_kategori().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(data_kategori.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton bttambah;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelkategori;
    // End of variables declaration//GEN-END:variables
}
