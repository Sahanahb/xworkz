package com.xworkz.motherboard;

public class MotherBoard {
	static String manufacturer;
	String model;
	
	static void methodStatic() {
		manufacturer = "ABC Comapny";
	}
	MotherBoard(String model) {
		this.model=model;
	}
	void display () {
		System.out.println("Static variable: " + manufacturer);
		System.out.println("Instance Variable: " + model);
	}

}
