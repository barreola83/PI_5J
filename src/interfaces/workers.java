package interfaces;

import classes.ConnectionManager;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class workers extends javax.swing.JFrame {

    private String status;
    private Calendar calendar = Calendar.getInstance();
    private boolean login;

    //Documentation for JCalendar and components can be found here:
    //https://www.ssec.wisc.edu/mcidas/software/v/javadoc/1.4/edu/wisc/ssec/mcidasv/data/dateChooser/
    public workers() {
        initComponents();
        formatJFrame();
    }

    public workers(boolean login) {
        initComponents();
        this.login = login;
        formatJFrame();
    }

    private void formatJFrame() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            jtpMain.add("Datos personales", jpnPersonalData);
            jtpMain.add("Datos laborales", jpnLaborData);
            jtpMain.add("Cuenta", jpnAccountData);
            this.pack();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    private java.sql.Date getDate() {
        if (jdcDate.getDate() != null) {
            Date date = jdcDate.getDate();
            java.sql.Date sDate = new java.sql.Date(date.getTime());
            return sDate;
        }

        return null;
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

    private boolean confirmPassword() {
        if (txtPass.getPassword().length < 8 || txtPass.getPassword().length > 16) {
            return false;
        } else if (txtConfirm.getPassword().length < 8 || txtConfirm.getPassword().length > 16) {
            return false;
        } else {
            return Arrays.equals(txtPass.getPassword(), txtConfirm.getPassword());
        }
    }

    private String getParsedName() {
        return txtName.getText() + " " + txtFLastName.getText() + " " + txtSLastName.getText();
    }

    private boolean isEmpty() {
        return !(txtName.getText().isEmpty() || txtArea.getText().isEmpty()
                || txtMail.getText().isEmpty() || txtPass.getPassword().length == 0 || txtConfirm.getPassword().length == 0);
    }

    private boolean valueTime() {
        return !(cmbHourIn.getSelectedIndex() > -1 || cmbHourOut.getSelectedIndex() > -1
                || cmbMinutesIn.getSelectedIndex() > -1 || cmbMinutesOut.getSelectedIndex() > -1);
    }

    private int getNoWorker() {
        try {
            Connection connection = ConnectionManager.getConnection();
            Statement select = connection.createStatement();
            ResultSet result = select.executeQuery("select no_trabajador from Workers order by no_trabajador desc limit 1");
            
            return result.getInt("no_trabajador");
            
            
        } catch (SQLException ex) {}
        return -1;
    }

    private void cleanComponents() {
        txtArea.setText("");
        txtConfirm.setText("");
        txtFLastName.setText("");
        txtMail.setText("");
        txtName.setText("");
        txtPass.setText("");
        txtSLastName.setText("");
        cmbCharge.setSelectedIndex(0);
        cmbHourIn.setSelectedIndex(0);
        cmbHourOut.setSelectedIndex(0);
        cmbMinutesIn.setSelectedIndex(0);
        cmbMinutesOut.setSelectedIndex(0);
        jdcDate.setDate(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jtpMain = new javax.swing.JTabbedPane();
        jpnPersonalData = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSLastName = new javax.swing.JTextField();
        txtFLastName = new javax.swing.JTextField();
        lblBirthDate = new javax.swing.JLabel();
        jdcDate = new com.toedter.calendar.JDateChooser();
        lblBottom = new javax.swing.JLabel();
        jpnLaborData = new javax.swing.JPanel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        cmbMinutesIn = new javax.swing.JComboBox<>();
        cmbHourIn = new javax.swing.JComboBox<>();
        cmbHourOut = new javax.swing.JComboBox<>();
        cmbMinutesOut = new javax.swing.JComboBox<>();
        cmbCharge = new javax.swing.JComboBox<>();
        lbl9 = new javax.swing.JLabel();
        btnOff = new javax.swing.JButton();
        btnOn = new javax.swing.JButton();
        lblBottom1 = new javax.swing.JLabel();
        jpnAccountData = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblConfirm = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        lblBottom2 = new javax.swing.JLabel();
        lblBottom3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajadores");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Nb.ScrollPane.Border.color"));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(9999, 9999));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 60));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 60));

        jtpMain.setBackground(javax.swing.UIManager.getDefaults().getColor("Nb.ScrollPane.Border.color"));
        jtpMain.setBorder(null);

        jpnPersonalData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl1.setText("Nombre:");
        jpnPersonalData.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl2.setText("Apellido paterno:");
        jpnPersonalData.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbl3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl3.setText("Apellido materno:");
        jpnPersonalData.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnPersonalData.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 240, -1));

        txtSLastName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnPersonalData.add(txtSLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, -1));

        txtFLastName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnPersonalData.add(txtFLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, -1));

        lblBirthDate.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblBirthDate.setText("Fecha nacimiento:");
        jpnPersonalData.add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jdcDate.setToolTipText("Seleccione una fecha...");
        jdcDate.setDateFormatString("dd/MM/yyyy");
        jdcDate.setMaximumSize(new java.awt.Dimension(122, 28));
        jdcDate.setMinimumSize(new java.awt.Dimension(122, 28));
        jpnPersonalData.add(jdcDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 170, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        jpnPersonalData.add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 260));

        jtpMain.addTab("tab1", jpnPersonalData);

        jpnLaborData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl5.setText("Cargo:");
        jpnLaborData.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbl4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl4.setText("Área:");
        jpnLaborData.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl6.setText("Horario de entrada:");
        jpnLaborData.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        lbl7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl7.setText("Horario de salida:");
        jpnLaborData.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        txtArea.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnLaborData.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));

        cmbMinutesIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jpnLaborData.add(cmbMinutesIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 70, -1));

        cmbHourIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jpnLaborData.add(cmbHourIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 70, -1));

        cmbHourOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jpnLaborData.add(cmbHourOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 70, -1));

        cmbMinutesOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jpnLaborData.add(cmbMinutesOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 70, -1));

        cmbCharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atención de usuarios", "Especialista", "Usuario" }));
        jpnLaborData.add(cmbCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, -1));

        lbl9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl9.setText("Status:");
        jpnLaborData.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toggle_off32.png"))); // NOI18N
        btnOff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOff.setBorderPainted(false);
        btnOff.setContentAreaFilled(false);
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });
        jpnLaborData.add(btnOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        btnOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toggle_on32.png"))); // NOI18N
        btnOn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOn.setBorderPainted(false);
        btnOn.setContentAreaFilled(false);
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });
        jpnLaborData.add(btnOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        lblBottom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        jpnLaborData.add(lblBottom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        jtpMain.addTab("tab2", jpnLaborData);

        jpnAccountData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl10.setText("Constraseña:");
        jpnAccountData.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbl8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl8.setText("Correo:");
        jpnAccountData.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtMail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnAccountData.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, -1));

        txtPass.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnAccountData.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

        lblConfirm.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblConfirm.setText("Confirmar:");
        jpnAccountData.add(lblConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtConfirm.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jpnAccountData.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, -1));

        lblBottom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        jpnAccountData.add(lblBottom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        jtpMain.addTab("tab3", jpnAccountData);

        getContentPane().add(jtpMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 280));

        lblBottom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        getContentPane().add(lblBottom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?\nTodos los datos no guardados se perderán", "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            if (login) {
                new login().setVisible(true);
                this.dispose();
            } else {
                new main().setVisible(true);
                this.dispose();
            }

        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty() || valueTime() || confirmPassword()) {
            try {
                Connection connection = ConnectionManager.getConnection();
                PreparedStatement insert = connection.prepareStatement("INSERT INTO Workers" + " VALUES(null,?,?,?,?,?,?,?,SHA2(?,256),?,?)");

                insert.setString(1, String.valueOf(cmbCharge.getSelectedItem()));
                insert.setString(2, getParsedName());
                insert.setString(3, txtMail.getText());
                insert.setInt(4, 0);
                insert.setString(5, status);
                insert.setString(6, txtArea.getText());
                insert.setTime(7, getTimeIn());
                insert.setString(8, String.valueOf(txtPass.getPassword()));
                insert.setTime(9, getTimeOut());
                insert.setDate(10, getDate());

                insert.executeUpdate();

                connection.close();
                
                JOptionPane.showMessageDialog(this, "Número de trabajador: " + getNoWorker(), "Trabajador añadido", JOptionPane.INFORMATION_MESSAGE);
                
                cleanComponents();
                
                if(login){
                    this.dispose();
                    new login().setVisible(true);
                }

                

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                if(ex.getMessage().contains("Duplicate entry"))
                    JOptionPane.showMessageDialog(this, "Este correo ya existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los elementos del formulario.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
    private javax.swing.JComboBox<String> cmbCharge;
    private javax.swing.JComboBox<String> cmbHourIn;
    private javax.swing.JComboBox<String> cmbHourOut;
    private javax.swing.JComboBox<String> cmbMinutesIn;
    private javax.swing.JComboBox<String> cmbMinutesOut;
    private com.toedter.calendar.JDateChooser jdcDate;
    private javax.swing.JPanel jpnAccountData;
    private javax.swing.JPanel jpnLaborData;
    private javax.swing.JPanel jpnPersonalData;
    private javax.swing.JTabbedPane jtpMain;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblBottom1;
    private javax.swing.JLabel lblBottom2;
    private javax.swing.JLabel lblBottom3;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JTextField txtArea;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtFLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSLastName;
    // End of variables declaration//GEN-END:variables
}
