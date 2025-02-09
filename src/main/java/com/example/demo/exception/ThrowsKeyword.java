package com.example.demo.exception;

class NotFound extends Exception{
	public NotFound() {
		super("Not Found Exception");
	}
}

class NotFound2 extends Exception{
	public NotFound2() {
		super("Not Found Exception");
	}
}

class RuntimeNotFound extends RuntimeException{
	public RuntimeNotFound() {
		super("Run time Not Found Exception");
	}
}

public class ThrowsKeyword {
	
	
	public static void main(String[] args) throws NotFound {
		/*
		 * if(2==2) { throw new ArithmeticException("Exception Occured"); }
		 */
		ThrowsKeyword t = new ThrowsKeyword();
		//t.Test(2);
		t.RuntimeMethod();
	}
	
	public void Test(int no) throws NotFound, NotFound2 {
		if(no==2) {
			throw new NotFound();
		}if(no==3) {
			throw new NotFound2();
		}
	}
	
	public void RuntimeMethod() {
		if(2==2) {
			throw new RuntimeNotFound();
		}
	}

}
