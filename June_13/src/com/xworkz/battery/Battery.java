package com.xworkz.battery;

import com.xworkz.temple.TempleName;

public class Battery {
	String name="LENTO";
	BatteryType type;
	int cost;
	int noOfBatteries;
	
	void setType(BatteryType type) {
		this.type = type;
	}
	
	Battery(int cost, int noOfBatteries){
		this.cost=cost;
		this.noOfBatteries=noOfBatteries;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Battery Type : "+this.type + " Battery");
		System.out.println("Cost of the batteries : "+this.cost);
		System.out.println("No of Batteries : "+noOfBatteries);
	}
	


}
