package com.example.statepattern;

public class RejectState implements State {
	StateContext sup;	
	
	public RejectState(StateContext x) {
		sup = x;
	}
	
	@Override
	public void action1() {
		System.out.println("reject --> accept");
		sup.setState(sup.acceptState);
	}

	@Override
	public void action2() {
		System.out.println("in reject state");
	}

}
