/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameold;

import java.awt.Desktop;
import static java.awt.Desktop.getDesktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.awt.DesktopBrowse;

/**
 *
 * @author alcim
 */
public class gameOld extends javax.swing.JFrame {

    /**
     * Creates new form gameOld
     */
    int pont1 = 0, pont2 = 0;
    boolean jog1 = true, jog2 = false, auto = false;
    Random r = new Random();

    public gameOld() {
        initComponents();
        //Matriz m = new Matriz();
        jbpont1.setText("" + pont1);
        jbpont2.setText("" + pont2);
    }

    /*public void automatico(){
        int j = 1 + r.nextInt(9);
        
            switch(j){
                case 1: 
                    if(jog2 && btn1.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                case 2:
                    if(jog2 && btn2.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 3:
                    if(jog2 && btn3.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 4:
                    if(jog2 && btn4.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 5:
                    if(jog2 && btn5.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 6:
                    if(jog2 && btn6.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 7:
                    if(jog2 && btn7.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 8:
                    if(jog2 && btn8.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                case 9:
                    if(jog2 && btn9.getText().length() < 1) {
                    btn3.setText("O");
                    jog1 = true;
                    jog2 = false;
                    }else {
                        j = 1 + r.nextInt(9);
                    }
                    break;
                
            }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbpont1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbpont2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novo = new javax.swing.JMenuItem();
        reiniciar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pontuação:");

        jLabel2.setText("Jogador 1:");

        jLabel4.setText("Jogador 2:");

        jMenu1.setText("início");

        novo.setText("Novo jogo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        jMenu1.add(novo);

        reiniciar.setText("Reiniciar jogo");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jMenu1.add(reiniciar);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem5.setText("GitHub");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbpont1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbpont2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jbpont1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbpont2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int select() {
        if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X"
                || btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X"
                || btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X"
                || btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X"
                || btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X"
                || btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X"
                || btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X"
                || btn7.getText() == "X" && btn5.getText() == "X" && btn3.getText() == "X") {
            return 1;
        } else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O"
                || btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O"
                || btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O"
                || btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O"
                || btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O"
                || btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O"
                || btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O"
                || btn7.getText() == "O" && btn5.getText() == "O" && btn3.getText() == "O") {
            return 2;
        } else {
            return 3;
        }

    }

    public void verifica() {

        switch (select()) {
            case 1:
                JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
                pont1++;
                setButton();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
                pont2++;
                setButton();
                break;
            case 3:
                if (btn1.getText().length() > 0 && btn2.getText().length() > 0
                        && btn3.getText().length() > 0 && btn4.getText().length() > 0
                        && btn5.getText().length() > 0 && btn6.getText().length() > 0
                        && btn7.getText().length() > 0 && btn8.getText().length() > 0
                        && btn9.getText().length() > 0) {
                    JOptionPane.showMessageDialog(null, "Empate!");
                    setButton();
                }
                break;
        }
        jbpont1.setText("" + pont1);
        jbpont2.setText("" + pont2);
    }

    public void setButton() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    public void zerar() {
        setButton();
        this.pont1 = 0;
        this.pont2 = 0;
        jbpont1.setText("" + pont1);
        jbpont2.setText("" + pont2);
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (jog1 && btn3.getText().length() < 1) {
            btn3.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn3.getText().length() < 1) {
            btn3.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:

        if (jog1 && btn8.getText().length() < 1) {
            btn8.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn8.getText().length() < 1) {
            btn8.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (jog1 && btn1.getText().length() < 1) {
            btn1.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn1.getText().length() < 1) {
            btn1.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:     
        if (jog1 && btn2.getText().length() < 1) {
            btn2.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn2.getText().length() < 1) {
            btn2.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:  
        if (jog1 && btn4.getText().length() < 1) {
            btn4.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn4.getText().length() < 1) {
            btn4.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:    
        if (jog1 && btn5.getText().length() < 1) {
            btn5.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn5.getText().length() < 1) {
            btn5.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:   
        if (jog1 && btn6.getText().length() < 1) {
            btn6.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn6.getText().length() < 1) {
            btn6.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:   
        if (jog1 && btn7.getText().length() < 1) {
            btn7.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn7.getText().length() < 1) {
            btn7.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here: 
        if (jog1 && btn9.getText().length() < 1) {
            btn9.setText("X");
            jog1 = false;
            jog2 = true;
        } else if (jog2 && btn9.getText().length() < 1) {
            btn9.setText("O");
            jog1 = true;
            jog2 = false;
        }
        verifica();
    }//GEN-LAST:event_btn9ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        setButton();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        // TODO add your handling code here:
        zerar();
    }//GEN-LAST:event_novoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Ir para meu GitHub?");
        if (res < 1) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/alcimarbmx"));
            } catch (IOException ex) {
                Logger.getLogger(gameOld.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(gameOld.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(gameOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameOld().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbpont1;
    private javax.swing.JLabel jbpont2;
    private javax.swing.JMenuItem novo;
    private javax.swing.JMenuItem reiniciar;
    // End of variables declaration//GEN-END:variables
}
