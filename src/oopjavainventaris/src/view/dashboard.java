/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blackhat
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btinventaris = new javax.swing.JButton();
        btkategori = new javax.swing.JButton();
        btsupplier = new javax.swing.JButton();
        btmerek = new javax.swing.JButton();
        btkondisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btinventaris.setText("Data Inventaris");
        btinventaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinventarisActionPerformed(evt);
            }
        });

        btkategori.setText("Data Kategori");
        btkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkategoriActionPerformed(evt);
            }
        });

        btsupplier.setText("Data Supplier");
        btsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsupplierActionPerformed(evt);
            }
        });

        btmerek.setText("Data Merek");
        btmerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmerekActionPerformed(evt);
            }
        });

        btkondisi.setText("Data Kondisi");
        btkondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkondisiActionPerformed(evt);
            }
        });

        jLabel1.setText("Silahkan Pilih Menu Dibawah Ini !");

        btlogout.setText("Logout");
        btlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btkondisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmerek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btsupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btkategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btinventaris, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btlogout)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(btinventaris)
                .addGap(18, 18, 18)
                .addComponent(btkategori)
                .addGap(18, 18, 18)
                .addComponent(btsupplier)
                .addGap(18, 18, 18)
                .addComponent(btmerek)
                .addGap(18, 18, 18)
                .addComponent(btkondisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btlogout)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(407, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btinventarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinventarisActionPerformed
data_inventaris a = null;
        try {
            a = new data_inventaris();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
a.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btinventarisActionPerformed

    private void btkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkategoriActionPerformed
data_kategori b = null;
        try {
            b = new data_kategori();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
b.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btkategoriActionPerformed

    private void btsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsupplierActionPerformed
data_supplier c = null;
        try {
            c = new data_supplier();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
c.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btsupplierActionPerformed

    private void btmerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmerekActionPerformed
data_merek e = new data_merek();
e.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btmerekActionPerformed

    private void btkondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkondisiActionPerformed
data_kondisi f = new data_kondisi();
f.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btkondisiActionPerformed

    private void btlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogoutActionPerformed
login a = new login();
a.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btinventaris;
    private javax.swing.JButton btkategori;
    private javax.swing.JButton btkondisi;
    private javax.swing.JButton btlogout;
    private javax.swing.JButton btmerek;
    private javax.swing.JButton btsupplier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
