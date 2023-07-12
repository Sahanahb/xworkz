package com.xworkz.simCard;

public class SimCard {
	static String type;
	String network;
	
	static void methodStatic() {
		type = "4G/5G";
	}
	SimCard(String network) {
		this.network=network;
	}
	void display () {
		System.out.println("Static variable: " + type);
		System.out.println("Instance Variable: " + network);
	}

}
