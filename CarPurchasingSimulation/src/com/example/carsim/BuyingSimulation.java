package com.example.carsim;

public class BuyingSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarDealer dealer = new CarDealer(10);
		
		CarShopper shopper = new CarShopper();
		
		shopper.visitDealer(dealer);
		
		shopper.tryToBuy();

	}

}