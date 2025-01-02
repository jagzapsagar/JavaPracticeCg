package com.example.demo.exception;

public class TryWithoutCatch {
	public static void main(String[] args) {
		int a=12;
		int b = 0;
		int result;
		
		try {
			result = a/b;
			System.out.println(result);
		}finally {
			System.out.println("Finally executed");
		}
	}

}
