package com.xworkz.train;

public class TrainRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Train.methodStatic();
		Train ref = new Train(984567);
		ref.display();
		
		Train ref1 = new Train(267895);
		ref1.display();

	}

}
