package com.example.connectfour;

import javax.swing.*;

public class Button extends JButton {
    private final int row;
    private final int col;
    private String value = " ";

    public Button(int row, int col) {
        super(" "); // Label like "A1"
        this.row = row;
        this.col = col;
        setName("Button" + (char) ('A' + col) + String.valueOf(row + 1));
        setFocusPainted(false); // Remove highlight
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isEmpty() {
        return value.equals(" ");
    }

    public void setValue(String value) {
        if (isEmpty()) { // Only allow changing empty cells
            this.value = value;
            setText(value);
        }
    }
}