package org.erusu.jhtp.chapter7.examples.graphics_case_study;

import javax.swing.JFrame;

public class DrawSpiralsTest {
	public static void main(String[] args) {
		DrawSpirals panel = new DrawSpirals();
		JFrame myFrame = new JFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(panel);
		myFrame.setSize(500, 500);
		myFrame.setVisible(true);
	}
}