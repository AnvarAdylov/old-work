/**
 * 
 */
package com.example.statepattern;


public class StateContext {
	
	State acceptState;
	State rejectState;
	
	State s;
	
	public StateContext() {
		this.rejectState = new RejectState(this);
		this.acceptState = new AcceptState(this);
		
		s = this.rejectState;
	}
	
	public void action1() {
		s.action1();
	}
	
	public void action2() {
		s.action2();
	}
	
	public void setState(State s) {
		this.s = s;
	}
	
	public State getAcceptState() {
		return acceptState;
	}
	
	public State getRejectState() {
		return rejectState;
	}

}
