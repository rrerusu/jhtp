package org.erusu.jhtp.chapter6.exercises.gui_and_graphics;

import javax.swing.JFrame;

public class RandomShapesTest {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		RandomShapes myShapes = new RandomShapes();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(myShapes);
		myFrame.setSize(230, 250);
		myFrame.setVisible(true);
	}
}
