package interfaces;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class dependency extends javax.swing.JFrame {

    Calendar calendar = Calendar.getInstance();

    public dependency() {
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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icons/program_icon.png"));
        return retValue;
    }
    
    private java.sql.Time getTimeIn() {
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(cmbHourIn.getSelectedItem().toString()));
        calendar.set(Calendar.MINUTE, Integer.parseInt(cmbMinutesIn.getSelectedItem().toString()));
        calendar.set(Calendar.SECOND, 00);
        java.sql.Time time = new java.sql.Time(calendar.getTime().getTime());
        return time;
    }

    private java.sql.Time getTimeOut() {
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(cmbHourOut.getSelectedItem().toString()));
        calendar.set(Calendar.MINUTE, Integer.parseInt(cmbMinutesOut.getSelectedItem().toString()));
        calendar.set(Calendar.SECOND, 22);
        java.sql.Time time = new java.sql.Time(calendar.getTime().getTime());
        return time;
    }

    private String parseHours(java.sql.Time time) {
        return new SimpleDateFormat("HH").format(time.getTime());
    }

    private String parseMinutes(java.sql.Time time) {
        return new SimpleDateFormat("mm").format(time.getTime());
    }

    private boolean isEmpty() {
        return txtName.getText().isEmpty() || txtDir.getText().isEmpty()
                || txtPhoneNo.getText().isEmpty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        cmbMinutesIn = new javax.swing.JComboBox<>();
        cmbHourIn = new javax.swing.JComboBox<>();
        cmbHourOut = new javax.swing.JComboBox<>();
        cmbMinutesOut = new javax.swing.JComboBox<>();
        lblTo = new javax.swing.JLabel();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dependencias");
        setIconImage(getIconImage());
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setToolTipText("Nombre a buscar");
        txtSearch.setName("txtDependencia"); // NOI18N
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 12, 96, -1));

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

        lbl2.setText("Nombre de la dependencia:");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));

        lbl3.setText("Directivo:");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbl4.setText("Teléfono:");
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 183, -1, -1));

        lbl5.setText("Horario:");
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtName.setName("txtNombreDependencia"); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, -1));

        txtDir.setName("txtDirectivo"); // NOI18N
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 230, -1));

        txtPhoneNo.setName("txtNumero"); // NOI18N
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 160, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setToolTipText("Agregar");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setName("btnAgregar"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

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
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

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
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        cmbMinutesIn.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbMinutesIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutesIn.setToolTipText("Minutos");
        getContentPane().add(cmbMinutesIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 20));

        cmbHourIn.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbHourIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHourIn.setToolTipText("Hora");
        getContentPane().add(cmbHourIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 50, 20));

        cmbHourOut.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbHourOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHourOut.setToolTipText("Hora");
        getContentPane().add(cmbHourOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 60, 20));

        cmbMinutesOut.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbMinutesOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutesOut.setToolTipText("Minutos");
        getContentPane().add(cmbMinutesOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 50, 20));

        lblTo.setText("a");
        getContentPane().add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 40, 20));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

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
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT nombre, directivo, telefono, horario_entrada, horario_salida from "
                        + "Dependencies where nombre='" + txtSearch.getText() + "'");

                while (result.next()) {
                    txtName.setText(result.getString("nombre"));
                    txtDir.setText(result.getString("directivo"));
                    txtPhoneNo.setText(String.valueOf(result.getInt("telefono")));
                    cmbHourIn.setSelectedItem(parseHours(result.getTime("horario_entrada")));
                    cmbMinutesIn.setSelectedItem(parseMinutes(result.getTime("horario_entrada")));
                    cmbHourOut.setSelectedItem(parseHours(result.getTime("horario_salida")));
                    cmbMinutesOut.setSelectedItem(parseMinutes(result.getTime("horario_salida")));
                }

            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "La dependencia ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar el campo a buscar.", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() == false) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement insert = connection.prepareStatement("INSERT INTO Dependencies VALUES(?,?,?,?,?)");

                insert.setString(1, txtName.getText());
                insert.setString(2, txtDir.getText());
                insert.setInt(3, Integer.parseInt(txtPhoneNo.getText()));
                insert.setTime(4, getTimeIn());
                insert.setTime(5, getTimeOut());

                insert.executeUpdate();
                connection.close();
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "La dependencia ya existe.");
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
                PreparedStatement update = connection.prepareStatement("UPDATE Dependencies SET nombre = ?, directivo = ?, telefono = ?,"
                        + "horario_entrada = ?, horario_salida = ? where nombre = '" + txtSearch.getText() + "'");

                update.setString(1, txtName.getText());
                update.setString(2, txtDir.getText());
                update.setString(3, txtPhoneNo.getText());
                update.setTime(4, getTimeIn());
                update.setTime(5, getTimeOut());

                update.executeUpdate();
                connection.close();
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "La dependencia ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar. Intente de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error al modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void txtPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNoKeyTyped

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
            java.util.logging.Logger.getLogger(dependency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dependency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dependency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dependency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new dependency().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbHourIn;
    private javax.swing.JComboBox<String> cmbHourOut;
    private javax.swing.JComboBox<String> cmbMinutesIn;
    private javax.swing.JComboBox<String> cmbMinutesOut;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblTo;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
