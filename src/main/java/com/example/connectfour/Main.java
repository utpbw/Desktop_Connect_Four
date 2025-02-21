package com.example.connectfour;  // Add package declaration

import javax.swing.*;

public class Main {  // Declare a class
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Connect4::new);
    }
}
