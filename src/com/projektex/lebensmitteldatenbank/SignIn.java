/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektex.lebensmitteldatenbank;

import javax.swing.JOptionPane;

/**
 *
 * @author Cyril
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public SignIn() {
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

        jPanel2Unten = new javax.swing.JPanel();
        jPanel1Links = new javax.swing.JPanel();
        jLabel1UserIcon = new javax.swing.JLabel();
        jLabel1MembersLogin = new javax.swing.JLabel();
        jLabel2SignUp = new javax.swing.JLabel();
        jTextField1Username = new javax.swing.JTextField();
        jLabel3Username = new javax.swing.JLabel();
        jLabel3Password = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1SignUp = new javax.swing.JButton();
        jLabel2Already = new javax.swing.JLabel();
        jButton1Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");
        setUndecorated(true);
        setResizable(false);

        jPanel2Unten.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2Unten.setLayout(null);

        jPanel1Links.setBackground(new java.awt.Color(48, 100, 153));

        jLabel1UserIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyril\\Documents\\NetBeansProjects\\HMACProgEx\\src\\com\\projektex\\lebensmitteldatenbank\\imag\\LoginSignIn.png")); // NOI18N
        jLabel1UserIcon.setText("jLabel1");

        jLabel1MembersLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1MembersLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1MembersLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1MembersLogin.setText("Members Login");

        javax.swing.GroupLayout jPanel1LinksLayout = new javax.swing.GroupLayout(jPanel1Links);
        jPanel1Links.setLayout(jPanel1LinksLayout);
        jPanel1LinksLayout.setHorizontalGroup(
            jPanel1LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1LinksLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1LinksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1MembersLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1LinksLayout.setVerticalGroup(
            jPanel1LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1LinksLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1MembersLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2Unten.add(jPanel1Links);
        jPanel1Links.setBounds(0, 0, 300, 391);

        jLabel2SignUp.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2SignUp.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2SignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2SignUp.setText("Sign in");
        jPanel2Unten.add(jLabel2SignUp);
        jLabel2SignUp.setBounds(390, 40, 140, 50);

        jTextField1Username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField1Username.setForeground(new java.awt.Color(1, 51, 51));
        jTextField1Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 51, 51)));
        jTextField1Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1UsernameActionPerformed(evt);
            }
        });
        jPanel2Unten.add(jTextField1Username);
        jTextField1Username.setBounds(340, 140, 230, 30);

        jLabel3Username.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3Username.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3Username.setText("Password");
        jPanel2Unten.add(jLabel3Username);
        jLabel3Username.setBounds(340, 210, 90, 14);

        jLabel3Password.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3Password.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3Password.setText("Username");
        jPanel2Unten.add(jLabel3Password);
        jLabel3Password.setBounds(340, 120, 90, 16);

        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(1, 51, 51));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 51, 51)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2Unten.add(jPasswordField1);
        jPasswordField1.setBounds(340, 230, 230, 30);

        jButton1SignUp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1SignUp.setText("Sign in");
        jButton1SignUp.setBorder(null);
        jButton1SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SignUpActionPerformed(evt);
            }
        });
        jPanel2Unten.add(jButton1SignUp);
        jButton1SignUp.setBounds(480, 280, 90, 40);

        jLabel2Already.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2Already.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2Already.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2Already.setText("Already Member Register click here to Login");
        jLabel2Already.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2Unten.add(jLabel2Already);
        jLabel2Already.setBounds(340, 340, 240, 16);

        jButton1Cancel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Cancel.setText("Cancel");
        jButton1Cancel.setBorder(null);
        jButton1Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CancelActionPerformed(evt);
            }
        });
        jPanel2Unten.add(jButton1Cancel);
        jButton1Cancel.setBounds(340, 280, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2Unten, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2Unten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(601, 391));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1UsernameActionPerformed
       
    }//GEN-LAST:event_jTextField1UsernameActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
      
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SignUpActionPerformed
        String Passwort = jPasswordField1.getText();
        String Username = jTextField1Username.getText();
        if (Passwort.contains("admin") && Username.contains("admin")) {
            this.dispose();
            new AdminLebensmittel().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Type the password again!", "Wrong Password", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1SignUpActionPerformed

    private void jButton1CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1CancelActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *//*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cancel;
    private javax.swing.JButton jButton1SignUp;
    private javax.swing.JLabel jLabel1MembersLogin;
    private javax.swing.JLabel jLabel1UserIcon;
    private javax.swing.JLabel jLabel2Already;
    private javax.swing.JLabel jLabel2SignUp;
    private javax.swing.JLabel jLabel3Password;
    private javax.swing.JLabel jLabel3Username;
    private javax.swing.JPanel jPanel1Links;
    private javax.swing.JPanel jPanel2Unten;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1Username;
    // End of variables declaration//GEN-END:variables
}