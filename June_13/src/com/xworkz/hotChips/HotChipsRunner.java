package com.xworkz.hotChips;

public class HotChipsRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		HotChips chips1 = new HotChips(20,50);
		chips1.setType(ChipsType.SALTED);
		chips1.display();

		HotChips chips2 = new HotChips(40,100);
		chips2.setType(ChipsType.PEPPER);
		chips2.display();

	}

}
