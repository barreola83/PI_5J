package interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author barreola
 */
public class ticket_evaluation extends javax.swing.JFrame {

    private boolean found;
    
    public ticket_evaluation() {
        try {
            initComponents();
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            //btnModify.setEnabled(false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ticket_evaluation.class.getName()).log(Level.SEVERE, null, ex);
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

        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        bntAdd = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        lblCat1 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        lblCat2 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        lblCat3 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        lblBottom = new javax.swing.JLabel();
        lblBottom1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(628, 430));
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("      ");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        lblName1.setText("Año");
        getContentPane().add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        lblCat.setText("¿Cómo calificaría la solucion que se le dió a su solicitud de servicio?");
        getContentPane().add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        bntAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        bntAdd.setToolTipText("Agregar");
        bntAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bntAdd.setBorderPainted(false);
        bntAdd.setContentAreaFilled(false);
        getContentPane().add(bntAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jTextField1.setText("Calificación");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 110, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 40, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 50, -1));

        lblName2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lblName2.setText("No. Evaluacion:");
        getContentPane().add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblName3.setText("Mes");
        getContentPane().add(lblName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        lblName4.setText("Dia");
        getContentPane().add(lblName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jRadioButton2.setText("Muy bueno");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jRadioButton4.setText("Deficiente");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jRadioButton5.setText("Excelente");
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jRadioButton6.setText("Regular");
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jRadioButton7.setText("Bueno");
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        lblCat1.setText("¿Cómo calificaría el tiempo de respuesta?");
        getContentPane().add(lblCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jRadioButton8.setText("Muy bueno");
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jRadioButton9.setText("Deficiente");
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jRadioButton10.setText("Excelente");
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jRadioButton11.setText("Regular");
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jRadioButton12.setText("Bueno");
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        lblCat2.setText("¿Cómo calificaría la atención del especialista?");
        getContentPane().add(lblCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jRadioButton13.setText("Muy bueno");
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jRadioButton14.setText("Deficiente");
        getContentPane().add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jRadioButton15.setText("Excelente");
        getContentPane().add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jRadioButton16.setText("Regular");
        getContentPane().add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jRadioButton17.setText("Bueno");
        getContentPane().add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        lblCat3.setText("¿Cómo calificaría los servicios que ofrece DIGESET?");
        getContentPane().add(lblCat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jRadioButton18.setText("Muy bueno");
        getContentPane().add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jRadioButton19.setText("Deficiente");
        getContentPane().add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jRadioButton20.setText("Excelente");
        getContentPane().add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jRadioButton21.setText("Regular");
        getContentPane().add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jRadioButton22.setText("Bueno");
        getContentPane().add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 70, -1));

        jTextField5.setText("Calificación");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 110, 30));

        jTextField6.setText("Calificación");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 110, 30));

        jTextField7.setText("Calificación");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 110, 30));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 370));

        lblBottom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        getContentPane().add(lblBottom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 640, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(ticket_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket_evaluation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAdd;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblBottom1;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblCat1;
    private javax.swing.JLabel lblCat2;
    private javax.swing.JLabel lblCat3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    // End of variables declaration//GEN-END:variables
}
