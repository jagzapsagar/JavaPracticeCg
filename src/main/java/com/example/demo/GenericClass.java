package com.example.demo;

public class GenericClass<T> {
	
	private T obj;
	public GenericClass() {
		
	}
	
	public GenericClass(T obj) {
		this.obj=obj;
	}
	
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj= obj;
	}
	
	public static void main(String[] args) {
		GenericClass g = new GenericClass();
		g.setObj("Sagar");
		System.out.println(g.getObj());
		
		GenericClass g2 = new GenericClass();
		g2.setObj(20);
		System.out.println(g2.getObj());
	}

}
