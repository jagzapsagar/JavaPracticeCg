package com.example.demo.exception;

public class SimpleExceptionZero {
	
	public static void main(String[] args) {
		int a=12;
		int b = 0;
		int result;
		
		try {
			result = a/b;
			System.out.println(result);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		System.out.println("Endddddddddd");
	}
	

}
