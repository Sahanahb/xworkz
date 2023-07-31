package com.xworkz.programs.runner;

import com.xworkz.programs.app.City;

public class CityRunner {
	public static void main(String[] args) {
		
		System.out.println("running main");
		City city = new City("Swaroop", 10000);
		city.Display();
	}

}
