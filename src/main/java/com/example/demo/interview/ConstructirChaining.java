package com.example.demo.interview;

public class ConstructirChaining {

	public String name;
	public int id;

	// this keyword use to call another constructor in same class
	public ConstructirChaining(String name) {
		this(name, 25); // control goes to 2nd constructor 
		System.out.println("Name wala constructor"); // then execute this line
	} //thats why 2nd constructor print sysout 1st

	public ConstructirChaining(String name, int id) {
		this.id = id;
		this.name = name;

		System.out.println(id + name);
	}
	
	// it is not a constrcutor it will treat as Method
	// Constructor doent have any return type even void 
	// we can not make constructor final 
	// it can be private in the case of Singlton class
	public void ConstructirChaining() { 
		System.out.println("With return type");
	}

	public static void main(String[] args) {
		ConstructirChaining o = new ConstructirChaining("ABC");
		o.ConstructirChaining();
	}

}
