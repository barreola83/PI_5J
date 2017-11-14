package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class evalTicket extends javax.swing.JFrame {

    //Posibles respuestas: muy mala, mala, normal, buena, muy buena.
    private String AQ1 = null; //AnswerQuestion1
    private String AQ2 = null; //AnswerQuestion2
    private String AQ3 = null; //AnswerQuestion3
    private String AQ4 = null; //AnswerQuestion4

    public evalTicket() {
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

    private java.sql.Date getDate() {
        Calendar calendar = Calendar.getInstance();
        java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
        return date;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQ1 = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        lblQ3 = new javax.swing.JLabel();
        lblQ4 = new javax.swing.JLabel();
        btnQ1Angry = new javax.swing.JButton();
        btnQ1Soso = new javax.swing.JButton();
        btnQ1Medium = new javax.swing.JButton();
        btnQ1Happy = new javax.swing.JButton();
        btnQ1Love = new javax.swing.JButton();
        btnQ2Love = new javax.swing.JButton();
        btnQ2Happy = new javax.swing.JButton();
        btnQ2Medium = new javax.swing.JButton();
        btnQ2Soso = new javax.swing.JButton();
        btnQ2Angry = new javax.swing.JButton();
        btnQ3Love = new javax.swing.JButton();
        btnQ3Happy = new javax.swing.JButton();
        btnQ3Medium = new javax.swing.JButton();
        btnQ1Soso2 = new javax.swing.JButton();
        btnQ3Angry = new javax.swing.JButton();
        btnQ4Love = new javax.swing.JButton();
        btnQ4Happy = new javax.swing.JButton();
        btnQ4Medium = new javax.swing.JButton();
        btnQ4Soso = new javax.swing.JButton();
        btnQ4Angry = new javax.swing.JButton();
        lblFeelQ1 = new javax.swing.JLabel();
        lblFeelQ2 = new javax.swing.JLabel();
        lblFeelQ3 = new javax.swing.JLabel();
        lblFeelQ4 = new javax.swing.JLabel();
        btnEvaluate = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lblBottom = new javax.swing.JLabel();
        lblBottom2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluación de ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQ1.setText("¿Cuán satisfactoria fue la solución a su solicitud?");
        getContentPane().add(lblQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, -1, -1));

        lblQ2.setText("¿Cómo calificaría el tiempo de respuesta?");
        getContentPane().add(lblQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 144, -1, -1));

        lblQ3.setText("¿Cómo calificaría la atención del especialista?");
        getContentPane().add(lblQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 228, -1, -1));

        lblQ4.setText("¿Cómo calificaría los servicios que ofrece DIGESET?");
        getContentPane().add(lblQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 312, -1, -1));

        btnQ1Angry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_angry.png"))); // NOI18N
        btnQ1Angry.setToolTipText("Muy mala");
        btnQ1Angry.setBorder(null);
        btnQ1Angry.setBorderPainted(false);
        btnQ1Angry.setContentAreaFilled(false);
        btnQ1Angry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1AngryActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ1Angry, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, -1, -1));

        btnQ1Soso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_sad.png"))); // NOI18N
        btnQ1Soso.setToolTipText("Mala");
        btnQ1Soso.setBorder(null);
        btnQ1Soso.setBorderPainted(false);
        btnQ1Soso.setContentAreaFilled(false);
        btnQ1Soso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1SosoActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ1Soso, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 84, -1, -1));

        btnQ1Medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_confused.png"))); // NOI18N
        btnQ1Medium.setToolTipText("Normal");
        btnQ1Medium.setBorder(null);
        btnQ1Medium.setBorderPainted(false);
        btnQ1Medium.setContentAreaFilled(false);
        btnQ1Medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1MediumActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ1Medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 84, -1, -1));

        btnQ1Happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji.png"))); // NOI18N
        btnQ1Happy.setToolTipText("Buena");
        btnQ1Happy.setBorder(null);
        btnQ1Happy.setBorderPainted(false);
        btnQ1Happy.setContentAreaFilled(false);
        btnQ1Happy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1HappyActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ1Happy, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 84, -1, -1));

        btnQ1Love.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_in_love.png"))); // NOI18N
        btnQ1Love.setToolTipText("Muy buena");
        btnQ1Love.setBorder(null);
        btnQ1Love.setBorderPainted(false);
        btnQ1Love.setContentAreaFilled(false);
        btnQ1Love.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1LoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ1Love, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 84, -1, -1));

        btnQ2Love.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_in_love.png"))); // NOI18N
        btnQ2Love.setToolTipText("Muy buena");
        btnQ2Love.setBorder(null);
        btnQ2Love.setBorderPainted(false);
        btnQ2Love.setContentAreaFilled(false);
        btnQ2Love.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2LoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ2Love, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 168, -1, -1));

        btnQ2Happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji.png"))); // NOI18N
        btnQ2Happy.setToolTipText("Buena");
        btnQ2Happy.setBorder(null);
        btnQ2Happy.setBorderPainted(false);
        btnQ2Happy.setContentAreaFilled(false);
        btnQ2Happy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2HappyActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ2Happy, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 168, -1, -1));

        btnQ2Medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_confused.png"))); // NOI18N
        btnQ2Medium.setToolTipText("Normal");
        btnQ2Medium.setBorder(null);
        btnQ2Medium.setBorderPainted(false);
        btnQ2Medium.setContentAreaFilled(false);
        btnQ2Medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2MediumActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ2Medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 168, -1, -1));

        btnQ2Soso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_sad.png"))); // NOI18N
        btnQ2Soso.setToolTipText("Mala");
        btnQ2Soso.setBorder(null);
        btnQ2Soso.setBorderPainted(false);
        btnQ2Soso.setContentAreaFilled(false);
        btnQ2Soso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2SosoActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ2Soso, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 168, -1, -1));

        btnQ2Angry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_angry.png"))); // NOI18N
        btnQ2Angry.setToolTipText("Muy mala");
        btnQ2Angry.setBorder(null);
        btnQ2Angry.setBorderPainted(false);
        btnQ2Angry.setContentAreaFilled(false);
        btnQ2Angry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2AngryActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ2Angry, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 168, -1, -1));

        btnQ3Love.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_in_love.png"))); // NOI18N
        btnQ3Love.setToolTipText("Muy buena");
        btnQ3Love.setBorder(null);
        btnQ3Love.setBorderPainted(false);
        btnQ3Love.setContentAreaFilled(false);
        btnQ3Love.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3LoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ3Love, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 252, -1, -1));

        btnQ3Happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji.png"))); // NOI18N
        btnQ3Happy.setToolTipText("Buena");
        btnQ3Happy.setBorder(null);
        btnQ3Happy.setBorderPainted(false);
        btnQ3Happy.setContentAreaFilled(false);
        btnQ3Happy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3HappyActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ3Happy, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 252, -1, -1));

        btnQ3Medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_confused.png"))); // NOI18N
        btnQ3Medium.setToolTipText("Normal");
        btnQ3Medium.setBorder(null);
        btnQ3Medium.setBorderPainted(false);
        btnQ3Medium.setContentAreaFilled(false);
        btnQ3Medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3MediumActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ3Medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 252, -1, -1));

        btnQ1Soso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_sad.png"))); // NOI18N
        btnQ1Soso2.setToolTipText("Mala");
        btnQ1Soso2.setBorder(null);
        btnQ1Soso2.setBorderPainted(false);
        btnQ1Soso2.setContentAreaFilled(false);
        btnQ1Soso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1Soso2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ1Soso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 252, -1, -1));

        btnQ3Angry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_angry.png"))); // NOI18N
        btnQ3Angry.setToolTipText("Muy mala");
        btnQ3Angry.setBorder(null);
        btnQ3Angry.setBorderPainted(false);
        btnQ3Angry.setContentAreaFilled(false);
        btnQ3Angry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3AngryActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ3Angry, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 252, -1, -1));

        btnQ4Love.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_in_love.png"))); // NOI18N
        btnQ4Love.setToolTipText("Muy buena");
        btnQ4Love.setBorder(null);
        btnQ4Love.setBorderPainted(false);
        btnQ4Love.setContentAreaFilled(false);
        btnQ4Love.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4LoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ4Love, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 342, -1, -1));

        btnQ4Happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji.png"))); // NOI18N
        btnQ4Happy.setToolTipText("Buena");
        btnQ4Happy.setBorder(null);
        btnQ4Happy.setBorderPainted(false);
        btnQ4Happy.setContentAreaFilled(false);
        btnQ4Happy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4HappyActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ4Happy, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 342, -1, -1));

        btnQ4Medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_confused.png"))); // NOI18N
        btnQ4Medium.setToolTipText("Normal");
        btnQ4Medium.setBorder(null);
        btnQ4Medium.setBorderPainted(false);
        btnQ4Medium.setContentAreaFilled(false);
        btnQ4Medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4MediumActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ4Medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 342, -1, -1));

        btnQ4Soso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_sad.png"))); // NOI18N
        btnQ4Soso.setToolTipText("Mala");
        btnQ4Soso.setBorder(null);
        btnQ4Soso.setBorderPainted(false);
        btnQ4Soso.setContentAreaFilled(false);
        btnQ4Soso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4SosoActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ4Soso, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 342, -1, -1));

        btnQ4Angry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emoji_angry.png"))); // NOI18N
        btnQ4Angry.setToolTipText("Muy mala");
        btnQ4Angry.setBorder(null);
        btnQ4Angry.setBorderPainted(false);
        btnQ4Angry.setContentAreaFilled(false);
        btnQ4Angry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4AngryActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ4Angry, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 342, -1, -1));

        lblFeelQ1.setText("Seleccione una opción...");
        getContentPane().add(lblFeelQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lblFeelQ2.setText("Seleccione una opción...");
        getContentPane().add(lblFeelQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        lblFeelQ3.setText("Seleccione una opción...");
        getContentPane().add(lblFeelQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        lblFeelQ4.setText("Seleccione una opción...");
        getContentPane().add(lblFeelQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        btnEvaluate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check_mark.png"))); // NOI18N
        btnEvaluate.setToolTipText("Evaluar");
        btnEvaluate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEvaluate.setBorderPainted(false);
        btnEvaluate.setContentAreaFilled(false);
        btnEvaluate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluateActionPerformed(evt);
            }
        });
        getContentPane().add(btnEvaluate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom.setToolTipText(null);
        getContentPane().add(lblBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 370));

        lblBottom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/071770FB5.png"))); // NOI18N
        lblBottom2.setToolTipText(null);
        getContentPane().add(lblBottom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 480, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
        new main().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnEvaluateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluateActionPerformed
        try {
            String answers = "Q1 = " + lblFeelQ1.getText();
            answers += "Q2 = " + lblFeelQ2.getText();
            answers += "Q3 = " + lblFeelQ3.getText();
            answers += "Q4 = " + lblFeelQ4.getText();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true", "root", "root");
            PreparedStatement insert = connection.prepareStatement("INSERT INTO Ticket_Evaluation VALUES(null, ?, ?)");

            insert.setString(1, answers);
            insert.setDate(2, getDate());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Debe completar toda la encuesta.");
        }
    }//GEN-LAST:event_btnEvaluateActionPerformed

    private void btnQ1LoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1LoveActionPerformed
        AQ1 = "Muy buena";
        lblFeelQ1.setText(AQ1);
    }//GEN-LAST:event_btnQ1LoveActionPerformed

    private void btnQ1HappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1HappyActionPerformed
        AQ1 = "Buena";
        lblFeelQ1.setText(AQ1);
    }//GEN-LAST:event_btnQ1HappyActionPerformed

    private void btnQ1MediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1MediumActionPerformed
        AQ1 = "Normal";
        lblFeelQ1.setText(AQ1);
    }//GEN-LAST:event_btnQ1MediumActionPerformed

    private void btnQ1SosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1SosoActionPerformed
        AQ1 = "Mala";
        lblFeelQ1.setText(AQ1);
    }//GEN-LAST:event_btnQ1SosoActionPerformed

    private void btnQ1AngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1AngryActionPerformed
        AQ1 = "Muy mala";
        lblFeelQ1.setText(AQ1);
    }//GEN-LAST:event_btnQ1AngryActionPerformed

    private void btnQ2LoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2LoveActionPerformed
        AQ2 = "Muy buena";
        lblFeelQ2.setText(AQ2);
    }//GEN-LAST:event_btnQ2LoveActionPerformed

    private void btnQ2HappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2HappyActionPerformed
        AQ2 = "Buena";
        lblFeelQ2.setText(AQ2);
    }//GEN-LAST:event_btnQ2HappyActionPerformed

    private void btnQ2MediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2MediumActionPerformed
        AQ2 = "Normal";
        lblFeelQ2.setText(AQ2);
    }//GEN-LAST:event_btnQ2MediumActionPerformed

    private void btnQ2SosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2SosoActionPerformed
        AQ2 = "Mala";
        lblFeelQ2.setText(AQ2);
    }//GEN-LAST:event_btnQ2SosoActionPerformed

    private void btnQ2AngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2AngryActionPerformed
        AQ2 = "Muy mala";
        lblFeelQ2.setText(AQ2);
    }//GEN-LAST:event_btnQ2AngryActionPerformed

    private void btnQ3LoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3LoveActionPerformed
        AQ3 = "Muy buena";
        lblFeelQ2.setText(AQ3);
    }//GEN-LAST:event_btnQ3LoveActionPerformed

    private void btnQ3HappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3HappyActionPerformed
        AQ3 = "Buena";
        lblFeelQ2.setText(AQ3);
    }//GEN-LAST:event_btnQ3HappyActionPerformed

    private void btnQ3MediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3MediumActionPerformed
        AQ3 = "Normal";
        lblFeelQ2.setText(AQ3);
    }//GEN-LAST:event_btnQ3MediumActionPerformed

    private void btnQ1Soso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1Soso2ActionPerformed
        AQ3 = "Mala";
        lblFeelQ2.setText(AQ3);
    }//GEN-LAST:event_btnQ1Soso2ActionPerformed

    private void btnQ3AngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3AngryActionPerformed
        AQ3 = "Muy mala";
        lblFeelQ2.setText(AQ3);
    }//GEN-LAST:event_btnQ3AngryActionPerformed

    private void btnQ4LoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4LoveActionPerformed
        AQ4 = "Muy buena";
        lblFeelQ2.setText(AQ4);
    }//GEN-LAST:event_btnQ4LoveActionPerformed

    private void btnQ4HappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4HappyActionPerformed
        AQ4 = "Buena";
        lblFeelQ2.setText(AQ4);
    }//GEN-LAST:event_btnQ4HappyActionPerformed

    private void btnQ4MediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4MediumActionPerformed
        AQ4 = "Normal";
        lblFeelQ2.setText(AQ4);
    }//GEN-LAST:event_btnQ4MediumActionPerformed

    private void btnQ4SosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4SosoActionPerformed
        AQ4 = "Mala";
        lblFeelQ2.setText(AQ4);
    }//GEN-LAST:event_btnQ4SosoActionPerformed

    private void btnQ4AngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4AngryActionPerformed
        AQ4 = "Muy mala";
        lblFeelQ2.setText(AQ4);
    }//GEN-LAST:event_btnQ4AngryActionPerformed

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
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new evalTicket().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvaluate;
    private javax.swing.JButton btnQ1Angry;
    private javax.swing.JButton btnQ1Happy;
    private javax.swing.JButton btnQ1Love;
    private javax.swing.JButton btnQ1Medium;
    private javax.swing.JButton btnQ1Soso;
    private javax.swing.JButton btnQ1Soso2;
    private javax.swing.JButton btnQ2Angry;
    private javax.swing.JButton btnQ2Happy;
    private javax.swing.JButton btnQ2Love;
    private javax.swing.JButton btnQ2Medium;
    private javax.swing.JButton btnQ2Soso;
    private javax.swing.JButton btnQ3Angry;
    private javax.swing.JButton btnQ3Happy;
    private javax.swing.JButton btnQ3Love;
    private javax.swing.JButton btnQ3Medium;
    private javax.swing.JButton btnQ4Angry;
    private javax.swing.JButton btnQ4Happy;
    private javax.swing.JButton btnQ4Love;
    private javax.swing.JButton btnQ4Medium;
    private javax.swing.JButton btnQ4Soso;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblBottom2;
    private javax.swing.JLabel lblFeelQ1;
    private javax.swing.JLabel lblFeelQ2;
    private javax.swing.JLabel lblFeelQ3;
    private javax.swing.JLabel lblFeelQ4;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    // End of variables declaration//GEN-END:variables
}
