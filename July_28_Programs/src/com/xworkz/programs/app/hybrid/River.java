package com.xworkz.programs.app.hybrid;

public class River extends BayOfBengal {
	String location;

	public River(String name, int area, String beaches, String location) {
		super(name, area, beaches);
		this.location = location;
		System.out.println("invoking string,int,string,string of river");
	}

	@Override
	public void display() {
		System.out.println("display");
		super.display();
		System.out.println("location" + this.location);
	}

}
