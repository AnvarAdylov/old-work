package com.example.factex;
import com.example.factex.Shape;

public class ShapeFactory extends Shape {
    String n;
	
	public ShapeFactory(String s) {
		n = s;
	}
		
	@Override
	public void draw() {
		if (n.startsWith("#rect")) {
			Rectangle r = new Rectangle();
			r.draw();
		} else if (n.startsWith("#line")) {
			Line l = new Line();
			l.draw();
		}
	}

}
