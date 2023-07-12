package com.xworkz.numberPlate;

public class NumberPlate {
	static String num;
	String vechileNo;
	
	static void methodStatic() {
		num = "4682";
	}
	NumberPlate(String vechileNo) {
		this.vechileNo=vechileNo;
	}
	void display () {
		System.out.println("Static variable: " + num);
		System.out.println("Instance Variable: " + vechileNo);
	}

}
