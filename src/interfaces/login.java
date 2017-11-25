package interfaces;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class login extends javax.swing.JFrame {

    private Font oFont;
    private String permission;
    private int noWorker;

    public login() {
        initComponents();
        formatJFrame();
    }

    private void formatJFrame() {
        try {
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            this.pack();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.getMessage();
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icons/program_icon.png"));
        return retValue;
    }

    private boolean validateUser() {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
            Statement select = connection.createStatement();
            ResultSet result = select.executeQuery("SELECT no_trabajador, cargo, contrasena FROM Workers WHERE no_trabajador="
                    + Integer.parseInt(txtUser.getText()) + " AND contrasena='" + new String(this.txtPass.getPassword()) + "'");
            while (result.next()) {
                noWorker = result.getInt("no_trabajador");
                permission = result.getString("cargo");
            }

            return result.first();
        } catch (SQLException ex) {
            return false;
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
        lblAddUser = new javax.swing.JLabel();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio de sesión");
        setIconImage(getIconImage());
        setName("frmLogin"); // NOI18N
        setPreferredSize(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setToolTipText("Ingresa el usuario");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 172, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_right.png"))); // NOI18N
        btnLogin.setToolTipText("Iniciar sesión");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setPreferredSize(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 52));

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        getContentPane().add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtPass.setToolTipText("Contraseña");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
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

        lblAddUser.setText("¡Regístrate aquí!");
        lblAddUser.setToolTipText("Registrarse");
        lblAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddUserMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddUserMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddUserMouseEntered(evt);
            }
        });
        getContentPane().add(lblAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            if (txtUser.getText().length() > 0 && txtPass.getPassword().length > 0) {
                if (validateUser()) {
                    if (permission.equals("Atención de usuarios")) {
                        new main().setVisible(true);
                        this.dispose();
                    } else if (permission.equals("Especialista")) {
                        new specialist_main(noWorker).setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña no son válidos.");
                    txtUser.setText("");
                    txtPass.setText("");

                    txtUser.requestFocusInWindow();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Compruebe que los datos sean correctos.");

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Compruebe que los datos sean correctos.");
        }
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

    private void lblAddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddUserMouseEntered
        lblAddUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        oFont = evt.getComponent().getFont();
        Map attributes = oFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(oFont.deriveFont(attributes));
    }//GEN-LAST:event_lblAddUserMouseEntered

    private void lblAddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddUserMouseExited
        lblAddUser.setCursor(Cursor.getDefaultCursor());
        evt.getComponent().setFont(oFont);
    }//GEN-LAST:event_lblAddUserMouseExited

    private void lblAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddUserMouseClicked
        new workers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAddUserMouseClicked

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtUserKeyPressed

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
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblHome;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
