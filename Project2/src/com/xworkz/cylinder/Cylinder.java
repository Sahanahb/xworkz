package com.xworkz.cylinder;

public class Cylinder {
	static String name;
	float height;
	
	static void displayStatic() {
		name = "HP";
	}
	Cylinder(float height) {
		this.height=height;
	}
	void display () {
		System.out.println("Static variable: " + name);
		System.out.println("Instance Variable: " + height);
	}

}
