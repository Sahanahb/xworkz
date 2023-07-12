package com.xworkz.vacuum;

public class Vacuum {
	static String brand;
	double price;
	
	static void methodStatic() {
		brand = "Philips";
	}
	Vacuum(double price) {
		this.price=price;
	}
	void display () {
		System.out.println("Static variable: " + brand);
		System.out.println("Instance Variable: " + price);
	}

}
