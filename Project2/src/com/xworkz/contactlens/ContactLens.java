package com.xworkz.contactlens;

public class ContactLens {
	static String color;
	String power;
	
	static void methodStatic() {
		color = "ColourLess";
	}
	ContactLens(String power) {
		this.power=power;
	}
	void display () {
		System.out.println("Static variable: " + color);
		System.out.println("Instance Variable: " + power);

		
	}
     
}
