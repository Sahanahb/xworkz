package com.xworkz.hotel;

public class Owner {
	String name;
	int age; 
	String gender;
	int noOfKids;
	
	Owner(String name,int age, int noOfKids,String gender){
		this.age=age;
		this.noOfKids=noOfKids;
		this.gender=gender;
	}
	
	void printInfo() {
		System.out.println("Owner Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+this.gender);
		System.out.println("No Of Kids : "+this.noOfKids);
		
	}

}
