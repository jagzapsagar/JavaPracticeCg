package com.example.demo.interfaces;

interface inter1{
	void add(int a,int b);
}

class TestClass implements inter1{
	public void add(int a,int b) {
		System.out.println("in class");
	}
}

public class TestInterface  {

	public static void main(String[] args) {
		inter1 a = (k,l) -> System.out.print("add");
		//a.add(10);
		
		inter1 i = new TestClass();
		i.add(10,25);
	}


}
