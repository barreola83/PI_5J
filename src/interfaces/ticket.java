package interfaces;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ticket extends javax.swing.JFrame {

    private String status;

    public ticket() {
        initComponents();
        formatJFrame();
    }

    private void formatJFrame() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.getMessage();
        }
    }

    public java.sql.Date getDate() {
        Calendar calendar = Calendar.getInstance();
        java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
        return date;
    }

    public boolean isEmpty() {
        return !(txtDesc.getText().isEmpty() || txtEName.getText().isEmpty()
                || txtLocation.getText().isEmpty() || txtMotive.getText().isEmpty());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNo = new javax.swing.JLabel();
        lblNoTicket = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblMotive = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();
        txtMotive = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnClosed = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNo.setText("No. ticket");
        getContentPane().add(lblNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lblNoTicket.setText("321");
        getContentPane().add(lblNoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 12, -1, -1));

        lblName.setText("Nombre especialista:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 57, -1, -1));

        lblStatus.setText("Status:");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lblMotive.setText("Motivo:");
        getContentPane().add(lblMotive, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));

        lblLocation.setText("Ubicación:");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblDesc.setText("Descripción:");
        getContentPane().add(lblDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, -1, -1));
        getContentPane().add(txtEName, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 52, 160, -1));
        getContentPane().add(txtMotive, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 92, 260, -1));
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 132, 210, 70));
        getContentPane().add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 210, -1));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnCreate.setToolTipText("Crear");
        btnCreate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCreate.setBorderPainted(false);
        btnCreate.setContentAreaFilled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

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
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

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

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        status = "abierto";
        btnOpen.setVisible(false);
        btnClosed.setVisible(true);
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosedActionPerformed
        status = "cerrado";
        btnClosed.setVisible(false);
        btnOpen.setVisible(true);
    }//GEN-LAST:event_btnClosedActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (isEmpty()) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement insert = null;

                insert = connection.prepareStatement("INSERT INTO Ticket" + " VALUES(null,?,?,?,?,?,?)");
                insert.setString(1, txtEName.getText());
                insert.setString(2, txtDesc.getText());
                insert.setString(3, txtMotive.getText());
                insert.setDate(4, getDate());
                insert.setString(5, status);
                insert.setString(6, txtLocation.getText());
                insert.executeUpdate();
                insert.close();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error al añadir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

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

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ticket().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClosed;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnReturn;
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
    // End of variables declaration//GEN-END:variables
}
