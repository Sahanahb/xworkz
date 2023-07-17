package com.xworkz.movie;

public class Movie {
	String name;
	String heroName = "Rishab Shetty";
	String type;
	int budget;
	
	void setType(String type) {
		this.type=type;
	}
	Movie(String name, int budget){
		this.name=name;
		this.budget=budget;
	}
	
	Director director = new Director("Rishab Shetty",40,7);
	
	void printInfo() {
		System.out.println("Movie Name : "+name);
		System.out.println("Movie Hero Name : "+heroName);
		System.out.println("Movie type : "+this.type);
		System.out.println("Movie Budget : "+this.budget);
		this.director. printInfo();
		
	}

}
