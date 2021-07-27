package org.erusu.jhtp.chapter15.examples;

import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest {
    public static void main(String[] args) throws IOException{
        JFileChooserDemo myApp = new JFileChooserDemo();
        myApp.setSize(400, 400);
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myApp.setVisible(true);
    }
}