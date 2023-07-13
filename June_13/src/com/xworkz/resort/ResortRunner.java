package com.xworkz.resort;

public class ResortRunner {

	public static void main(String[] args) {
		Resort resort1 = new Resort("Murali",true);
		resort1.setType(ResortRoomType.JUNIOR_SUITES);
		resort1.display();
		
		Resort resort2 = new Resort("Rakshith", false);
		resort2.setType(ResortRoomType.STANDARD_SUITE);
		resort2.display();
	}

}


