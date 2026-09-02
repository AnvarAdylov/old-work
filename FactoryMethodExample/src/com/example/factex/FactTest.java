package com.example.factex;

public class FactTest {

	public static void main(String[] args) {
		String[] shapes = {
				"#rect 1,2",
				"#line 1,2",
				"#circle 1,3"
		};
		
		Client c = new Client();
		c.readShapes(shapes);
		c.drawShapes();
	}
}
