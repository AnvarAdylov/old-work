package com.example.carsim;

import java.util.Random;


public class Car {
	private int stickerPrice;
	private int year;
	
	public static Car getRandomCar() {
		Random rand = new Random();
		Car c = new Car(rand.nextInt(20000),2000 + rand.nextInt(15));
		
		return c;
	}
	
	public Car(int s, int y) {
		this.stickerPrice = s;
		this.year = y;
	}
	
	public int getYear() {return year;}
	
	public int getStickerPrice() {return stickerPrice;}
	

}
