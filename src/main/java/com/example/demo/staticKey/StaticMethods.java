package com.example.demo.staticKey;

public class StaticMethods {
	
	 static void print() {
		 System.out.println("Static Print method");
	 }
	 
	 
	public static void main(String[] args) {
		System.out.println("Main Method");
		//StaticMethods.print();
		StaticMethods obj  = new StaticMethods();
		obj.print();
		
		
	}

}
