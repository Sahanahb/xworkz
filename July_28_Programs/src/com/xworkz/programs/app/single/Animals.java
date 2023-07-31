package com.xworkz.programs.app.single;

public class Animals {
		String name;
		String type;

		public Animals(String name, String type) {
			System.out.println("invoking string,string, parameterized  cons of animals");
			this.name = name;
			this.type = type;
		}

		public void display() {
			System.out.println("invoking the display");
			System.out.println("name:" + this.name);
			System.out.println("type:" + this.type);
		}
	}
