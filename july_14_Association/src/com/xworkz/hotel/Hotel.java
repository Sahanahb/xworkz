package com.xworkz.hotel;

import com.xworkz.movie.Director;

public class Hotel {
	String name;
	String location = "Bangalore";
	int noOfStaff;
	int noOfRooms;
	
	void setStaff(int noOfStaff) {
		this.noOfStaff=noOfStaff;
	}
	Hotel(String name, int noOfRooms){
		this.name=name;
		this.noOfRooms=noOfRooms;
	}
	
	Owner owner = new Owner("RAJ",40,2,"Male");
	
	void printInfo() {
		System.out.println("Hotel Name : "+name);
		System.out.println("Hotel Location : "+location);
		System.out.println("No Of Staff : "+this.noOfStaff);
		System.out.println("No Of Rooms : "+this.noOfRooms);
		this.owner. printInfo();
		
	}


}
