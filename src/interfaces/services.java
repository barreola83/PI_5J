package interfaces;

import classes.ConnectionManager;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class services extends javax.swing.JFrame {

    TextAutoCompleter autocomplete;

    public services() {
        initComponents();
        formatJFrame();
        autocomplete = new TextAutoCompleter(txtSearch);
        autocomplete.setCaseSensitive(false);
        autocomplete.setMode(0);
        autocomplete.addItems(setServicesCompletion());
        btnModify.setEnabled(false);
    }

    private void formatJFrame() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar 
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame}
            this.pack();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.getMessage();
        }
    }

    private ArrayList setServicesCompletion() {
        try {
            ArrayList<Integer> noService = new ArrayList<>();
            Connection connection = ConnectionManager.getConnection();
            Statement select = connection.createStatement();
            ResultSet result = select.executeQuery("SELECT no_servicio from Services");

            while (result.next()) {
                noService.add(result.getInt("no_servicio"));
            }

            connection.close();
            return noService;
        } catch (SQLException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private boolean isEmpty() {
        return txtName.getText().isEmpty() || cmbCat.getSelectedIndex() == -1;
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

        lblName = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        cmbCat = new javax.swing.JComboBox<>();
        bntAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblService = new javax.swing.JLabel();
        lblNoService = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicios");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblName.setText("Nombre del servicio:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblCat.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblCat.setText("Categoría:");
        getContentPane().add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmbCat.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicios Técnicos", "Servicios al público", "Básico", "Periféricos", "Complementarios", "Otros" }));
        cmbCat.setToolTipText("Seleccionar...");
        getContentPane().add(cmbCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 330, -1));

        bntAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        bntAdd.setToolTipText("Agregar");
        bntAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bntAdd.setBorderPainted(false);
        bntAdd.setContentAreaFilled(false);
        bntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddActionPerformed(evt);
            }
        });
        getContentPane().add(bntAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

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
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        txtSearch.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtSearch.setToolTipText("Número de servicio");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, -1));

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
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, 30));

        lblService.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblService.setText("No. servicio:");
        getContentPane().add(lblService, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblNoService.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        getContentPane().add(lblNoService, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 40, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        txtName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 310, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isEmpty() == false) {
            try {
                Connection connection = ConnectionManager.getConnection();
                Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT no_servicio, nombre, categoria_servicio from Services where no_servicio ="
                        + Integer.parseInt(txtSearch.getText()));

                while (result.next()) {
                    txtName.setText(result.getString("nombre"));
                    cmbCat.setSelectedItem(result.getString("categoria_servicio"));
                    lblNoService.setText(String.valueOf(result.getInt("no_servicio")));
                }
                
                if(!result.first()){
                    JOptionPane.showMessageDialog(null, "No se encontró el servicio.");
                }

                btnModify.setEnabled(true);

                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un dato a buscar.", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (isEmpty() == false) {
            try {
                btnModify.setEnabled(true);
                Connection connection = ConnectionManager.getConnection();
                PreparedStatement update = connection.prepareStatement("UPDATE Services SET nombre = ?, categoria_servicio = ? where no_servicio = ?");
                update.setString(1, txtName.getText());
                update.setString(2, cmbCat.getSelectedItem().toString());
                update.setInt(3, Integer.parseInt(lblNoService.getText()));

                update.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Servicio modificado exitosamente.", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                txtName.setText("");
                cmbCat.setSelectedIndex(0);

                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la modificación. Intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo completar la modificación.", "Error al modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void bntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddActionPerformed
        if (isEmpty() == false) {
            try {
                try (Connection connection = ConnectionManager.getConnection();) {
                    PreparedStatement update = connection.prepareStatement("INSERT INTO Services VALUES(null, ?, ?)");

                    update.setString(1, txtName.getText());
                    update.setString(2, cmbCat.getSelectedItem().toString());

                    update.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Servicio añadido", "Servicio", JOptionPane.INFORMATION_MESSAGE);
                }

                txtName.setText("");
                cmbCat.setSelectedIndex(0);
            } catch (SQLException ex) {
                ex.getMessage();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo añadir.", "Error al añadir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bntAddActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearch.doClick();
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(services.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(services.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(services.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(services.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new services().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCat;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNoService;
    private javax.swing.JLabel lblService;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
