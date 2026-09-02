package com.example.carsim;

import java.util.Random;

public class CarShopper {
	
	private CarDealer visitedDealer;
	
	private int askPrice;
	
	private int budget;
	
	private int minYear;
	
	private int numberOfOffers = 3;
	
	public CarShopper() {
		Random rand = new Random();
		
		askPrice = 8000 + rand.nextInt(5000);
		budget = askPrice + 5000;
		
		minYear = 2000 + rand.nextInt(15);
		
	}

	public void visitDealer(CarDealer dealer) { visitedDealer = dealer; }
	
	public void tryToBuy() {

		visitedDealer.setOffer(this, askPrice);
					
	}
	
	public void decideToBuy(Car c) {
		
		System.out.format("Year: %d Price: %d Budget: %d Minimum Year: %d \n", c.getYear(), c.getStickerPrice(), budget, minYear);
		
		Random rand = new Random();
		
		int uncertainty = rand.nextInt(5) - 2;
		
		if ((c.getYear() > (minYear + uncertainty)) && (c.getStickerPrice() < budget)) {
			numberOfOffers = 0;
			
			System.out.println("Bought!");
		} else {
			numberOfOffers--;
			
			if (numberOfOffers > 0) {
				visitedDealer.setOffer(this, askPrice);
			} else {
				System.out.println("Failure :(");
			}
		}
		
		
	}



}
