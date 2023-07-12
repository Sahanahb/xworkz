package com.xworkz.tv;

public class TVRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		TV.methodStatic();
		TV ref = new TV(52.000);
		ref.display();
		
		TV ref1 = new TV(32.999);
		ref1.display();

	}

}
