package com.xworkz.programs.app.multilevel;

public class Steel extends Material {
	int weight;

	public Steel(String name, int price, int weight) {
		super(name, price);
		this.weight = weight;
		System.out.println("invoking String,int,int parameterized cons of steel");
	}

	public void display() {
		System.out.println("displaay Iron");
		super.display();
		System.out.println("weight:" + this.weight);
	}

	static void casting(Material material)

	{
		System.out.println("invoking material of Iron");
		if (material != null) {
			System.out.println("checking the material");
			if (material instanceof Iron) {
				Iron iron = (Iron) material;
				iron.display();
			}
			if (material instanceof Steel) {
				Steel steel = (Steel) material;
				steel.display();
			}
		}
	}

}
