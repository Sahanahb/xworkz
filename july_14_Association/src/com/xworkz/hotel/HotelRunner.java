package com.xworkz.hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Running Main..");
		Hotel hotel1 = new Hotel("RAMA",500);
		hotel1.setStaff(100);
		hotel1.printInfo();
		
		Hotel hotel2 = new Hotel("SUMUKHA",300);
		hotel2.setStaff(50);
		hotel2.printInfo();
		

	}

}
