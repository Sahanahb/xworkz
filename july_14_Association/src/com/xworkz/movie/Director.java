package com.xworkz.movie;

public class Director {
	String name;
	int age; 
	int experince = 10;
	int noMovies;
	
	Director(String name,int age, int noMovies){
		this.age=age;
		this.noMovies=noMovies;
	}
	
	void printInfo() {
		System.out.println("Director Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Exprience : "+this.experince);
		System.out.println("NoOfMovies : "+this.noMovies);
		
	}

}
