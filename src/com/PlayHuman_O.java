package com;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class PlayHuman_O extends javax.swing.JFrame {
    
    private String startGame = "O";
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int i=0;

    public PlayHuman_O() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    private void chon_nguoi_choi() {
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        }else {
            startGame = "X";
        }
    }

    private void kiem_tra_win() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        // X win
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        // O win
        else if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Hoa nhau
        else if (i==9) {
            JOptionPane.showMessageDialog(this,
                "Hòa nhau!!!",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_footer = new javax.swing.JPanel();
        btn_choilai = new javax.swing.JButton();
        btn_trove = new javax.swing.JButton();
        jPanel_right = new javax.swing.JPanel();
        jPanel_left = new javax.swing.JPanel();
        jPanel_center = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel_header.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_header.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel_header.setLayout(new java.awt.GridLayout(4, 1));

        jLabel4.setBackground(new java.awt.Color(53, 167, 255));
        jLabel4.setForeground(new java.awt.Color(53, 167, 255));
        jPanel_header.add(jLabel4);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 167, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHƠI VỚI NGƯỜI");
        jPanel_header.add(jLabel1);

        getContentPane().add(jPanel_header, java.awt.BorderLayout.PAGE_START);

        jPanel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_footer.setPreferredSize(new java.awt.Dimension(499, 80));

        btn_choilai.setBackground(new java.awt.Color(53, 167, 255));
        btn_choilai.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_choilai.setForeground(new java.awt.Color(255, 255, 255));
        btn_choilai.setText("CHƠI LẠI");
        btn_choilai.setBorderPainted(false);
        btn_choilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choilaiActionPerformed(evt);
            }
        });

        btn_trove.setBackground(new java.awt.Color(53, 167, 255));
        btn_trove.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_trove.setForeground(new java.awt.Color(255, 255, 255));
        btn_trove.setText("TRỞ VỀ");
        btn_trove.setBorderPainted(false);
        btn_trove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_troveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_footerLayout = new javax.swing.GroupLayout(jPanel_footer);
        jPanel_footer.setLayout(jPanel_footerLayout);
        jPanel_footerLayout.setHorizontalGroup(
            jPanel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_footerLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_choilai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_trove, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel_footerLayout.setVerticalGroup(
            jPanel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_trove, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btn_choilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel_footer, java.awt.BorderLayout.PAGE_END);

        jPanel_right.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_right.setPreferredSize(new java.awt.Dimension(50, 260));

        javax.swing.GroupLayout jPanel_rightLayout = new javax.swing.GroupLayout(jPanel_right);
        jPanel_right.setLayout(jPanel_rightLayout);
        jPanel_rightLayout.setHorizontalGroup(
            jPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel_rightLayout.setVerticalGroup(
            jPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel_right, java.awt.BorderLayout.LINE_END);

        jPanel_left.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_left.setPreferredSize(new java.awt.Dimension(50, 260));

        javax.swing.GroupLayout jPanel_leftLayout = new javax.swing.GroupLayout(jPanel_left);
        jPanel_left.setLayout(jPanel_leftLayout);
        jPanel_leftLayout.setHorizontalGroup(
            jPanel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel_leftLayout.setVerticalGroup(
            jPanel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel_left, java.awt.BorderLayout.LINE_START);

        jPanel_center.setBackground(new java.awt.Color(53, 167, 255));
        jPanel_center.setLayout(new java.awt.GridLayout(3, 3, 2, 1));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton1);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton2);

        jButton3.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton3);

        jButton4.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton4);

        jButton5.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton5);

        jButton6.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton6);

        jButton7.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.setRequestFocusEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton7);

        jButton8.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.setRequestFocusEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton8);

        jButton9.setFont(new java.awt.Font("Verdana", 1, 100)); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setRequestFocusEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_center.add(jButton9);

        getContentPane().add(jPanel_center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_troveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_troveActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btn_troveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.RED);
            b1 = 1;
            i++;
        }else {
            jButton1.setForeground(new Color(53,167,255));
            b1 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.RED);
            b2 = 1;
            i++;
        }else {
            jButton2.setForeground(new Color(53,167,255));
            b2 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.RED);
            b3 = 1;
            i++;
        }else {
            jButton3.setForeground(new Color(53,167,255));
            b3 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.RED);
            b4 = 1;
            i++;
        }else {
            jButton4.setForeground(new Color(53,167,255));
            b4 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.RED);
            b5 = 1;
            i++;
        }else {
            jButton5.setForeground(new Color(53,167,255));
            b5 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.RED);
            b6 = 1;
            i++;
        }else {
            jButton6.setForeground(new Color(53,167,255));
            b6 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.RED);
            b7 = 1;
            i++;
        }else {
            jButton7.setForeground(new Color(53,167,255));
            b7 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.RED);
            b8 = 1;
            i++;
        }else {
            jButton8.setForeground(new Color(53,167,255));
            b8 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.RED);
            b9 = 1;
            i++;
        }else {
            jButton9.setForeground(new Color(53,167,255));
            b9 = 0;
            i++;
        }
        chon_nguoi_choi();
        kiem_tra_win();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn_choilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choilaiActionPerformed
        // TODO add your handling code here:
        // Reset
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        i=0;
    }//GEN-LAST:event_btn_choilaiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_choilai;
    private javax.swing.JButton btn_trove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_center;
    private javax.swing.JPanel jPanel_footer;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JPanel jPanel_left;
    private javax.swing.JPanel jPanel_right;
    // End of variables declaration//GEN-END:variables
}
