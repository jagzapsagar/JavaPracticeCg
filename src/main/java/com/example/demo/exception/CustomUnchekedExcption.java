package com.example.demo.exception;

class InvalidAge extends RuntimeException{

	public InvalidAge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvalidAge(String msg) {
		super(msg);
	}
}

public class CustomUnchekedExcption {
	public static void main(String[] args) {
		int age =22;
		if(age <18) {
			throw new InvalidAge("Invalid ageeee");
		}else {
			System.out.println("Vote");
		}
		
	}

}
