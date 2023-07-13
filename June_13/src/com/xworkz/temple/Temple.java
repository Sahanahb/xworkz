package com.xworkz.temple;

import com.xworkz.theater.TicketType;

public class Temple {
	TempleName name;
	int foundedYear = 1995;
	String priest;
	String location;
	
	void setName(TempleName name) {
		this.name=name;
	}
	Temple(String priest, String location){
		this.priest=priest;
		this.location=location;
	}
	
	void display() {
		System.out.println("Temple Name : "+name);
		System.out.println("Temple foundedYear : "+foundedYear);
		System.out.println("Temple priest : "+this.priest);
		System.out.println("location : "+this.location);
		
	}

}
