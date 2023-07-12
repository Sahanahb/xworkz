package com.xworkz.simCard;

public class SimCardRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		SimCard.methodStatic();
		SimCard ref = new SimCard("Airtle");
		ref.display();
		
		SimCard ref1 = new SimCard("Jio");
		ref1.display();

	}

}
