package com.example.connectfour;

import javax.swing.*;

public class Button extends JButton {
    private final int row;
    private final int col;

    public Button(int row, int col) {
        super((char) ('A' + col) + String.valueOf(row + 1)); // Label like "A1"
        this.row = row;
        this.col = col;
        setName("Button" + getText());
        setFocusPainted(false); // Remove highlight
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}