package com.xworkz.programs.app;

public final class City {
	final String name = "Hassan";
	final String MLA;
	final int noOfHouses;

	public City(String MLA, int noOfHouses) {
		this.MLA = MLA;
		this.noOfHouses = noOfHouses;
		System.out.println("invoking String,int paarameterized cons of city");
	}

	public void Display() {
		System.out.println("display City");
		System.out.println("name:" + this.name);
		System.out.println("MLA:" + this.MLA);
		System.out.println("noOfHouses:" + this.noOfHouses);
	}

}
