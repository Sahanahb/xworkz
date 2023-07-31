package com.xworkz.programs.runner;

import com.xworkz.programs.app.multilevel.Iron;
import com.xworkz.programs.app.multilevel.Steel;

public class MaterialRunner {
	public static void main(String[] args) {
		Iron iron = new Iron("Iron", 1000, "TMT");
		iron.display();
		Steel steel = new Steel("Steel", 100, 2);
		steel.display();
	}

}
