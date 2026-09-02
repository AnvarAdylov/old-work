/**
 * 
 */
package com.example.statepattern;

public class StateTest {
	
	public static void main(String[] args) {
		StateContext sc = new StateContext();
		
		sc.action2(); // "in reject state"
		sc.action2(); // "in reject state"
		sc.action1(); // "reject --> accept"
		sc.action1(); // "in accept state"
	}

}
