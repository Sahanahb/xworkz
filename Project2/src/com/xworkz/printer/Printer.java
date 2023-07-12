package com.xworkz.printer;

public class Printer {
	static String brand;
	String type;
	
	static void methodStatic() {
		brand = "Samsung";
	}
	Printer(String type) {
		this.type=type;
	}
	void display () {
		System.out.println("Static variable: " + brand);
		System.out.println("Instance Variable: " + type);
	}

}
