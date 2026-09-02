package com.example.sensorcode;

public class SensorClient {
	
	
	public static void main(String[] args) {

		SensorSubject sens = new SensorSubject();
		SensorListener o1 = new SensorListener("Listener 1",sens);
		SensorListener o2 = new SensorListener("Listener 2",sens);
				
		Thread t = new Thread(new SensorEnv(sens));
		t.start();
	}

}
