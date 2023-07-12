package com.xworkz.train;

public class Train {
	static String name;
	int tarinNum;
	
	static void methodStatic() {
		name = "Vande Bharath";
		 
	}
	Train(int tarinNum) {
		this.tarinNum=tarinNum;
	}
	void display () {
		System.out.println("Static variable: " + name);
		System.out.println("Instance Variable: " + tarinNum);
	}

}
