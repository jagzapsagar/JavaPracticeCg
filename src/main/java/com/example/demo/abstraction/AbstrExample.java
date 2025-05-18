package com.example.demo.abstraction;

import com.example.demo.interfaces.main;

abstract class test{
	
	public abstract void testMethod();
	
	void method() {
		System.out.println("Test class method");
	}
}

public class AbstrExample extends test {
	public static void main(String[] args) {
		
	}

	// abstract method of parent class must be implemented in child class
	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		
	}

}
