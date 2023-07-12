package com.xworkz.vacuum;

public class VacuuumRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Vacuum.methodStatic();
		Vacuum ref = new Vacuum(7.999);
		ref.display();
		
		Vacuum ref1 = new Vacuum(8.999);
		ref1.display();

	}

}
