package com.xworkz.tv;

public class TV {
	static String brand;
	double price;
	
	static void methodStatic() {
		brand = "LG";
	}
	TV(double price) {
		this.price=price;
	}
	void display () {
		System.out.println("Static variable: " + brand);
		System.out.println("Instance Variable: " + price);
	}

}
