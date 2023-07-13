package com.xworkz.battery;

public class BatteryRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Battery battery1 = new Battery(5435,2);
		battery1.setType(BatteryType.LI_ION);
		battery1.display();
		
		Battery battery2 = new Battery(9765,4);
		battery2.setType(BatteryType.ALKALINE);
		battery2.display();
	}

}
