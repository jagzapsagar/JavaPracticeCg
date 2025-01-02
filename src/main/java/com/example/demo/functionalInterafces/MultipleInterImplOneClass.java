package com.example.demo.functionalInterafces;

interface InterA {
	void print();
	
	default void default1() {
		System.out.println("default Inter 1");
	}
}

interface InterB{
	void print();
	
	
	  default void default2() { 
		  System.out.println("default Inter 2"); 
		  }
	 
}

public class MultipleInterImplOneClass implements InterA, InterB {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}
	
	
	public static void main(String[] args) {
		InterA i = new MultipleInterImplOneClass();
		i.default1();
		i.print();
	}
	

}
