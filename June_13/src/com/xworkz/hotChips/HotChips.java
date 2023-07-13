package com.xworkz.hotChips;

import com.xworkz.battery.BatteryType;

public class HotChips {
	String name="Potto";
	ChipsType type;
	int cost;
	int grams;
	
	void setType(ChipsType type) {
		this.type = type;
	}
	
	HotChips(int cost, int grams){
		this.cost=cost;
		this.grams=grams;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Chips Type : "+this.type + " Battery");
		System.out.println("Cost of the Chips : "+this.cost);
		System.out.println("No of Grams : "+grams);
	}
	


}
