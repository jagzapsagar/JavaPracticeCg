package com.example.demo.oops;

abstract class AbstractE {
	public abstract void print();

	public abstract void print2();

	public void ConMethod() {
		System.out.println("ConMethod called");
	}
}

class child extends AbstractE {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub

	}

}

public class AbstractClass {

	public static void main(String[] args) {
		AbstractE a = new child();
		a.ConMethod();
	}

}
