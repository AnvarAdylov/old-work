package com.example.terms;

abstract public class Opers extends Term {
	protected Term leftVal;
	protected Term rightVal;
	
	public Opers(Term l, Term r) {
		this.leftVal = l;
		this.rightVal = r;
	}
	
}
