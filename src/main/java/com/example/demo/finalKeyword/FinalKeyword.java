package com.example.demo.finalKeyword;

class Test{
	
	final static int no = 20;
	final int no2 = 30;
	final String str;
	

	public Test() {
		this.str = "";
		
		// TODO Auto-generated constructor stub
	}

	public Test(String s){
		this.str= s;
	}
	
	public void TestMethod() {
		final int no;
		//System.out.println(no);// we can use before it initialize
		no = 20;
	}
	
	public final void fTestMethod() {
		System.out.println("Final Method");
	}
}

class B extends Test{


	B(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	
	
}

public class FinalKeyword {
	public static void main(String[] args) {
		
		
		System.out.println(Test.no);
		Test t = new Test();
		System.out.println(t.no2);
	}

}
