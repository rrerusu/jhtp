package org.erusu.jhtp.chapter7.examples.graphics_case_study;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpirals extends JPanel {
	public void paintComponent(Graphics myGraphic) {
		super.paintComponent(myGraphic);
		
		drawSpiral(myGraphic);
	}
	
	public void drawSquareSpiral(Graphics myGraphic) {
		int startingX = getWidth() / 2,
				startingY = getHeight() / 2,
				direction = 1;
		
		myGraphic.setColor(Color.RED);
		
		while(startingX < getWidth() && startingY < getHeight()) {
			if(direction % 2 == 0) {
				myGraphic.drawLine(startingX, startingY, startingX, startingY - 25 * direction);
				startingY -= 25 * direction;
				myGraphic.drawLine(startingX, startingY, startingX + 25 * direction, startingY);
				startingX += 25 * direction;
			} else {
				myGraphic.drawLine(startingX, startingY, startingX, startingY + 25 * direction);
				startingY += 25 * direction;
				myGraphic.drawLine(startingX, startingY, startingX - 25 * direction, startingY);
				startingX -= 25 * direction;
			}
			++direction;
		}
	}
	
	public void drawSpiral(Graphics myGraphic) {
		int startingX = getWidth() / 2,
				startingY = getHeight() / 2,
				direction = 1,
				constant;
		
		myGraphic.setColor(Color.BLUE);
		
		while(direction < getHeight() && direction < getWidth()) {
			constant = 24 * direction;
			if(direction % 2 == 0) {
				startingY -= 12;
				startingX -= 24;
				myGraphic.drawArc(startingX, startingY,
						constant, constant,
						0, -90);
				myGraphic.drawArc(startingX, startingY,
						constant, constant,
						270, -90);
			} else {
				startingY -= 12;
				myGraphic.drawArc(startingX, startingY,
						constant, constant,
						180, -90);
				myGraphic.drawArc(startingX, startingY,
						constant, constant,
						90, -90);
			}
			++direction;
		}
	}
}