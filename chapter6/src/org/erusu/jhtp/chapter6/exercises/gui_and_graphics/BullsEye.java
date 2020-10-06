package org.erusu.jhtp.chapter6.exercises.gui_and_graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class BullsEye extends JPanel {
	
	private static final Random randGen = new Random();
	
	public void paintComponent(Graphics myGraphic) {
		super.paintComponent(myGraphic);
		
		Color color1 = new Color(randGen.nextInt(255), randGen.nextInt(255), randGen.nextInt(255)),
				color2 = new Color(randGen.nextInt(255), randGen.nextInt(255), randGen.nextInt(255));
		
		int x = 10,
			y = 10,
			width = 200,
			height = 200;
		
		for(int counter = 0; counter < 5; counter++) {
			myGraphic.setColor((counter % 2 == 0) ? color1 : color2);
			myGraphic.fillOval(x, y, width, height);
			x += 20;
			y += 20;
			width -= 40;
			height -= 40;
		}
	}
}
