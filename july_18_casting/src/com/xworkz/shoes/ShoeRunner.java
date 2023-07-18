package com.xworkz.shoes;

public class ShoeRunner {

	public static void main(String[] args) {
		Shoe shoe1 = new Shoe(2000, ShoeColor.WHITE, ShoeSize.SIX);
		ShoeUtil.check(shoe1);
		
		Shoe shoe2 = new Puma("Arne Freundt", "India", 3500, ShoeColor.BLACK, ShoeSize.SEVEN);
		ShoeUtil.check(shoe2);
		
		Shoe shoe3 = new Nike("John Donahoe", "Rory Mcllory", 4000, ShoeColor.SKY_BLUE, ShoeSize.TEN);
		ShoeUtil.check(shoe3);
	}

}
