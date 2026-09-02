package com.example.terms;

public class Multiplying extends Opers {

	public Multiplying(Term l, Term r) {
		super(l, r);
	}

	@Override
	public double getValue() {
		return this.leftVal.getValue() * this.rightVal.getValue();
	}
	// Returns the depth of the syntax tree 
		@Override
		public double getDepth() {
			return java.lang.Math.max(this.leftVal.getDepth(),this.rightVal.getDepth()) + 1;
		}

}
