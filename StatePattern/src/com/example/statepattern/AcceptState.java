package com.example.statepattern;

public class AcceptState implements State {
	
	
	public AcceptState(StateContext x) {
	}
	
	@Override
	public void action1() {
		System.out.println("in accept state");
	}

	@Override
	public void action2() {
		System.out.println("in accept state");
	}

}
