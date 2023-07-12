package com.xworkz.numberPlate;

public class NumberPlateRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		NumberPlate.methodStatic();
		NumberPlate ref = new NumberPlate("KA-13-ET");
		ref.display();
		
		NumberPlate ref1 = new NumberPlate("KA-04-MS");
		ref1.display();

	}

}
