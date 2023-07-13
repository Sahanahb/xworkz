package com.xworkz.theater;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Running main..");
		Theater theater1 = new Theater("SBG",true);
		theater1.setType(TicketType.BALKHANI);
		theater1.display();
		
		System.out.println("Running main..");
		Theater theater2 = new Theater("Sahyadri",false);
		theater2.setType(TicketType.FIRST_CLASS);
		theater2.display();
		

	}

}
