package Lab1;

import acm.graphics.GCompound;
import acm.graphics.*;

public class GetRect extends GCompound { 
	
	public GetRect(String text, double width, double height) { 
		rect = new GRect(0, 0,  width,  height); 
		GLabel l = new GLabel(text, 15, 30);
		add(l);
		add(rect); 
	}
	
	private GRect rect; 
}
