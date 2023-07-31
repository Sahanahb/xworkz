package com.xworkz.programs.app.single;

public class Cat extends Animals {
	String breed;

	public Cat(String name, String type, String breed) {
		super(name, type);
		this.breed = breed;
		System.out.println("invoking string,string,string of cat");
	}

	@Override
	public void display() {
		System.out.println("display");
		super.display();
		System.out.println("breed:" + this.breed);
	}
}
