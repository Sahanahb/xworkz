package com.xworkz.robot;

public class Robot {
	static String model;
	String talking;
	
	static void methodStatic() {
		model = "ABC675";
	}
	Robot(String talking) {
		this.talking=talking;
	}
	void display () {
		System.out.println("Static variable: " + model);
		System.out.println("Instance Variable: " + talking);
	}

}
