package com.example.demo.inheritance;

public class MethodOvrLoading {
	
	/*
	 * public void add(int a) { System.out.println("Int arg method: "+a); }
	 */
	
	public void add(long a) {
		System.out.println("Long arg method: "+a);
	}
	public static void main(String[] args) {
		
		MethodOvrLoading obj = new MethodOvrLoading();
		obj.add(0);
		
	}

}
