package Lab1;


import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class KlassTable extends GraphicsProgram {

	private static final int HEIGHT = 600;
	private static final int WIDTH = 600;
	
	public void run() {
		this.setSize(HEIGHT, WIDTH);
		
		GetRect rect = new GetRect("GraphicsProgram", 120,50);
		add(rect,250,180);
		
		GetRect rect1 = new GetRect("ConsoleProgram", 120,50);
		add(rect1,100,180);
		
		GetRect rect2 = new GetRect("DialogProgram", 120,50);
		add(rect2,400,180);
		
		GetRect rect3 = new GetRect("Program", 120,50);
		add(rect3,250,70);
		
		GLine line = new GLine (315,120,315,180);
		add(line);
		
		GLine line1 = new GLine (315,120,155,180);
		add(line1);
		
		GLine line2 = new GLine (315,120,465,180);
		add(line2);
	}
	

}
