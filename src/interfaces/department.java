package interfaces;

import classes.ConnectionManager;
import com.mxrck.autocompleter.TextAutoCompleter;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class department extends javax.swing.JFrame {

    Calendar calendar = Calendar.getInstance();
    TextAutoCompleter autocomplete;

    public department() {
        initComponents();
        formatJFrame();
        autocomplete = new TextAutoCompleter(txtSearch);
        autocomplete.setCaseSensitive(false);
        autocomplete.setMode(0);
        autocomplete.addItems(setDepartmentsCompletion());
    }

    private void formatJFrame() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            this.pack();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.getMessage();
        }
    }

    private ArrayList setDepartmentsCompletion() {
        try {
            Connection connection = ConnectionManager.getConnection();
            ArrayList<String> names = new ArrayList<>();
            Statement select = connection.createStatement();
            ResultSet result = select.executeQuery("SELECT nombre from Departments");

            while (result.next()) {
                names.add(result.getString("nombre"));
            }

            connection.close();
            return names;
        } catch (SQLException ex) {
            return null;
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
        return txtName.getText().isEmpty() || txtExt.getText().isEmpty()
                || txtCharge.getText().isEmpty();
    }

    private void cleanComponents() {
        txtCharge.setText("");
        txtExt.setText("");
        txtName.setText("");
        cmbHourIn.setSelectedIndex(0);
        cmbMinutesIn.setSelectedIndex(0);
        cmbHourOut.setSelectedIndex(0);
        cmbMinutesOut.setSelectedIndex(0);
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
        lblName = new javax.swing.JLabel();
        lblCharge = new javax.swing.JLabel();
        lblExt = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCharge = new javax.swing.JTextField();
        txtExt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        cmbHourIn = new javax.swing.JComboBox<>();
        cmbMinutesIn = new javax.swing.JComboBox<>();
        lblTo = new javax.swing.JLabel();
        cmbHourOut = new javax.swing.JComboBox<>();
        cmbMinutesOut = new javax.swing.JComboBox<>();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departamento");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(339, 298));
        setMinimumSize(new java.awt.Dimension(339, 298));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setToolTipText("Nombre a buscar");
        txtSearch.setName("txtDepartamento"); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 10, 120, -1));

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
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lblName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblName.setText("Nombre:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblCharge.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblCharge.setText("Encargado:");
        getContentPane().add(lblCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblExt.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblExt.setText("Extensión:");
        getContentPane().add(lblExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtName.setName("txtNombreDepartamento"); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, -1));

        txtCharge.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCharge.setName("txtEncargado"); // NOI18N
        getContentPane().add(txtCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 310, -1));

        txtExt.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtExt.setName("txtExtension"); // NOI18N
        txtExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExtKeyTyped(evt);
            }
        });
        getContentPane().add(txtExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, -1));

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
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

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
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

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
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        lbl5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl5.setText("Horario:");
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cmbHourIn.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        cmbHourIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHourIn.setToolTipText("Hora");
        getContentPane().add(cmbHourIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, -1));

        cmbMinutesIn.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        cmbMinutesIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutesIn.setToolTipText("Minutos");
        getContentPane().add(cmbMinutesIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 70, -1));

        lblTo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTo.setText("a");
        getContentPane().add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 40, 20));

        cmbHourOut.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        cmbHourOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHourOut.setToolTipText("Hora");
        getContentPane().add(cmbHourOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 80, -1));

        cmbMinutesOut.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        cmbMinutesOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutesOut.setToolTipText("Minutos");
        getContentPane().add(cmbMinutesOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 70, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() == false) {
            try {
                Connection connection = ConnectionManager.getConnection();PreparedStatement insert = connection.prepareStatement("INSERT INTO Departments VALUES(?,?,?,?,?)");

                insert.setString(1, txtName.getText());
                insert.setInt(2, Integer.parseInt(txtExt.getText()));
                insert.setString(3, txtCharge.getText());
                insert.setTime(4, getTimeIn());
                insert.setTime(5, getTimeOut());

                insert.executeUpdate();
                connection.close();

                JOptionPane.showMessageDialog(null, "Departamento añadido exitosamente.", "Añadir", JOptionPane.INFORMATION_MESSAGE);
                cleanComponents();
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "El departamento ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo añadir. Intente de nuevo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error al modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            new main().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isEmpty() == false) {
            try {
                Connection connection = ConnectionManager.getConnection();Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT nombre, extension, encargado, horarioIn, horarioOut"
                        + " from Departments where nombre = '" + txtSearch.getText() + "'");

                while (result.next()) {
                    txtName.setText(result.getString("nombre"));
                    txtExt.setText(String.valueOf(result.getInt("extension")));
                    txtCharge.setText(result.getString("encargado"));
                    cmbHourIn.setSelectedItem(parseHours(result.getTime("horarioIn")));
                    cmbMinutesIn.setSelectedItem(parseMinutes(result.getTime("horarioIn")));
                    cmbHourOut.setSelectedItem(parseHours(result.getTime("horarioOut")));
                    cmbMinutesOut.setSelectedItem(parseMinutes(result.getTime("horarioOut")));
                }

                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar el campo a buscar.", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (isEmpty() == false) {

            try {
                Connection connection = ConnectionManager.getConnection();PreparedStatement update = connection.prepareStatement("UPDATE Departments SET nombre = ?, extension = ?, encargado = ?, "
                        + "horarioIn = ?, horarioOut = ? where nombre = '" + txtSearch.getText() + "'");

                update.setString(1, txtName.getText());
                update.setInt(2, Integer.parseInt(txtExt.getText()));
                update.setString(3, txtCharge.getText());
                update.setTime(4, getTimeIn());
                update.setTime(5, getTimeOut());

                update.executeUpdate();
                connection.close();

                JOptionPane.showMessageDialog(null, "Departamento modificado exitosamente.", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                cleanComponents();
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "El departamento ya existe.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la modificación. Intente de nuevo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error al modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void txtExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExtKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtExtKeyTyped

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
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new department().setVisible(true);
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
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblCharge;
    private javax.swing.JLabel lblExt;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTo;
    private javax.swing.JTextField txtCharge;
    private javax.swing.JTextField txtExt;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
