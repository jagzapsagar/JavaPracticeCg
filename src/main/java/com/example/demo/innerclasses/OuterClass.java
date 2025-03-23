package com.example.demo.innerclasses;

public class OuterClass {
	
	private class Inner{
		public void print() {
			System.out.println("Inner class Print method");
		}
	}
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		//OuterClass.Inner inner = outer.new Inner();
		OuterClass.Inner inner = outer.new Inner();
		inner.print();
	}

}
