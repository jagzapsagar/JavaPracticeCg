package com.example.demo.generics;

public class GenricMethods {
	
	public <T> void print(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		GenricMethods g = new GenricMethods();
		g.print(20);
		g.print("Story On Java");
	}

}
