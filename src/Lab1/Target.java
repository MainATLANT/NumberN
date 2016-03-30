package Lab1;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Target extends GraphicsProgram {

	private static final int HEIGHT = 600;
	private static final int WIDTH = 600;
	private static final double RADIUS = 32; 
	private static final int CIRCLENUMBER = 10; // Божественнное количество кружочков

	public void run() {

		this.setSize(HEIGHT, WIDTH);

		int startCircle = (HEIGHT / 2); 
		int y = startCircle;
		int x = startCircle;
		double c;
		
		for (int i = 0; i < CIRCLENUMBER; i++) {
			if (i % 2 == 0) { //Закрашивание кружков
				c = RADIUS * (CIRCLENUMBER - i);
				GOval a = filledCircle(x, y, c, Color.RED);
				add(a);
			}

			else {
				c = RADIUS * (CIRCLENUMBER - i);
				GOval b = filledCircle(x, y, c, Color.WHITE);
				add(b);
			}
		}
	}

	
	/* Хотя вот этот вариант был создан намного быстрей и отвечал критериям 
	 * GOval o = filledCircle(WIDTH/2,HEIGHT/2,96,Color.RED); add(o);
	 * 
	 * GOval o1 = filledCircle(WIDTH/2,HEIGHT/2,64,Color.WHITE); add(o1);
	 * 
	 * GOval o2 = filledCircle(WIDTH/2,HEIGHT/2,32,Color.RED); add(o2);
	 */

	private GOval filledCircle(int x, int y, double RADIUS, Color color) {
		GOval circle = new GOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}

}
