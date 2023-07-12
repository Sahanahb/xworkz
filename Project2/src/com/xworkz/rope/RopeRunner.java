package com.xworkz.rope;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Rope.methodStatic();
		Rope ref = new Rope(10);
		ref.display();
		
		Rope ref1 = new Rope(45);
		ref1.display();

	}

}
