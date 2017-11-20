package interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class specialist_main extends javax.swing.JFrame {

    private int noWorker;

    public specialist_main() {
        initComponents();
        formatJFrame();
    }

    public specialist_main(int noWorker) {
        initComponents();
        formatJFrame();
        this.noWorker = noWorker;
    }

    private void formatJFrame() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Desactiva el botón de cerrar
            setLocationRelativeTo(null); //Centra el jFrame
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); //Da el estilo al jFrame
            lblTicket.setVisible(false);
            lblSearch.setVisible(false);
            lblLook.setVisible(false);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTickets = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblHello = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        btnLook = new javax.swing.JButton();
        lblLook = new javax.swing.JLabel();
        lblBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal (especialista)");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(350, 300));
        setMinimumSize(new java.awt.Dimension(350, 300));
        setPreferredSize(new java.awt.Dimension(350, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_1.png"))); // NOI18N
        btnTickets.setToolTipText("Tickets");
        btnTickets.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTickets.setBorderPainted(false);
        btnTickets.setContentAreaFilled(false);
        btnTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTicketsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTicketsMouseEntered(evt);
            }
        });
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });
        getContentPane().add(btnTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/outbox.png"))); // NOI18N
        btnLogOut.setToolTipText("Cerrar sesión");
        btnLogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogOut.setBorderPainted(false);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        lblHello.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblHello.setText("¡Bienvenido!");
        getContentPane().add(lblHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        lblTicket.setText("Tickets");
        getContentPane().add(lblTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        lblSearch.setText("Buscar");
        getContentPane().add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        btnLook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/allow_list2.png"))); // NOI18N
        btnLook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLook.setBorderPainted(false);
        btnLook.setContentAreaFilled(false);
        btnLook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLookMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLookMouseEntered(evt);
            }
        });
        btnLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLookActionPerformed(evt);
            }
        });
        getContentPane().add(btnLook, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        lblLook.setText("Tickets signados");
        getContentPane().add(lblLook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            new login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        new specialist_ticket("Search").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        new specialist_ticket("Ticket").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseEntered
        lblTicket.setVisible(true);
    }//GEN-LAST:event_btnTicketsMouseEntered

    private void btnTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseExited
        lblTicket.setVisible(false);
    }//GEN-LAST:event_btnTicketsMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        lblSearch.setVisible(true);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        lblSearch.setVisible(false);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookActionPerformed
        new search_ticket(noWorker).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLookActionPerformed

    private void btnLookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLookMouseEntered
        lblLook.setVisible(true);
    }//GEN-LAST:event_btnLookMouseEntered

    private void btnLookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLookMouseExited
        lblLook.setVisible(false);
    }//GEN-LAST:event_btnLookMouseExited

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
            java.util.logging.Logger.getLogger(specialist_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new specialist_main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTickets;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblLook;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTicket;
    // End of variables declaration//GEN-END:variables
}
