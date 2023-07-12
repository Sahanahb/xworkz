package com.xworkz.printer;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Printer.methodStatic();
		Printer ref = new Printer("Colour");
		ref.display();
		
		Printer ref1 = new Printer("White and Black");
		ref1.display();

	}

}
