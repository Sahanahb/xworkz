package com.xworkz.theater;

import com.xworkz.resort.ResortRoomType;

public class Theater {
	String name;
	String ownerName = "Raghu";
	TicketType type;
	boolean parking;
	
	void setType(TicketType type) {
		this.type=type;
	}
	Theater(String name, boolean parking){
		this.name=name;
		this.parking=parking;
	}
	
	void display() {
		System.out.println("Theater Name : "+name);
		System.out.println("Theater Owner Name : "+ownerName);
		System.out.println("Ticket type : "+this.type);
		System.out.println("parking : "+this.parking);
		
	}

}
