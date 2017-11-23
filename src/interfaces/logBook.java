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
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class logBook extends javax.swing.JFrame {

    Calendar calendar = Calendar.getInstance();

    public logBook() {
        initComponents();
        formatJFrame();
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
        calendar.set(Calendar.SECOND, 00);
        java.sql.Time time = new java.sql.Time(calendar.getTime().getTime());
        return time;
    }

    private boolean isEmpty() {
        return txtKmIn.getText().isEmpty() || txtKmIn.getText().isEmpty()
                || cmbGasIn.getSelectedIndex() == -1 || cmbGasOut.getSelectedIndex() == -1
                || cmbHourIn.getSelectedIndex() == -1 || cmbHourOut.getSelectedIndex() == -1
                || cmbMinutesIn.getSelectedIndex() == -1 || cmbMinutesOut.getSelectedIndex() == -1;
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icons/program_icon.png"));
        return retValue;
    }
    
    private void cleanComponents(){
        txtKmIn.setText("");
        txtKmOut.setText("");
        cmbGasIn.setSelectedIndex(0);
        cmbGasOut.setSelectedIndex(0);
        cmbHourOut.setSelectedIndex(0);
        cmbHourIn.setSelectedIndex(0);
        cmbMinutesOut.setSelectedIndex(0);
        cmbMinutesIn.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIn = new javax.swing.JLabel();
        cmbHourIn = new javax.swing.JComboBox<>();
        cmbMinutesIn = new javax.swing.JComboBox<>();
        lblOut = new javax.swing.JLabel();
        cmbHourOut = new javax.swing.JComboBox<>();
        cmbMinutesOut = new javax.swing.JComboBox<>();
        lblKmIn = new javax.swing.JLabel();
        lblKmOut = new javax.swing.JLabel();
        txtKmOut = new javax.swing.JTextField();
        txtKmIn = new javax.swing.JTextField();
        lblGasIn = new javax.swing.JLabel();
        lblGasOut = new javax.swing.JLabel();
        cmbGasIn = new javax.swing.JComboBox<>();
        cmbGasOut = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bitácora");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(310, 290));
        setMinimumSize(new java.awt.Dimension(310, 290));
        setPreferredSize(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIn.setText("Hora de entrada:");
        getContentPane().add(lblIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        cmbHourIn.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbHourIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHourIn.setToolTipText("Hora");
        getContentPane().add(cmbHourIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 50, 20));

        cmbMinutesIn.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbMinutesIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutesIn.setToolTipText("Minutos");
        getContentPane().add(cmbMinutesIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 50, 20));

        lblOut.setText("Hora de salida:");
        getContentPane().add(lblOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cmbHourOut.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbHourOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHourOut.setToolTipText("Hora");
        getContentPane().add(cmbHourOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 50, 20));

        cmbMinutesOut.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbMinutesOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutesOut.setToolTipText("Minutos");
        getContentPane().add(cmbMinutesOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 50, 20));

        lblKmIn.setText("Kilometraje de entrada:");
        getContentPane().add(lblKmIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblKmOut.setText("Kilometraje de salida:");
        getContentPane().add(lblKmOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtKmOut.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtKmOut.setToolTipText("Ingrese sólo números...");
        getContentPane().add(txtKmOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, -1));

        txtKmIn.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtKmIn.setToolTipText("Ingrese sólo números...");
        getContentPane().add(txtKmIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 100, -1));

        lblGasIn.setText("Nivel de gas de entrada:");
        getContentPane().add(lblGasIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblGasOut.setText("Nivel de gas de salida:");
        getContentPane().add(lblGasOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmbGasIn.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbGasIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/4", "1/2", "3/4", "Lleno" }));
        getContentPane().add(cmbGasIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        cmbGasOut.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbGasOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/4", "1/2", "3/4", "Lleno" }));
        getContentPane().add(cmbGasOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        txtSearch.setToolTipText("Número de registro");
        txtSearch.setName("txtRegistro"); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 87, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom24.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar");
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setName("btnBuscar"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 30, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        jLabel1.setToolTipText(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 350));

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
        String service = null;
        
        if (txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un dato a buscar", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                Statement select = connection.createStatement();
                ResultSet result = select.executeQuery("SELECT no_registro, hora_llegada, hora_salida, "
                        + "nivel_gas_llegada, nivel_gas_salida, kilometraje_salida, kilometraje_llegada"
                        + " from LogBook where no_registro ="
                        + Integer.parseInt(txtSearch.getText()));

                while (result.next()) {
                    service = "No. reg: " + result.getInt("no_registro");
                    service += "\n\nHora llegada: " + result.getTime("hora_llegada");
                    service += "\nHora salida: " + result.getTime("hora_salida");
                    service += "\nGas llegada: " + result.getString("nivel_gas_llegada");
                    service += "\nGas salida: " + result.getString("nivel_gas_salida");
                    service += "\nKilometraje llegada: " + result.getInt("kilometraje_llegada");
                    service += "\nKilometraje salida: " + result.getInt("kilometraje_salida");
                }

                JOptionPane.showMessageDialog(null, service, "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() == false) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement insert = connection.prepareStatement("INSERT INTO LogBook VALUES(null, ?,?,?,?,?,?)");

                insert.setTime(1, getTimeIn());
                insert.setTime(2, getTimeOut());
                insert.setString(3, String.valueOf(cmbGasIn.getSelectedItem()));
                insert.setString(4, String.valueOf(cmbGasOut.getSelectedItem()));
                insert.setInt(5, Integer.parseInt(txtKmIn.getText()));
                insert.setInt(6, Integer.parseInt(txtKmOut.getText()));

                insert.executeUpdate();
                connection.close();
                cleanComponents();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo añadir. Intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error al añadir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new logBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbGasIn;
    private javax.swing.JComboBox<String> cmbGasOut;
    private javax.swing.JComboBox<String> cmbHourIn;
    private javax.swing.JComboBox<String> cmbHourOut;
    private javax.swing.JComboBox<String> cmbMinutesIn;
    private javax.swing.JComboBox<String> cmbMinutesOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGasIn;
    private javax.swing.JLabel lblGasOut;
    private javax.swing.JLabel lblIn;
    private javax.swing.JLabel lblKmIn;
    private javax.swing.JLabel lblKmOut;
    private javax.swing.JLabel lblOut;
    private javax.swing.JTextField txtKmIn;
    private javax.swing.JTextField txtKmOut;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
