package com.xworkz.village.outer;

import com.xworkz.village.inner.Village;

public class NewVillage extends Village{

	@Override
	public void exit() {
		System.out.println("Running Exit in new Village");
	}

}
