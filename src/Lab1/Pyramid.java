package Lab1;

import acm.graphics.GRect;
import java.awt.Color;

import acm.graphics.*;
import acm.program.*;


public class Pyramid extends GraphicsProgram {
	private static final int HEIGHT = 500;
	private static final int WIDTH = 550; 
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;
	 
	    public void run() {
	    	this.setSize(HEIGHT, WIDTH);
	    	
	        int startPyramidHeight = (HEIGHT /2);
	        for (int i = 0; i < BRICKS_IN_BASE; i++) {
	            int y = startPyramidHeight + i * BRICK_HEIGHT;
	            int bricksY = (WIDTH - (i + 1)*BRICK_WIDTH) / 2;
	            for (int b = 0; b <= i; b++) {
	                int x = bricksY + b*BRICK_WIDTH;
	                GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
	                add(rect);
	            }
	        }
	    }

			
		}

