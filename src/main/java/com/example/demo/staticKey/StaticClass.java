package com.example.demo.staticKey;

public class StaticClass {
	
	static class Test{
		static int id = 23;
		int roll =234; // we can not access directely
	}
	
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println();
		
	}

}
