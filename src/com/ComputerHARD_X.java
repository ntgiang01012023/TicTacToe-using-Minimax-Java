package com;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import resourceloader.ResourceLoader;
import java.awt.Color;

public class ComputerHARD_X implements ActionListener, MouseListener {

    JFrame frame = new JFrame("Tic Tac Toe");

    JButton[] button = new JButton[9];
    
    JLabel jlabel1 = new JLabel();
    JLabel jlabel2 = new JLabel();
    JLabel jlabel3 = new JLabel();
    JLabel jlabel4 = new JLabel();
    JLabel jlabel5 = new JLabel();
    JLabel jlabel6 = new JLabel();

    JButton resetButton = new JButton("CHƠI LẠI");
    
    JButton troveButton = new JButton("TRỞ VỀ");

    ImageIcon O = new ImageIcon(ResourceLoader.load("res/O.png"));

    ImageIcon X = new ImageIcon(ResourceLoader.load("res/X.png"));

    JPanel gamePanel = new JPanel(new GridLayout(3, 3));

    JButton[] diffButton = new JButton[1];
    
    JPanel backgroundPanel = new JPanel();

    JPanel diffPanel = new JPanel(new GridLayout(1,1));

    boolean ai = false;

    boolean playable = true;

    int difficulty = 0;

    ComputerHARD_X() {
        this.frame.setLocation(400, 100);
        this.frame.setSize(500, 600);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setLayout((LayoutManager) null);
        this.frame.setResizable(false);
        this.frame.setBackground(Color.WHITE);      
        
        this.backgroundPanel.setBounds(0, 0, 500, 600);
        this.backgroundPanel.setBackground(Color.WHITE);
        this.backgroundPanel.setLayout((LayoutManager) null);
        
        this.gamePanel.setBounds(45, 120, 400, 360);
        this.gamePanel.setBackground(Color.WHITE);
                
        int i;
        for (i = 0; i < this.button.length; i++) {
            this.button[i] = new JButton();
            this.button[i].setBackground((Color) null);
            this.button[i].setForeground(Color.black);
            this.button[i].setFocusable(false);
            this.button[i].addActionListener(this);
            this.button[i].addMouseListener(this);
            this.gamePanel.add(this.button[i]);
        }
        
        this.diffPanel.setBounds(120, 35, 250, 50);     
            this.diffButton[0] = new JButton();
            this.diffButton[0].setFocusable(false);
            this.diffButton[0].setFont(new Font("Arial", 1, 22));
            this.diffButton[0].setForeground(Color.WHITE);
            this.diffButton[0].addActionListener(this);
            this.diffButton[0].addMouseListener(this);
            this.diffPanel.add(this.diffButton[0]);
        
        this.diffButton[0].setText("CHƠI VỚI MÁY KHÓ");
        this.diffButton[0].setBackground(new Color(53,167,255));
        this.diffButton[0].setForeground(Color.WHITE);
        
        this.jlabel1.setBounds(20, 150, 50, 50);
        this.jlabel2.setBounds(20, 270, 50, 50);
        this.jlabel3.setBounds(20, 400, 50, 50);
        this.jlabel4.setBounds(120, 80, 50, 50);
        this.jlabel5.setBounds(250, 80, 50, 50);
        this.jlabel6.setBounds(370, 80, 50, 50);
        
        this.jlabel1.setText("A");
        this.jlabel2.setText("B");
        this.jlabel3.setText("C");
        this.jlabel4.setText("1");
        this.jlabel5.setText("2");
        this.jlabel6.setText("3");
        
        this.resetButton.setBounds(75, 500, 150, 50);
        this.resetButton.setFocusable(false);
        this.resetButton.setFont(new Font("Arial", 1, 18));
        this.resetButton.setForeground(Color.WHITE);
        this.resetButton.setBackground(new Color(53,167,255));
        this.resetButton.addActionListener(this);
        this.resetButton.addMouseListener(this);
        
        this.troveButton.setBounds(265, 500, 150, 50);
        this.troveButton.setFocusable(false);
        this.troveButton.setFont(new Font("Arial", 1, 18));
        this.troveButton.setForeground(Color.WHITE);
        this.troveButton.setBackground(new Color(53,167,255));
        this.troveButton.addActionListener(this);
        this.troveButton.addMouseListener(this);
        
        
        this.frame.add(this.backgroundPanel);
        
        this.backgroundPanel.add(this.diffPanel);
        this.backgroundPanel.add(this.gamePanel);
        this.backgroundPanel.add(this.resetButton);
        this.backgroundPanel.add(this.troveButton);
        
        this.backgroundPanel.add(this.jlabel1);
        this.backgroundPanel.add(this.jlabel2);
        this.backgroundPanel.add(this.jlabel3);
        this.backgroundPanel.add(this.jlabel4);
        this.backgroundPanel.add(this.jlabel5);
        this.backgroundPanel.add(this.jlabel6);
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception exception) {
        }
        this.frame.setVisible(true);
    }

    void computerMove() {
        this.ai = true;
        if (this.difficulty == 1) {
            mediumCPU();
        } else {
            computer();
        }
    }

    void computer() {
        if (this.playable) {
            int bestMove = 4, bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < this.button.length; i++) {
                if (isAvailable(i)) {
                    this.button[i].setIcon(this.O);
                    int score = minimax(false);
                    this.button[i].setIcon((Icon) null);
                    if (score < bestScore) {
                        bestScore = score;
                        bestMove = i;
                    }
                    if (score == -1) {
                        break;
                    }
                }
            }
            this.button[bestMove].setIcon(this.O);
            this.ai = false;
            checkWinner();
        }
    }


    void mediumCPU() {
        if (this.playable && this.ai) {
            int i;
            for (i = 0; i < this.button.length; i++) {
                if (isAvailable(i)) {
                    this.button[i].setIcon(this.O);
                    if (computerWinCondition()) {
                        this.ai = false;
                        checkWinner();
                        break;
                    }
                    this.button[i].setIcon((Icon) null);
                }
            }
            if (this.ai) {
                for (i = 0; i < this.button.length; i++) {
                    if (isAvailable(i)) {
                        this.button[i].setIcon(this.O);
                        if (!pseudoHuman()) {
                            this.ai = false;
                            checkWinner();
                            break;
                        }
                        this.button[i].setIcon((Icon) null);
                    }
                }
            }
            while (this.ai) {
                int move = (new Random()).nextInt(9);
                if (isAvailable(move)) {
                    this.button[move].setIcon(this.O);
                    this.ai = false;
                    checkWinner();
                    break;
                }
            }
        }
    }

    boolean pseudoHuman() {
        for (int i = 0; i < this.button.length; i++) {
            if (isAvailable(i)) {
                this.button[i].setIcon(this.X);
                if (humanWinCondition()) {
                    this.button[i].setIcon((Icon) null);
                    return true;
                }
                this.button[i].setIcon((Icon) null);
            }
        }
        return false;
    }
    
    boolean pseudoisDraw() {
        for (int i = 0; i < this.button.length; i++) {
            if (isAvailable(i)) {
                return false;
            }
        }
        return true;
    }
    
    int minimax(boolean isMinimizing) {
        if (computerWinCondition()) {
            return -1;
        }
        if (humanWinCondition()) {
            return 1;
        }
        if (pseudoisDraw()) {
            return 0;
        }
        if (isMinimizing) {
            int j = Integer.MAX_VALUE;
            for (int k = 0; k < this.button.length; k++) {
                if (isAvailable(k)) {
                    this.button[k].setIcon(this.O);
                    int score = minimax(false);
                    this.button[k].setIcon((Icon) null);
                    if (score == -1) {
                        return score;
                    }
                    j = Math.min(score, j);
                }
            }
            return j;
        }
        int bestScore = Integer.MIN_VALUE;
        for (int i = 0; i < this.button.length; i++) {
            if (isAvailable(i)) {
                this.button[i].setIcon(this.X);
                int score = minimax(true);
                this.button[i].setIcon((Icon) null);
                if (score == 1) {
                    return score;
                }
                bestScore = Math.max(score, bestScore);
            }
        }
        return bestScore;
    }

    boolean computerWinCondition() {
        if (this.button[0].getIcon() == this.button[1].getIcon() && this.button[1].getIcon() == this.button[2].getIcon() && this.button[0].getIcon() == this.O) {
            return true;
        }
        if (this.button[3].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[5].getIcon() && this.button[3].getIcon() == this.O) {
            return true;
        }
        if (this.button[6].getIcon() == this.button[7].getIcon() && this.button[7].getIcon() == this.button[8].getIcon() && this.button[6].getIcon() == this.O) {
            return true;
        }
        if (this.button[0].getIcon() == this.button[3].getIcon() && this.button[3].getIcon() == this.button[6].getIcon() && this.button[0].getIcon() == this.O) {
            return true;
        }
        if (this.button[1].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[7].getIcon() && this.button[1].getIcon() == this.O) {
            return true;
        }
        if (this.button[2].getIcon() == this.button[5].getIcon() && this.button[5].getIcon() == this.button[8].getIcon() && this.button[2].getIcon() == this.O) {
            return true;
        }
        if (this.button[0].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[8].getIcon() && this.button[0].getIcon() == this.O) {
            return true;
        }
        if (this.button[2].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[6].getIcon() && this.button[2].getIcon() == this.O) {
            return true;
        }
        return false;
    }

    boolean humanWinCondition() {
        if (this.button[0].getIcon() == this.button[1].getIcon() && this.button[1].getIcon() == this.button[2].getIcon() && this.button[0].getIcon() == this.X) {
            return true;
        }
        if (this.button[3].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[5].getIcon() && this.button[3].getIcon() == this.X) {
            return true;
        }
        if (this.button[6].getIcon() == this.button[7].getIcon() && this.button[7].getIcon() == this.button[8].getIcon() && this.button[6].getIcon() == this.X) {
            return true;
        }
        if (this.button[0].getIcon() == this.button[3].getIcon() && this.button[3].getIcon() == this.button[6].getIcon() && this.button[0].getIcon() == this.X) {
            return true;
        }
        if (this.button[1].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[7].getIcon() && this.button[1].getIcon() == this.X) {
            return true;
        }
        if (this.button[2].getIcon() == this.button[5].getIcon() && this.button[5].getIcon() == this.button[8].getIcon() && this.button[2].getIcon() == this.X) {
            return true;
        }
        if (this.button[0].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[8].getIcon() && this.button[0].getIcon() == this.X) {
            return true;
        }
        if (this.button[2].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[6].getIcon() && this.button[2].getIcon() == this.X) {
            return true;
        }
        return false;
    }

    boolean checkWinner() {
        if (this.button[0].getIcon() == this.button[1].getIcon() && this.button[1].getIcon() == this.button[2].getIcon() && this.button[0].getIcon() != null) {
            endGame(0, 1, 2);
            return true;
        }
        if (this.button[3].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[5].getIcon() && this.button[3].getIcon() != null) {
            endGame(3, 4, 5);
            return true;
        }
        if (this.button[6].getIcon() == this.button[7].getIcon() && this.button[7].getIcon() == this.button[8].getIcon() && this.button[6].getIcon() != null) {
            endGame(6, 7, 8);
            return true;
        }
        if (this.button[0].getIcon() == this.button[3].getIcon() && this.button[3].getIcon() == this.button[6].getIcon() && this.button[0].getIcon() != null) {
            endGame(0, 3, 6);
            return true;
        }
        if (this.button[1].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[7].getIcon() && this.button[1].getIcon() != null) {
            endGame(1, 4, 7);
            return true;
        }
        if (this.button[2].getIcon() == this.button[5].getIcon() && this.button[5].getIcon() == this.button[8].getIcon() && this.button[2].getIcon() != null) {
            endGame(2, 5, 8);
            return true;
        }
        if (this.button[0].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[8].getIcon() && this.button[0].getIcon() != null) {
            endGame(0, 4, 8);
            return true;
        }
        if (this.button[2].getIcon() == this.button[4].getIcon() && this.button[4].getIcon() == this.button[6].getIcon() && this.button[2].getIcon() != null) {
            endGame(2, 4, 6);
            return true;
        }
        return isDraw();
    }

    void endGame(int x, int y, int z) {
        this.button[x].setBackground(Color.green);
        this.button[y].setBackground(Color.green);
        this.button[z].setBackground(Color.green);
        
        this.playable = false;
        if (this.button[x].getIcon() == this.X) {
            JOptionPane.showMessageDialog(frame,
                "Người chơi O đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame,
                "Người chơi X đã thắng cuộc",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    boolean isAvailable(int i) {
        if (this.button[i].getIcon() == null) {
            return true;
        }
        return false;
    }

    boolean isDraw() {
        for (int i = 0; i < this.button.length; i++) {
            if (isAvailable(i)) {
                return false;
            }
        }
        this.playable = false;
        JOptionPane.showMessageDialog(frame,
                "Trò chơI Hòa nhau !!!",
                "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    void resetGame() {
        for (int i = 0; i < this.button.length; i++) {
            this.button[i].setIcon((Icon) null);
            this.button[i].setBackground((Color) null);
        }
        
        this.playable = true;
    } 
    
    void backMenu() {
        frame.setVisible(false);
        new Menu().setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        int i;
        for (i = 0; i < this.button.length; i++) {
            if (e.getSource() == this.button[i]
                    && this.playable && !this.ai && isAvailable(i)) {
                this.button[i].setIcon(this.X);
                if (!checkWinner()) {
                    computerMove();
                }
            }
        }
        if (e.getSource() == this.resetButton) {
            resetGame();
        }
        if (e.getSource() == this.troveButton) {
            backMenu();
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {

    }

    void setVisible(boolean b) {
    }
}
