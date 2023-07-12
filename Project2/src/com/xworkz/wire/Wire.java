package com.xworkz.wire;

public class Wire {
	static String brand;
	int meter;
	
	static void methodStatic() {
		brand = "Havells";
	}
	Wire(int meter) {
		this.meter=meter;
	}
	void display () {
		System.out.println("Static variable: " + brand);
		System.out.println("Instance Variable: " + meter);
	}

}
