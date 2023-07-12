package com.xworkz.submarine;

public class Submarin {
	static String name;
	double length;
	
	static void methodStatic() {
		name = "Collins-class";
	}
	Submarin(double length) {
		this.length=length;
	}
	void display () {
		System.out.println("Static variable: " + name);
		System.out.println("Instance Variable: " + length);
	}

}
