package com.example.demo.functionalInterafces;
interface Inter1{
	default void Test1() {
		System.out.println("Default Inter1");
	}
	
	static void Static1() {
		System.out.println("Inter 1 Static method");
	}
	
	void print();
}

/*
 * interface Inter2 extends Inter1 {
 * 
 * default void print3() { System.out.println("Inter 2 print 3"); }
 * 
 * }
 */

class Class1 implements Inter1{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Class 1 Print method");
	}
	
}

public class DefaultAndStaticMMethods {
	
	public static void main(String[] args) {
		Inter1 i = new Class1();
		i.Test1();
		Inter1.Static1();
		i.print();
		
		
	}

}
