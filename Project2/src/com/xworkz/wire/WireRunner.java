package com.xworkz.wire;

public class WireRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Wire.methodStatic();
		Wire ref = new Wire(25);
		ref.display();
		
		Wire ref1 = new Wire(50);
		ref1.display();
	}

}
