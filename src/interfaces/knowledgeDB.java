package interfaces;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
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

public class knowledgeDB extends javax.swing.JFrame {

    public knowledgeDB() {
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

    private boolean isEmpty() {
        return txtProblem.getText().isEmpty() || txtSolution.getText().isEmpty();
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
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtProblem = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        lblNoProblem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSolution = new javax.swing.JTextArea();
        btnReturn = new javax.swing.JButton();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de datos del conocimiento");
        setName("frmBD"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNo.setText("No. problema");
        getContentPane().add(lblNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 80, 20));

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl2.setText("Problema a resolver:");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl3.setText("Solución:");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.setToolTipText("Número de problema");
        txtSearch.setName("txtProblema"); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 118, -1));

        txtProblem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProblem.setToolTipText("");
        txtProblem.setName("txtResolver"); // NOI18N
        getContentPane().add(txtProblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom24.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setName("btnBuscar"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 40));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setToolTipText("Añadir");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setName("btnAgregar"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N
        btnModify.setToolTipText("Modificar");
        btnModify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModify.setBorderPainted(false);
        btnModify.setContentAreaFilled(false);
        btnModify.setName("btnModificar"); // NOI18N
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        lblNoProblem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNoProblem.setText("321");
        lblNoProblem.setName("lblNoProblema"); // NOI18N
        getContentPane().add(lblNoProblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 20));

        txtSolution.setColumns(20);
        txtSolution.setRows(5);
        jScrollPane1.setViewportView(txtSolution);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 240, 110));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 50, 50));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isEmpty() == false) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT no_problema, problema, solucion from BDCONOCIMIENTO "
                        + "where no_problema=" + Integer.parseInt(txtSearch.getText()));

                while (result.next()) {
                    lblNoProblem.setText(String.valueOf(result.getInt("no_problema")));
                    txtProblem.setText(result.getString("problema"));
                    txtSolution.setText(result.getString("solucion"));
                }

                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un dato a buscar.", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() == false) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement insert = connection.prepareStatement("INSERT INTO BDCONOCIMIENTO VALUES(null, ?, ?)");

                insert.setString(1, txtProblem.getText());
                insert.setString(2, txtSolution.getText());

                insert.executeUpdate();
                connection.close();
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "El problema ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo añadir. Intente de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error al modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (isEmpty() == false) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement update = connection.prepareStatement("UPDATE BDCONOCIMIENTO SET problema = ?, solucion = ? where no_problema = ?");

                update.setString(1, txtProblem.getText());
                update.setString(2, txtSolution.getText());
                update.setInt(3, Integer.parseInt(lblNoProblem.getText()));

                update.executeUpdate();
                connection.close();
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "El problema ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo añadir. Intente de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error al modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

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
            java.util.logging.Logger.getLogger(knowledgeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new knowledgeDB().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNoProblem;
    private javax.swing.JTextField txtProblem;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtSolution;
    // End of variables declaration//GEN-END:variables
}
