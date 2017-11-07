package interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class services extends javax.swing.JFrame {

    private boolean found;
    
    public services() {
        try {
            initComponents();
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            btnModify.setEnabled(false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(services.class.getName()).log(Level.SEVERE, null, ex);
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
        lblCat = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbCat = new javax.swing.JComboBox<>();
        bntAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        txtNameSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblService = new javax.swing.JLabel();
        lblNoService = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("Nombre del servicio:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblCat.setText("Categoría:");
        getContentPane().add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 67, 140, -1));

        cmbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCat.setToolTipText("Seleccionar...");
        getContentPane().add(cmbCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 178, -1));

        bntAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        bntAdd.setToolTipText("Agregar");
        bntAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bntAdd.setBorderPainted(false);
        bntAdd.setContentAreaFilled(false);
        getContentPane().add(bntAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

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
        getContentPane().add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        txtNameSearch.setToolTipText("Nombre de servicio");
        getContentPane().add(txtNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 12, 67, -1));

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
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 13, -1, -1));

        lblService.setText("No. servicio:");
        getContentPane().add(lblService, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, -1, -1));

        lblNoService.setText("000");
        getContentPane().add(lblNoService, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 17, -1, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        found = true;
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if(found){
            btnModify.setEnabled(true);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

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
            java.util.logging.Logger.getLogger(services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField txtNameSearch;
    // End of variables declaration//GEN-END:variables
}
