package com.example.demo.inheritance;

  class A{
	  int a=20;
	  String name;
	public void runn() {
		System.out.println("In A class Method run");
		
		Integer a=new Integer(20);
		Integer b=new Integer(20);
		
		if(a.compareTo(b)==0) {
			System.out.println("True");
		}
		
		
	}
	
	public void show() {
		System.out.println("show in A");
	}
}
  
  class B extends A{
	  int a=40;
	  @Override
	  public void runn() {
		  System.out.println("In B Class run method");
		  //super.runn();
		  System.out.println(name);
	  }
	  
	  public void shows() {
			System.out.println("shows in B");
		}
  }

public class InheritanceEx {
	public static void main(String[] args) {
		
		A a2=new A();
		a2.runn();
		a2.show();
		
		System.out.println("**** A a= new B(); ****");
		A a= new B();
		System.out.println("A: "+a.a);
		a.runn();
		a.show();
		//a.shows(); // NOT Allowed
		
		
		System.out.println("B b= new B()");
		B b= new B();
		b.runn();
		b.show();
		b.shows();
		b.name = "TestString"; //private field nit allow
		System.out.println(b.name);
		System.out.println(b.a);
		
		
		
		//B b2=new A();
		
		
	}

}
