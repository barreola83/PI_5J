package interfaces;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

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
            this.pack();
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

    private void initTableData(String problem) {

        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
            DefaultTableModel model = new DefaultTableModel(new String[]{"Problema", "Solución"}, 0);
            Statement select = connection.createStatement();
            ResultSet result = select.executeQuery("SELECT problema, solucion from "
                    + "BDCONOCIMIENTO where problema LIKE '%" + problem + "%'");

            while (result.next()) {
                model.addRow(new Object[]{result.getString("problema"), result.getString("solucion")});
            }

            connection.close();
            jtbProblems.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo.");
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
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
        jspTable = new javax.swing.JScrollPane();
        jtbProblems = new javax.swing.JTable();
        jmbMain = new javax.swing.JMenuBar();
        jEdit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiFind = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de datos del conocimiento");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(360, 272));
        setMinimumSize(new java.awt.Dimension(360, 272));
        setName("frmBD"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtSearch.setToolTipText("Número de problema");
        txtSearch.setName("txtProblema"); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 118, -1));

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
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 40));

        jtbProblems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Problema", "Solución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jtbProblems);

        getContentPane().add(jspTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 530, 320));

        jEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit24.png"))); // NOI18N
        jEdit.setText("Edit");
        jEdit.setToolTipText("Editar...");
        jEdit.setContentAreaFilled(false);
        jEdit.setDelay(20);
        jEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEditMouseExited(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add24.png"))); // NOI18N
        jMenuItem1.setText("Añadir...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jEdit.add(jMenuItem1);

        jmiFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmiFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom24.png"))); // NOI18N
        jmiFind.setText("Buscar...");
        jmiFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFindActionPerformed(evt);
            }
        });
        jEdit.add(jmiFind);

        jmbMain.add(jEdit);

        setJMenuBar(jmbMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (!txtSearch.getText().isEmpty()) {
            initTableData(txtSearch.getText());
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo completar la búsqueda. Intente de nuevo.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearch.doClick();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void jmiFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFindActionPerformed
        try {
            initTableData(JOptionPane.showInputDialog(null, "Problema", "Buscar problema", JOptionPane.INFORMATION_MESSAGE));
        } catch (HeadlessException headlessException) {
        }
    }//GEN-LAST:event_jmiFindActionPerformed

    private void jEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditMouseExited

    }//GEN-LAST:event_jEditMouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        new addProblemKDB().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new knowledgeDB().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenu jEdit;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JMenuItem jmiFind;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTable jtbProblems;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
