package com.example.sensorcode;

public class SensorListener  implements Listens {
	
	private String name;
	
	public SensorListener(String a,Sensed b) {
		name = a;
		b.addListener(this);
	}
	
	
	@Override
	public void update() {
		System.out.println("Sensor Listener: Update detected by " + name);	
	}

}
