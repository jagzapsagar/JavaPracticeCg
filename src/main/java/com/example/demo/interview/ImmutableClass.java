package com.example.demo.interview;

final class TestClass {
	final int id;
	final String name;
	public TestClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

class ImmutableClass{
	public static void main(String[] args) {
		TestClass t = new TestClass(1,"Sagar");
		System.out.println(t.getId()+" "+ t.getName());
	}
}
