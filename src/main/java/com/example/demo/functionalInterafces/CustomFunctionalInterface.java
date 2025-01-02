package com.example.demo.functionalInterafces;

interface inter{
	void say();
}

interface addeble{
	int add(int a, int b);
}

public class CustomFunctionalInterface {
	public static void main(String[] args) {
		inter i = () -> {
			System.out.println("Called Say method");
		};
		i.say();
		
		// addeble implementing
		//Lembda expression without using return keyword
		addeble a = ((x,b) -> x+b);
		System.out.println(a.add(4, 8));
		
		//using return keyword
		addeble a2 = (f,g) -> {
			return f+g;
		};
		System.out.println(a2.add(78, 12));
	}
}
