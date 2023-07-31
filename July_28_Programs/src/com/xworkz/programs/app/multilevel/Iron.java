package com.xworkz.programs.app.multilevel;

public class Iron extends Material {
	String type;

	public Iron(String name, int price, String type) {
		super(name, price);
		this.type = type;
		System.out.println("invoking String,int,String parameterizd cons of Iron");
	}

	@Override
	public void display() {
		System.out.println("display Iron");
		super.display();
		System.out.println("type:" + this.type);
	}

}
