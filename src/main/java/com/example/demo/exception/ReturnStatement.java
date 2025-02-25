package com.example.demo.exception;

public class ReturnStatement {
	public static void main(String[] args) {
		
	}
	public int Test() {
		try {
			return 10/2;
		}catch(Exception e) {
			return -1;
		}
		
		//write in finally block 
		//System.out.println("asd"); //unreacheble statement
	}

}
