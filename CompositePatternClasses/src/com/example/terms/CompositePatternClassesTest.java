package com.example.terms;

public class CompositePatternClassesTest {
	public static void main(String[] args)  {
		Multiplying x = new Multiplying (
				new Adding ( new Vals (2.0) , new Vals (2.0)) ,
				new Adding ( new Vals (2.0) ,
				new Multiplying ( new Vals (2.0) , new Vals (2.0))
				)
				);
		Multiplying y = new Multiplying (
				new Adding ( new Multiplying ( new Vals (2.0) , new Adding ( new Vals (2.0) , new Vals (2.0))) , new Vals (2.0)) ,
				new Adding ( new Vals (2.0) ,
				new Multiplying ( new Vals (2.0) , new Adding ( new Vals (2.0) , new Vals (2.0))))
				);
		Multiplying z = new Multiplying (new Vals (2.0) , new Vals (2.0)); 
		Vals t = new Vals(2.0);
		System.out.println(x.getValue());
		System.out.println(x.getDepth());
		System.out.println(y.getValue());
		System.out.println(y.getDepth());
		System.out.println(z.getValue());
		System.out.println(z.getDepth());
		System.out.println(t.getValue());
		System.out.println(t.getDepth());
	}
}
