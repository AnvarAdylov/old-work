package com.example.terms;

public class Vals extends Term {
	private double myValue;
	
	public Vals(double m) {
		this.myValue = m;
	}
	
	public double getValue() {
		return myValue;
	}
	// Returns the depth of the syntax tree 
	public double getDepth() {
		return 0;
	}
	
}
