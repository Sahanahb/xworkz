package com.xworkz.movie;

public class MovieRunner {

	public static void main(String[] args) {
		System.out.println("Running main..");
		Movie movie1 = new Movie("Kanthara",16);
		movie1.setType("Devostional");
		movie1.printInfo();
		
		Movie movie2 = new Movie("SHPS Kasargodu",4);
		movie2.setType("Drama");
		movie2.printInfo();

	}

}
