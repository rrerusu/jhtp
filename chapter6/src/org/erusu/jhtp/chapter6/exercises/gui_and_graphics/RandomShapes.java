package org.erusu.jhtp.chapter6.exercises.gui_and_graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class RandomShapes extends JPanel{
	
	private static final Random randomGen = new Random();
	
	public void paintComponent(Graphics myGraphic) {
		super.paintComponent(myGraphic);
		
		for(int counter = 0; counter < 10; counter++) {
			paintRandomShape(myGraphic);
		}
	}
	
	public void paintRandomShape(Graphics graphic) {
		graphic.setColor(new Color(randomGen.nextInt(255), randomGen.nextInt(255), randomGen.nextInt(255)));
		if(randomGen.nextInt(2) == 0) {
			graphic.fillOval(randomGen.nextInt(200),
					randomGen.nextInt(200),
					randomGen.nextInt(100),
					randomGen.nextInt(100));
		} else {
			graphic.fillRect(randomGen.nextInt(200),
					randomGen.nextInt(200),
					randomGen.nextInt(100),
					randomGen.nextInt(100));
		}
	}
}
