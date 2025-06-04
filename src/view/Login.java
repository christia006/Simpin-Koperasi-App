package view;

import aplikasi.simpin.component.PanelCover;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import view.Dashboard;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.DBUtil;

// author Team Simpin :Christian Hutahaean,Elkana Sitorus,Lola Tampubolon,Marshall Manurung,Ruth Manurung
public class Login extends javax.swing.JFrame {
           
    public Login() {
        initComponents();
         setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCover1 = new aplikasi.simpin.component.PanelCover();
        panelCover2 = new aplikasi.simpin.component.PanelCover();
        panelCover3 = new aplikasi.simpin.component.PanelCover();
        jPanel1 = new javax.swing.JPanel();
        roundedpanel1 = new aplikasi.simpin.component.roundedpanel();
        roundedpanel2 = new aplikasi.simpin.component.roundedpanel();
        roundedpanel3 = new aplikasi.simpin.component.roundedpanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLayeredPane();
        panelCover4 = new aplikasi.simpin.component.PanelCover();
        roundedpanel4 = new aplikasi.simpin.component.roundedpanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout panelCover1Layout = new javax.swing.GroupLayout(panelCover1);
        panelCover1.setLayout(panelCover1Layout);
        panelCover1Layout.setHorizontalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        panelCover1Layout.setVerticalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCover2Layout = new javax.swing.GroupLayout(panelCover2);
        panelCover2.setLayout(panelCover2Layout);
        panelCover2Layout.setHorizontalGroup(
            panelCover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        panelCover2Layout.setVerticalGroup(
            panelCover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCover3Layout = new javax.swing.GroupLayout(panelCover3);
        panelCover3.setLayout(panelCover3Layout);
        panelCover3Layout.setHorizontalGroup(
            panelCover3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        panelCover3Layout.setVerticalGroup(
            panelCover3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundedpanel1Layout = new javax.swing.GroupLayout(roundedpanel1);
        roundedpanel1.setLayout(roundedpanel1Layout);
        roundedpanel1Layout.setHorizontalGroup(
            roundedpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        roundedpanel1Layout.setVerticalGroup(
            roundedpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(roundedpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(roundedpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        roundedpanel2.setRoundBottomLeft(31);
        roundedpanel2.setRoundBottomright(31);
        roundedpanel2.setRoundTopLeft(31);
        roundedpanel2.setRoundTopRight(31);

        javax.swing.GroupLayout roundedpanel2Layout = new javax.swing.GroupLayout(roundedpanel2);
        roundedpanel2.setLayout(roundedpanel2Layout);
        roundedpanel2Layout.setHorizontalGroup(
            roundedpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        roundedpanel2Layout.setVerticalGroup(
            roundedpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        roundedpanel3.setRoundBottomLeft(35);
        roundedpanel3.setRoundBottomright(35);
        roundedpanel3.setRoundTopLeft(35);
        roundedpanel3.setRoundTopRight(35);

        javax.swing.GroupLayout roundedpanel3Layout = new javax.swing.GroupLayout(roundedpanel3);
        roundedpanel3.setLayout(roundedpanel3Layout);
        roundedpanel3Layout.setHorizontalGroup(
            roundedpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        roundedpanel3Layout.setVerticalGroup(
            roundedpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/simpin/assets/4204297701842cd2fd3ff741437361a1-transformed.png"))); // NOI18N

        jLabel7.setText("jLabel7");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Simpanan aman, Pinjaman cepat");

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 230, 207)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 121, 107));
        jLabel9.setText("Belum punya akun?");

        jButton2.setBackground(new java.awt.Color(0, 121, 107));
        jButton2.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setOpaque(true);

        panelCover4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedpanel4.setBackground(new java.awt.Color(255, 255, 255));
        roundedpanel4.setRoundBottomLeft(35);
        roundedpanel4.setRoundBottomright(35);
        roundedpanel4.setRoundTopLeft(35);
        roundedpanel4.setRoundTopRight(35);

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 121, 107));
        jLabel3.setText("Username");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 230, 207)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 121, 107));
        jLabel4.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 121, 107));
        jButton1.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 121, 107));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sign In");

        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(168, 230, 207)));

        javax.swing.GroupLayout roundedpanel4Layout = new javax.swing.GroupLayout(roundedpanel4);
        roundedpanel4.setLayout(roundedpanel4Layout);
        roundedpanel4Layout.setHorizontalGroup(
            roundedpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedpanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(roundedpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(roundedpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundedpanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        roundedpanel4Layout.setVerticalGroup(
            roundedpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedpanel4Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(roundedpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundedpanel4Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel8)
                    .addContainerGap(387, Short.MAX_VALUE)))
        );

        panelCover4.add(roundedpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 490));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/simpin/assets/rsz_8hpkyvzvi3gypfrliwwx--transformed.png"))); // NOI18N
        panelCover4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 100, 860, 430));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/simpin/assets/1-removebg-preview (3).png"))); // NOI18N
        panelCover4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        background.setLayer(panelCover4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCover4, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCover4, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text1 = jTextField1.getText().trim(); // Ambil username dari jTextField1
        String text2 = new String(jPasswordField1.getPassword()).trim(); // Ambil password dari jTextField2

    if (text1.isEmpty() && text2.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Mohon isi kolom yang kosong", "Peringatan", javax.swing.JOptionPane.INFORMATION_MESSAGE);
} else if (text1.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Kolom username masih kosong", "Peringatan", javax.swing.JOptionPane.INFORMATION_MESSAGE);
} else if (text2.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Kolom password masih kosong", "Peringatan", javax.swing.JOptionPane.INFORMATION_MESSAGE);
} else {
  
    if (text1.equals("Simpin") && text2.equals("123")) {
        // Proceed to the Dashboard
        this.setVisible(false);
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    } else {
        System.out.println("Input 1: " + text1);
        System.out.println("Input 2: " + text2);
        try {
            int loginStatus = checkLoginCredentials(text1, text2);
            switch (loginStatus) {
                case 1:
                    // Login successful
                    javax.swing.JOptionPane.showMessageDialog(this, "Login berhasil", "Selamat", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);
                    this.dispose();
                    break;
                case 2:
                    // Password incorrect
                    javax.swing.JOptionPane.showMessageDialog(this, "Password salah", "Peringatan", javax.swing.JOptionPane.ERROR_MESSAGE);
                    break;
                case 0:
                    // Username incorrect
                    javax.swing.JOptionPane.showMessageDialog(this, "Username salah", "Peringatan", javax.swing.JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } catch (SQLException e) {
            String errorMessage = e.getMessage().toLowerCase();

            if (errorMessage.contains("cannot connect") || errorMessage.contains("communications link failure") || errorMessage.contains("connection refused")) {
                // Koneksi ke database gagal
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Tidak dapat terhubung ke database.\nPastikan server database aktif .", 
                    "Error Koneksi Database", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                // Menampilkan pesan error lain jika bukan masalah koneksi
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Terjadi kesalahan saat mengecek login: " + e.getMessage(), 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private int checkLoginCredentials(String username, String password) throws SQLException {
    // Prepare the SQL query to check for the username and retrieve the password
    String query = "SELECT password FROM todos WHERE field5 = ?";
    try (PreparedStatement stmt = DBUtil.getConnection().prepareStatement(query)) {
        stmt.setString(1, username); // Set the username parameter

        try (ResultSet rs = stmt.executeQuery()) {
            // Check if the username exists in the database
            if (rs.next()) {
                String storedPassword = rs.getString("password"); // Retrieve the stored password
                // Return 1 if the password matches, otherwise return 2
                return password.equals(storedPassword) ? 1 : 2;
            } else {
                // Username not found
                return 0;
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private aplikasi.simpin.component.PanelCover panelCover1;
    private aplikasi.simpin.component.PanelCover panelCover2;
    private aplikasi.simpin.component.PanelCover panelCover3;
    private aplikasi.simpin.component.PanelCover panelCover4;
    private aplikasi.simpin.component.roundedpanel roundedpanel1;
    private aplikasi.simpin.component.roundedpanel roundedpanel2;
    private aplikasi.simpin.component.roundedpanel roundedpanel3;
    private aplikasi.simpin.component.roundedpanel roundedpanel4;
    // End of variables declaration//GEN-END:variables
}
