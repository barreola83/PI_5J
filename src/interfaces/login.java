package interfaces;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class login extends javax.swing.JFrame {

    public login() {
        try {
            initComponents();
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblHome = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnShow = new javax.swing.JButton();
        btnHide = new javax.swing.JButton();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio de sesión");
        setName("frmLogin"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setToolTipText("Ingresa el usuario");
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 172, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_right.png"))); // NOI18N
        btnLogin.setToolTipText("Iniciar sesión");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 52));

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        getContentPane().add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtPass.setToolTipText("Contraseña");
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, -1));

        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_open.png"))); // NOI18N
        btnShow.setToolTipText("Ver");
        btnShow.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnShow.setBorderPainted(false);
        btnShow.setContentAreaFilled(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        getContentPane().add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_close.png"))); // NOI18N
        btnHide.setToolTipText("Ocultar");
        btnHide.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHide.setBorderPainted(false);
        btnHide.setContentAreaFilled(false);
        btnHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHideActionPerformed(evt);
            }
        });
        getContentPane().add(btnHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.dispose();
        new main().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int dialogResult = JOptionPane.showConfirmDialog(null, "¿Salir del programa?", "Advertencia", JOptionPane.WARNING_MESSAGE);
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        txtPass.setEchoChar((char) 0);
        txtPass.requestFocus();
        btnHide.setVisible(true);
        btnShow.setVisible(false);
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHideActionPerformed
        txtPass.setEchoChar('*');
        txtPass.requestFocus();
        btnShow.setVisible(true);
        btnHide.setVisible(false);
    }//GEN-LAST:event_btnHideActionPerformed

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblHome;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
