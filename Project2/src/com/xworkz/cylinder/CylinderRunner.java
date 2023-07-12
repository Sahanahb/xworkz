package com.xworkz.cylinder;

public class CylinderRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Cylinder.displayStatic();
		Cylinder ref = new Cylinder(75);
		ref.display();
		
		Cylinder ref1 = new Cylinder(80);
		ref1.display();

	}

}
