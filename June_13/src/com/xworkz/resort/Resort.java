package com.xworkz.resort;

public class Resort {
	String name="The Vana Valley ";
	String ownerName;
	ResortRoomType type;
	boolean breakFast;
	
	void setType(ResortRoomType type) {
		this.type=type;
	}
	Resort(String ownerName, boolean breakFast){
		this.ownerName=ownerName;
		this.breakFast=breakFast;
	}
	
	void display() {
		System.out.println("Resort Name : "+name);
		System.out.println("Resort Owner Name : "+ownerName);
		System.out.println("Room type : "+this.type);
		System.out.println("Breakfast : "+this.breakFast);
		
	}

}
