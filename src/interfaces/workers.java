package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class workers extends javax.swing.JFrame {

    private String status;
    Calendar calendar = Calendar.getInstance();

    //Documentation for JCalendar and components can be found here:
    //https://www.ssec.wisc.edu/mcidas/software/v/javadoc/1.4/edu/wisc/ssec/mcidasv/data/dateChooser/
    public workers() {
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
        if (jdcDate.getDate() != null) {
            Date date = jdcDate.getDate();
            java.sql.Date sDate = new java.sql.Date(date.getTime());
            return sDate;
        }

        return null;
    }

    public java.sql.Time getTimeIn() {
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(cmbHourIn.getSelectedItem().toString()));
        calendar.set(Calendar.MINUTE, Integer.parseInt(cmbMinutesIn.getSelectedItem().toString()));
        calendar.set(Calendar.SECOND, 00);
        java.sql.Time time = new java.sql.Time(calendar.getTime().getTime());
        return time;
    }

    public java.sql.Time getTimeOut() {
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(cmbHourOut.getSelectedItem().toString()));
        calendar.set(Calendar.MINUTE, Integer.parseInt(cmbMinutesOut.getSelectedItem().toString()));
        calendar.set(Calendar.SECOND, 22);
        java.sql.Time time = new java.sql.Time(calendar.getTime().getTime());
        return time;
    }

    public boolean confirmPassword() {
        if (txtPass.getPassword().length == 0 || txtConfirm.getPassword().length == 0) {
            return false;
        } else {
            return Arrays.equals(txtPass.getPassword(), txtConfirm.getPassword());
        }
    }

    public String getParsedName() {
        return txtName.getText() + " " + txtFLastName.getText() + " " + txtSLastName.getText();
    }

    public boolean isEmpty() {
        return !(txtName.getText().isEmpty() || txtArea.getText().isEmpty() || txtCharge.getText().isEmpty()
                || txtMail.getText().isEmpty() || txtPass.getPassword().length == 0 || txtConfirm.getPassword().length == 0);
    }

    public boolean valueDates() {
        return !(cmbHourIn.getSelectedIndex() > -1 || cmbHourOut.getSelectedIndex() > -1
                || cmbMinutesIn.getSelectedIndex() > -1 || cmbMinutesOut.getSelectedIndex() > -1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl11 = new javax.swing.JLabel();
        lblNoWorker = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSLastName = new javax.swing.JTextField();
        txtFLastName = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtCharge = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        cmbMinutesIn = new javax.swing.JComboBox<>();
        cmbHourIn = new javax.swing.JComboBox<>();
        cmbHourOut = new javax.swing.JComboBox<>();
        cmbMinutesOut = new javax.swing.JComboBox<>();
        btnOff = new javax.swing.JButton();
        btnOn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jdcDate = new com.toedter.calendar.JDateChooser();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajadores");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl11.setText("No. trabajador:");
        getContentPane().add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lblNoWorker.setText("321");
        getContentPane().add(lblNoWorker, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 12, -1, -1));

        lbl1.setText("Nombre:");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, -1, -1));

        lbl2.setText("Apellido paterno:");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        lbl5.setText("Cargo:");
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, -1, -1));

        lbl4.setText("Área:");
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, -1, -1));

        lbl3.setText("Apellido materno:");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 135, -1, -1));

        lbl6.setText("Horario de entrada:");
        getContentPane().add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lbl7.setText("Horario de salida:");
        getContentPane().add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lbl9.setText("Status:");
        getContentPane().add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        lbl10.setText("Constraseña:");
        getContentPane().add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        lbl8.setText("Correo:");
        getContentPane().add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        txtName.setText("Bryan");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, -1));

        txtSLastName.setText("Mur");
        getContentPane().add(txtSLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 130, 180, -1));

        txtFLastName.setText("Arr");
        getContentPane().add(txtFLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 96, 180, -1));

        txtArea.setText("area");
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 164, 140, -1));

        txtCharge.setText("cargo");
        txtCharge.setToolTipText("");
        getContentPane().add(txtCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 120, -1));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 180, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 160, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        cmbMinutesIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(cmbMinutesIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        cmbHourIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        getContentPane().add(cmbHourIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 40, -1));

        cmbHourOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        getContentPane().add(cmbHourOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 40, -1));

        cmbMinutesOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(cmbMinutesOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        btnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toggle_off32.png"))); // NOI18N
        btnOff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOff.setBorderPainted(false);
        btnOff.setContentAreaFilled(false);
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });
        getContentPane().add(btnOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        btnOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toggle_on32.png"))); // NOI18N
        btnOn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOn.setBorderPainted(false);
        btnOn.setContentAreaFilled(false);
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });
        getContentPane().add(btnOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel1.setText("Confirmar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));
        getContentPane().add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 170, -1));

        jLabel2.setText("Fecha nacimiento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jdcDate.setToolTipText("Seleccione una fecha...");
        jdcDate.setDateFormatString("dd/MM/yyyy");
        jdcDate.setMaximumSize(new java.awt.Dimension(122, 28));
        jdcDate.setMinimumSize(new java.awt.Dimension(122, 28));
        getContentPane().add(jdcDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 140, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffActionPerformed
        btnOn.setVisible(true);
        btnOff.setVisible(false);
        status = "abierto";
    }//GEN-LAST:event_btnOffActionPerformed

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        btnOn.setVisible(false);
        btnOff.setVisible(true);
        status = "cerrado";
    }//GEN-LAST:event_btnOnActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() || valueDates() || confirmPassword()) {
            try {
                DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
                PreparedStatement insert = connection.prepareStatement("INSERT INTO Workers" + " VALUES(null,?,?,?,?,?,?,?,?,?,?)");

                insert.setString(1, txtCharge.getText());
                insert.setString(2, getParsedName());
                insert.setString(3, txtMail.getText());
                insert.setInt(4, 5);
                insert.setString(5, status);
                insert.setString(6, txtArea.getText());
                insert.setTime(7, getTimeIn());
                insert.setString(8, String.valueOf(txtPass.getPassword()));
                insert.setTime(9, getTimeOut());
                insert.setDate(10, getDate());

                insert.executeUpdate();

                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los elementos del formulario.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new workers().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOff;
    private javax.swing.JButton btnOn;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbHourIn;
    private javax.swing.JComboBox<String> cmbHourOut;
    private javax.swing.JComboBox<String> cmbMinutesIn;
    private javax.swing.JComboBox<String> cmbMinutesOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JDateChooser jdcDate;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblNoWorker;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCharge;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtFLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSLastName;
    // End of variables declaration//GEN-END:variables
}
