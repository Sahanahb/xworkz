package com.xworkz.contactlens;

public class ContactLensRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		ContactLens.methodStatic();
		ContactLens ref = new ContactLens("-2");
		ref.display();
		
		ContactLens ref1 = new ContactLens("+2");
		ref1.display();

	}

}
