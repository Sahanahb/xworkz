package com.xworkz.submarine;

public class Submarinrunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Submarin.methodStatic();
		Submarin ref = new Submarin(77.8);
		ref.display();
		
		Submarin ref1 = new Submarin(7.8);
		ref1.display();

	}

}
