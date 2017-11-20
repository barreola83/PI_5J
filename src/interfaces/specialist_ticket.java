package interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class specialist_ticket extends javax.swing.JFrame {

    private String status;

    public specialist_ticket(String form) {
        switch (form) {
            case "Ticket":
                initComponents();
                formatJFrame();
                btnUpdate.setVisible(true);
                btnUpdate.setEnabled(false);
                break;
            case "Search":
                initComponents();
                formatJFrame();
                btnUpdate.setVisible(false);
                break;
            case "":
                initComponents();
                formatJFrame();
                break;
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icons/program_icon.png"));
        return retValue;
    }

    private void formatJFrame() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            txtEName.setEnabled(false);
            txtDesc.setEnabled(false);
            txtLocation.setEnabled(false);
            txtMotive.setEnabled(false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.getMessage();
        }
    }

    private void changeVisibility(boolean open, boolean closed) {
        btnOpen.setVisible(open);
        btnClosed.setVisible(closed);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClosed = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        txtLocation = new javax.swing.JTextField();
        btnOpen = new javax.swing.JButton();
        lblLocation = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        lblMotive = new javax.swing.JLabel();
        txtMotive = new javax.swing.JTextField();
        lblNo = new javax.swing.JLabel();
        lblNoTicket = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtEName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket (Especialista)");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(340, 340));
        setMinimumSize(new java.awt.Dimension(340, 340));
        setPreferredSize(new java.awt.Dimension(340, 340));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClosed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_closed.png"))); // NOI18N
        btnClosed.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClosed.setBorderPainted(false);
        btnClosed.setContentAreaFilled(false);
        btnClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosedActionPerformed(evt);
            }
        });
        getContentPane().add(btnClosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setToolTipText("Regresar");
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));
        getContentPane().add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 210, -1));

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_open.png"))); // NOI18N
        btnOpen.setToolTipText("Abierto");
        btnOpen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOpen.setBorderPainted(false);
        btnOpen.setContentAreaFilled(false);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        lblLocation.setText("Ubicación:");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblStatus.setText("Status:");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 132, 210, 70));

        lblDesc.setText("Descripción:");
        getContentPane().add(lblDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, -1, -1));

        lblMotive.setText("Motivo:");
        getContentPane().add(lblMotive, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));
        getContentPane().add(txtMotive, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 92, 260, -1));

        lblNo.setText("No. ticket");
        getContentPane().add(lblNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));
        getContentPane().add(lblNoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 12, -1, 20));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom24.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 40, 40));

        txtSearch.setToolTipText("Número de ticket...");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 20));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update_version.png"))); // NOI18N
        btnUpdate.setToolTipText("Actualizar...");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 50, 50));
        getContentPane().add(txtEName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        lblName.setText("Nombre especialista:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            new specialist_main().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isEmpty() == false) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT * from "
                        + "Ticket where no_ticket=" + Integer.parseInt(txtSearch.getText()));

                while (result.next()) {
                    txtEName.setText(result.getString("nombre_especialista"));
                    lblNoTicket.setText(String.valueOf(result.getInt("no_ticket")));
                    txtDesc.setText(result.getString("descripcion"));
                    txtMotive.setText(result.getString("motivo"));
                    status = result.getString("status");
                    txtLocation.setText(result.getString("ubicacion"));
                }

                if ("abierto".equals(status)) {
                    changeVisibility(true, false);
                } else {
                    changeVisibility(false, true);
                }

                btnUpdate.setEnabled(true);
            } catch (SQLException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo.");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosedActionPerformed
        status = "cerrado";
        changeVisibility(true, false);
    }//GEN-LAST:event_btnClosedActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        status = "abierto";
        changeVisibility(false, true);
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
            PreparedStatement update = connection.prepareStatement("UPDATE Ticket SET status = ? where no_ticket = ?");

            update.setString(1, status);
            update.setInt(2, Integer.parseInt(lblNoTicket.getText()));

            update.executeUpdate();
            connection.close();

            JOptionPane.showMessageDialog(null, "Estatus modificado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el estatus.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearch.doClick();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(specialist_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new specialist_ticket("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClosed;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMotive;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNoTicket;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMotive;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}