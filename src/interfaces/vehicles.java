package interfaces;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
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

public class vehicles extends javax.swing.JFrame {

    private String status;

    public vehicles() {
        initComponents();
        formatJFrame();
        btnModify.setEnabled(false);
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

    private boolean isEmpty() {
        return txtPlate.getText().isEmpty() || txtYear.getText().isEmpty()
                || txtBrand.getText().isEmpty() || status == null;
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icons/program_icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBrand = new javax.swing.JLabel();
        lblPlate = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtPlate = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        btnOff = new javax.swing.JButton();
        btnOn = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehículos");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBrand.setText("Marca:");
        getContentPane().add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, -1, -1));

        lblPlate.setText("Placas:");
        getContentPane().add(lblPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));

        lblYear.setText("Año:");
        getContentPane().add(lblYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, -1, -1));
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 145, 136, -1));
        getContentPane().add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 111, 136, -1));
        getContentPane().add(txtPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 77, 136, -1));

        lblStatus.setText("Status");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 199, -1, -1));

        btnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toggle_off32.png"))); // NOI18N
        btnOff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOff.setBorderPainted(false);
        btnOff.setContentAreaFilled(false);
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });
        getContentPane().add(btnOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        btnOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toggle_on32.png"))); // NOI18N
        btnOn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOn.setBorderPainted(false);
        btnOn.setContentAreaFilled(false);
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });
        getContentPane().add(btnOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        txtSearch.setToolTipText("Placas");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 10, 110, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom24.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar...");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 40, 40));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setToolTipText("Agregar");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N
        btnModify.setToolTipText("Modificar");
        btnModify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModify.setBorderPainted(false);
        btnModify.setContentAreaFilled(false);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

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
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        btnOn.setVisible(false);
        btnOff.setVisible(true);
        status = "cerrado";
    }//GEN-LAST:event_btnOnActionPerformed

    private void btnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffActionPerformed
        btnOn.setVisible(true);
        btnOff.setVisible(false);
        status = "abierto";
    }//GEN-LAST:event_btnOffActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() == false) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement insert = connection.prepareStatement("INSERT INTO Vehicles" + " VALUES(?, ?, ?, ?)");

                insert.setString(1, txtPlate.getText());
                insert.setString(2, status);
                insert.setString(3, txtBrand.getText());
                insert.setString(4, txtYear.getText());

                insert.executeUpdate();
                connection.close();
                JOptionPane.showMessageDialog(null, "Se añadió exitosamente.");
                
                txtBrand.setText("");
                txtPlate.setText("");
                txtSearch.setText("");
                txtYear.setText("");
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "El vehículo ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo añadir. Intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error al añadir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (isEmpty() == false) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement update = connection.prepareStatement("UPDATE Vehicles SET status = ?, model = ?, year = ? WHERE plates = ?");

                update.setString(1, status);
                update.setString(2, txtBrand.getText());
                update.setInt(3, Integer.valueOf(txtYear.getText()));
                update.setString(4, txtPlate.getText());

                update.executeUpdate();
                update.close();
                JOptionPane.showMessageDialog(null, "Se modificó exitosamente");
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "El vehículo ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar. Intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error al añadir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una placa a buscar.", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT plates, model, year, status FROM Vehicles WHERE plates = '" + txtSearch.getText() + "'");
                
                while (result.next()) {
                    txtPlate.setText(result.getString("plates"));
                    txtBrand.setText(result.getString("model"));
                    txtYear.setText(String.valueOf(result.getInt("year")));
                    status = result.getString("status");
                }

                if ("abierto".equals(status)) {
                    btnOn.setVisible(true);
                    btnOff.setVisible(false);
                } else {
                    btnOff.setVisible(true);
                    btnOn.setVisible(false);
                }

                btnModify.setEnabled(true);
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se encontró el vehículo");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            btnSearch.doClick();
    }//GEN-LAST:event_txtSearchKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new vehicles().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnOff;
    private javax.swing.JButton btnOn;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblPlate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtPlate;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
