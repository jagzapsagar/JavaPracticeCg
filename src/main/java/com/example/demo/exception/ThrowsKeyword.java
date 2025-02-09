package com.example.demo.exception;

class NotFound extends Exception{
	public NotFound() {
		super("Not Found Exception");
	}
}

public class ThrowsKeyword {
	
	
	public static void main(String[] args) throws NotFound {
		/*
		 * if(2==2) { throw new ArithmeticException("Exception Occured"); }
		 */
		ThrowsKeyword t = new ThrowsKeyword();
		t.Test(2);
	}
	
	public void Test(int no) throws NotFound {
		if(no==2) {
			throw new NotFound();
		}
	}

}
