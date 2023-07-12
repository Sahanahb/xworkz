package com.xworkz.engine;

public class Engine {
	static String modle;
	String oil;
	
	static void methodStatic() {
		modle = "MC2398";
	}
	Engine(String oil) {
		this.oil=oil;
	}
	void display () {
		System.out.println("Static variable: " + modle);
		System.out.println("Instance Variable: " + oil);
	}

}
