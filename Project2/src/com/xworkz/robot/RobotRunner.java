package com.xworkz.robot;

public class RobotRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Robot.methodStatic();
		Robot ref = new Robot("yes");
		ref.display();
		
		Robot ref1 = new Robot("No");
		ref1.display();


	}

}
