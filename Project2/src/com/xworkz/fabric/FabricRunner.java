package com.xworkz.fabric;

public class FabricRunner {
	public static void main(String[] args) {

		System.out.println("Running main");
		Fabric.methodStatic();
		Fabric ref = new Fabric(1.30);
		ref.display();
		
		Fabric ref1 = new Fabric(6);
		ref1.display();

	}

}
