package com.example.factex;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Shape> shapes;
	public Client() {
		this.shapes = new ArrayList<Shape>();
	}
	
	public void readShapes(String[] shapesSer) {
		for (String s : shapesSer) {
			shapes.add(new ShapeFactory(s));
		}
	}

	public void drawShapes() {
		for (Shape s : this.shapes) {
			s.draw();
		}
	}

}
