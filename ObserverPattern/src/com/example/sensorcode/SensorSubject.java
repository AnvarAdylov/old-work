package com.example.sensorcode;

import java.util.HashSet;
import java.util.Set;

public class SensorSubject implements Sensed {
	private int eventsN;
	private Set<Listens> sensorListeners;
	
	public SensorSubject() {
		eventsN = 0;
		sensorListeners = new HashSet<Listens>();
	}
	
	@Override
	public void addListener(Listens o) {
		sensorListeners.add(o);
		
	}

	@Override
	public void removeListener(Listens o) {
		sensorListeners.remove(o);
		
	}

	@Override
	public void notifyListeners() {	
		for (Listens s : sensorListeners) {
			s.update();;
		}
		
	}

	public void eventHappened() {
		eventsN++;
		System.out.println("Sensor Subject: " + eventsN + " Events have happened");	
		notifyListeners();
	}

}
