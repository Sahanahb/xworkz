package com.xworkz.fabric;

public class Fabric {
	static String type;
	double meter;
	
	static void methodStatic() {
		type = "Cotton";
	}
	Fabric(double meter){
		this.meter =  meter;
	}
	void display() {
		System.out.println("Static variable: " + type);
		System.out.println("Instance Variable: " + meter);
	}


}
