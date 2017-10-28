/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Ususario
 */
public class dependency extends javax.swing.JFrame {

    /**
     * Creates new form Dependencias
     */
    public dependency() {
        try {
            initComponents();
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(knowledgeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        txtDep = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        cmbMinutes = new javax.swing.JComboBox<>();
        cmbHour = new javax.swing.JComboBox<>();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dependencias");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setToolTipText("Nombre a buscar");
        txtSearch.setName("txtDependencia"); // NOI18N
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 12, 96, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom24.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 14, -1, -1));

        lbl2.setText("Nombre de la dependencia:");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));

        lbl3.setText("Directivo:");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbl4.setText("Teléfono:");
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 183, -1, -1));

        lbl5.setText("Horario:");
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtDep.setName("txtNombreDependencia"); // NOI18N
        getContentPane().add(txtDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 235, -1));

        txtDir.setName("txtDirectivo"); // NOI18N
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 235, -1));

        txtPhoneNo.setName("txtNumero"); // NOI18N
        getContentPane().add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 169, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setToolTipText("Agregar");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setName("btnAgregar"); // NOI18N
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 299, -1, -1));

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N
        btnModify.setToolTipText("Modificar");
        btnModify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModify.setBorderPainted(false);
        btnModify.setContentAreaFilled(false);
        btnModify.setName("btnModificar"); // NOI18N
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 299, -1, -1));

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
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 299, -1, -1));

        cmbMinutes.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cmbMinutes.setToolTipText("Minutos");
        getContentPane().add(cmbMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 70, 20));

        cmbHour.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        cmbHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cmbHour.setToolTipText("Hora");
        getContentPane().add(cmbHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 70, 20));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dependency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbHour;
    private javax.swing.JComboBox<String> cmbMinutes;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
