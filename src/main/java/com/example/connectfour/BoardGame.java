package com.example.connectfour;

import javax.swing.*;
import java.awt.*;

public class BoardGame extends JPanel {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private final Button[][] buttons = new Button[ROWS][COLS];

    public BoardGame() {
        setLayout(new GridLayout(ROWS, COLS));

        // Loop from last row (5) to first row (0)
        for (int row = ROWS - 1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                buttons[row][col] = new Button(row, col);
                add(buttons[row][col]);
            }
        }
    }
}
