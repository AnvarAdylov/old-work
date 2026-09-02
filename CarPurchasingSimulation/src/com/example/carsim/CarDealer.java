package com.example.carsim;

import java.util.ArrayList;

public class CarDealer {

	private ArrayList<Car> cars;
	
	public CarDealer(int n) {
		cars = new ArrayList<Car>();
		
		for (int i = 0 ; i < n ; i++) {
			cars.add(Car.getRandomCar());
		}
	}
	
	public void setOffer(CarShopper s, int askPrice) {
		s.decideToBuy(cars.get(0));
	}

}
