/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DataLogin;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author L E N O V O
 */
public class BerandaPage extends javax.swing.JFrame {

    /**
     * Creates new
     */
    public BerandaPage() {
        super("Sistem Manajemen Perpustakaan");
        initComponents();
        namaUser.setText("Welcome, " + DataLogin.getNama_lengkap() + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        namaUser = new javax.swing.JLabel();
        navLogout = new javax.swing.JButton();
        navPengurus = new javax.swing.JButton();
        navHistory = new javax.swing.JButton();
        navBuku = new javax.swing.JButton();
        navSirkulasi = new javax.swing.JButton();
        navBeranda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 140));

        namaUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namaUser.setForeground(new java.awt.Color(255, 255, 255));
        namaUser.setText("Welcome, Nama Lengkap");

        navLogout.setBackground(new java.awt.Color(204, 204, 204));
        navLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        navLogout.setText("Logout");
        navLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navLogoutMouseExited(evt);
            }
        });
        navLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navLogoutActionPerformed(evt);
            }
        });

        navPengurus.setBackground(new java.awt.Color(204, 204, 204));
        navPengurus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        navPengurus.setText("Pengurus");
        navPengurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navPengurusActionPerformed(evt);
            }
        });

        navHistory.setBackground(new java.awt.Color(204, 204, 204));
        navHistory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        navHistory.setText("Retur");
        navHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navHistoryActionPerformed(evt);
            }
        });

        navBuku.setBackground(new java.awt.Color(204, 204, 204));
        navBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        navBuku.setText("Buku");
        navBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBukuActionPerformed(evt);
            }
        });

        navSirkulasi.setBackground(new java.awt.Color(204, 204, 204));
        navSirkulasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        navSirkulasi.setText("Peminjaman");
        navSirkulasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navSirkulasiActionPerformed(evt);
            }
        });

        navBeranda.setBackground(new java.awt.Color(212, 234, 247));
        navBeranda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        navBeranda.setText("Beranda");
        navBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBerandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(navBeranda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navSirkulasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navPengurus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navLogout)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navLogout)
                    .addComponent(namaUser)
                    .addComponent(navPengurus)
                    .addComponent(navHistory)
                    .addComponent(navBuku)
                    .addComponent(navSirkulasi)
                    .addComponent(navBeranda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo11.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(250, 250));
        jLabel2.setMinimumSize(new java.awt.Dimension(250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Artboard 1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBerandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navBerandaActionPerformed

    private void navSirkulasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navSirkulasiActionPerformed
        // TODO add your handling code here:
        PeminjamanPage sirkulasi = new PeminjamanPage();
        sirkulasi.setVisible(true);
        sirkulasi.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_navSirkulasiActionPerformed

    private void navBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBukuActionPerformed
        // TODO add your handling code here:
        BukuPage buku = new BukuPage();
        buku.setVisible(true);
        buku.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_navBukuActionPerformed

    private void navHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navHistoryActionPerformed
        // TODO add your handling code here:
        ReturPage history = new ReturPage();
        history.setVisible(true);
        history.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_navHistoryActionPerformed

    private void navPengurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navPengurusActionPerformed
        // TODO add your handling code here:
        PengurusPage pengurus = new PengurusPage();
        pengurus.setVisible(true);
        pengurus.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_navPengurusActionPerformed

    private void navLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navLogoutActionPerformed
        // TODO add your handling code here:
        LoginPage log = new LoginPage();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        DataLogin.clear();
        this.dispose();
        JOptionPane.showMessageDialog(log, "Anda Berhasil Logout");
    }//GEN-LAST:event_navLogoutActionPerformed

    private void navLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLogoutMouseExited
        // TODO add your handling code here:
        navLogout.setBackground(Color.decode("#cccccc"));
    }//GEN-LAST:event_navLogoutMouseExited

    private void navLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLogoutMouseEntered
        // TODO add your handling code here:
        navLogout.setBackground(Color.decode("#d4eaf7"));
    }//GEN-LAST:event_navLogoutMouseEntered

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
            java.util.logging.Logger.getLogger(BerandaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BerandaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BerandaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BerandaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BerandaPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel namaUser;
    private javax.swing.JButton navBeranda;
    private javax.swing.JButton navBuku;
    private javax.swing.JButton navHistory;
    private javax.swing.JButton navLogout;
    private javax.swing.JButton navPengurus;
    private javax.swing.JButton navSirkulasi;
    // End of variables declaration//GEN-END:variables

    public JLabel getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(JLabel namaUser) {
        this.namaUser = namaUser;
    }

}
