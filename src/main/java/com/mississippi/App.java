package main.java.com.mississippi;

import main.java.com.mississippi.view.MainFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}