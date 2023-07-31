package com.xworkz.programs.runner;

import com.xworkz.programs.app.single.Animals;
import com.xworkz.programs.app.single.Cat;

public class AnimalsRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		Animals animals = new Animals("cat", "wild_cat");
		animals.display();
		Cat cat = new Cat("cat", "wild_cat", "Forest_cat");
		cat.display();
		
	}

}
	
	
