package com.xworkz.rope;

public class Rope {
	static String type;
	int meter;
	
	static void methodStatic() {
		type = "Jute";
	}
	Rope(int meter) {
		this.meter=meter;
	}
	void display () {
		System.out.println("Static variable: " + type);
		System.out.println("Instance Variable: " + meter);
	}

}
