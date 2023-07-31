package com.xworkz.programs.runner;

import com.xworkz.programs.app.hierarchy.Godavari;
import com.xworkz.programs.app.hierarchy.Tributary;
import com.xworkz.programs.app.hierarchy.Yamuna;

public class RiversRunner {
	
	public static void main(String[] args) {
		System.out.println("running mmain");
		Yamuna yamuna = new Yamuna();
		yamuna.display();
		Yamuna yamuna1 = new Yamuna("Yamuna", 2546, "Hymalaya");
		yamuna1.display();
		Godavari godavari = new Godavari("Godavari", 3245, 1297);
		godavari.display();
		Tributary tributary = new Tributary("Krishna", 103, 100, "Thungabhadra");
		tributary.display();
	}

}
