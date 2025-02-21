package com.example.connectfour;

public class BoardLogic {
    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private final Button[][] board;

    public BoardLogic(Button[][] board) {
        this.board = board;
    }

    /**
     * Finds the lowest available row in the given column.
     *
     * @param col The column index (0 - 6)
     * @return The lowest available row index (0 - 5), or -1 if the column is full.
     */
    public int getLowestEmptyRow(int col) {
        for (int row = ROWS - 1; row >= 0; row--) { // Start from the bottom
            if (board[row][col].isEmpty()) {
                return row;
            }
        }
        return -1; // Column is full
    }
}
