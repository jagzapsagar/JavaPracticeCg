package com.example.demo.exception;

class InavalidAge extends Exception{
	InavalidAge() {
		super(" Default msg: Invalid Age");
	}
	
	InavalidAge(String msg){
		super(msg);
	}
}

public class CustomException {
	public static void main(String[] args) {
		
		int age = 12;
		
		try {
			if(age<18) {
				throw new InavalidAge();
			}else {
				System.out.println("Welcome for vote");
			}
		}catch(InavalidAge e) {
			System.out.println(e);
		}
		
	}

}
