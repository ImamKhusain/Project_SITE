/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CRUDAdmin extends javax.swing.JFrame {

    private void clearForm() {
        jTextFieldID.setText("");
        jTextFieldPertandingan.setText("");
        jTextFieldTanggal.setText("");
        jTextFieldJam.setText("");
        jTextFieldChannel.setText("");
    }
    public CRUDAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldJam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPertandingan = new javax.swing.JTextField();
        jTextFieldTanggal = new javax.swing.JTextField();
        jButtonCLEAR = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonADD = new javax.swing.JButton();
        jButtonUPDATE = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldChannel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        jLabel1.setText("FORM INPUT PERTANDINGAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel2.setText("Jam(09:00-selesai/09:00)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        jTextFieldJam.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jTextFieldJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJamActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 380, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jTextFieldID.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 380, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel4.setText("Pertandingan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel5.setText("Tanggal(YYYY-MM-DD)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jTextFieldPertandingan.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jPanel1.add(jTextFieldPertandingan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 380, -1));

        jTextFieldTanggal.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jPanel1.add(jTextFieldTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 380, -1));

        jButtonCLEAR.setBackground(new java.awt.Color(0, 0, 255));
        jButtonCLEAR.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jButtonCLEAR.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCLEAR.setText("CLEAR");
        jButtonCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLEARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 130, 40));

        jButtonDelete.setBackground(new java.awt.Color(0, 0, 255));
        jButtonDelete.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 130, 40));

        jButtonADD.setBackground(new java.awt.Color(0, 0, 255));
        jButtonADD.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jButtonADD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonADD.setText("ADD");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 130, 40));

        jButtonUPDATE.setBackground(new java.awt.Color(0, 0, 255));
        jButtonUPDATE.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jButtonUPDATE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUPDATE.setText("UPDATE");
        jButtonUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 130, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 255));
        jButton5.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("< BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 30));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel6.setText("Channel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jTextFieldChannel.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jPanel1.add(jTextFieldChannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 380, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEARActionPerformed
        // Mengosongkan semua inputan
    jTextFieldID.setText("");
    jTextFieldPertandingan.setText("");
    jTextFieldTanggal.setText("");
    jTextFieldChannel.setText("");
    jTextFieldJam.setText("");
    }//GEN-LAST:event_jButtonCLEARActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
    String id = jTextFieldID.getText().trim();
        String pertandingan = jTextFieldPertandingan.getText().trim();
        String tanggal = jTextFieldTanggal.getText().trim();
        String jam = jTextFieldJam.getText().trim();
        String channel = jTextFieldChannel.getText().trim();

        if (id.isEmpty() || pertandingan.isEmpty() || tanggal.isEmpty() || jam.isEmpty() || channel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!jam.matches("^[0-2][0-9]:[0-5][0-9](\\s*-\\s*selesai)?$")) {
            JOptionPane.showMessageDialog(this, "Format jam tidak valid. Contoh: 20:45 atau 20:45 - selesai", "Format Salah", JOptionPane.ERROR_MESSAGE);
            jTextFieldJam.requestFocus();
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pertandingan_db", "root", "")) {
            String sql = "INSERT INTO jadwal (id, pertandingan, tanggal, jam, channel) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, id);
                pst.setString(2, pertandingan);
                pst.setString(3, tanggal);
                pst.setString(4, jam);
                pst.setString(5, channel);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
                clearForm();
                new HomeAdmin().setVisible(true);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data:\n" + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUPDATEActionPerformed
            String id = jTextFieldID.getText().trim();
        String pertandingan = jTextFieldPertandingan.getText().trim();
        String tanggal = jTextFieldTanggal.getText().trim();
        String jam = jTextFieldJam.getText().trim();
        String channel = jTextFieldChannel.getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID tidak boleh kosong untuk update.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pertandingan_db", "root", "")) {
            String sql = "UPDATE jadwal SET pertandingan=?, tanggal=?, jam=?, channel=? WHERE id=?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, pertandingan);
                pst.setString(2, tanggal);
                pst.setString(3, jam);
                pst.setString(4, channel);
                pst.setString(5, id);
                int updated = pst.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
                    new HomeAdmin().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Data dengan ID tersebut tidak ditemukan.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memperbarui data:\n" + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonUPDATEActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String id = jTextFieldID.getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan ID yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah yakin ingin menghapus data dengan ID: " + id + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pertandingan_db", "root", "")) {
            String sql = "DELETE FROM jadwal WHERE id=?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, id);
                int deleted = pst.executeUpdate();
                if (deleted > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                    clearForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Data dengan ID tersebut tidak ditemukan.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data:\n" + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Kembali ke halaman sebelumnya atau tutup form
    new HomeAdmin().setVisible(true); // Menampilkan kembali halaman HomeAdmin
    dispose(); // Menutup halaman CRUDAdmin
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJamActionPerformed
    String jam = jTextFieldJam.getText().trim();

    // Cek apakah input tidak kosong
    if (jam.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Jam pertandingan tidak boleh kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        jTextFieldJam.requestFocus();
        return;
    }

    // Validasi format jam: "22.00" atau "22.00 - selesai"
    if (!jam.matches("^[0-2][0-9]\\.[0-5][0-9](\\s*-\\s*selesai)?$")) {
        JOptionPane.showMessageDialog(this, "Format jam tidak valid. Contoh: 22.00 atau 22.00 - selesai", "Format Salah", JOptionPane.ERROR_MESSAGE);
        jTextFieldJam.requestFocus();
        return;
    }

    // Jika lolos validasi
    System.out.println("Jam pertandingan valid: " + jam);
    }//GEN-LAST:event_jTextFieldJamActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonCLEAR;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldChannel;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldJam;
    private javax.swing.JTextField jTextFieldPertandingan;
    private javax.swing.JTextField jTextFieldTanggal;
    // End of variables declaration//GEN-END:variables
}