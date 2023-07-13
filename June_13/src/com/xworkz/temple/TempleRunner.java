package com.xworkz.temple;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Temple temple1 = new Temple("Poojari","Bangalore");
		temple1.setName(TempleName.RAMA);
		temple1.display();
		
		Temple temple2 = new Temple("Poojari","Hassan");
		temple2.setName(TempleName.HANUMAN);
		temple2.display();

	}

}
