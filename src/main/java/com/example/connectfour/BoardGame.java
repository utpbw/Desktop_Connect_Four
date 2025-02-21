package com.example.connectfour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardGame extends JPanel {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private final Button[][] buttons = new Button[ROWS][COLS];

    private final Player playerX = new Player("X");
    private final Player playerO = new Player("O");
    private Player current = playerX;

    public BoardGame() {
        setLayout(new GridLayout(ROWS, COLS));

        // Loop from last row (5) to first row (0)
        for (int row = ROWS - 1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                buttons[row][col] = new Button(row, col);
                buttons[row][col].addActionListener(new ButtonClickListener());
                add(buttons[row][col]);
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Button button = (Button) e.getSource();

            if (button.isEmpty()) {
                button.setValue(current.getSymbol());
                current = (current == playerX) ? playerO : playerX;
            }
        }
    }
}
