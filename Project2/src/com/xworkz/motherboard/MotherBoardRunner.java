package com.xworkz.motherboard;

public class MotherBoardRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		MotherBoard.methodStatic();
		MotherBoard ref = new MotherBoard("XYZ675");
		ref.display();
		
		MotherBoard ref1 = new MotherBoard("ABC567");
		ref1.display();

	}

}
