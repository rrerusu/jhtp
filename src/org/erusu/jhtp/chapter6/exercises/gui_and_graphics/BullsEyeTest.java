package org.erusu.jhtp.chapter6.exercises.gui_and_graphics;

import javax.swing.JFrame;

public class BullsEyeTest {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		BullsEye myBullsEye = new BullsEye();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(myBullsEye);
		myFrame.setSize(230, 250);
		myFrame.setVisible(true);
	}
}
