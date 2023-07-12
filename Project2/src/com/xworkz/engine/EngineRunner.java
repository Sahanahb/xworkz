package com.xworkz.engine;

public class EngineRunner {
	public static void main(String[] args) {
		System.out.println("Running main");
		Engine.methodStatic();
		Engine ref = new Engine("Castrol");
		ref.display();
		
		Engine ref1 = new Engine("Servo");
		ref1.display();
	}

}
