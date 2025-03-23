package com.example.demo.generics;

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
		//GenericClass g = new GenericClass(); // for any data type
		GenericClass<String> obj1 = new GenericClass(); // For String Data type
		obj1.setObj("Story On Java");
		System.out.println(obj1.getObj());
		
		GenericClass<Integer> obj2 = new GenericClass();
		obj2.setObj(20);
		System.out.println(obj2.getObj());
	}

}
