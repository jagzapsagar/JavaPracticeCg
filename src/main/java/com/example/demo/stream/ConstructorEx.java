package com.example.demo.stream;

class SingltonDemo {

	private static SingltonDemo intance;

	private SingltonDemo() {

	}

	public static SingltonDemo getInstance() {
		if (intance == null) {
			synchronized(SingltonDemo.class) {
				if (intance == null) {
					intance = new SingltonDemo();
				}
			}
			
		}
		return intance;
	}

}

public class ConstructorEx {
	public static void main(String[] args) {
		
		SingltonDemo obj = SingltonDemo.getInstance();
		SingltonDemo obj2 = SingltonDemo.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

		/*
		 * Emp obj1 = new Emp(); Emp obj2 = new Emp(2,"abc", 20,"male");
		 * System.out.println(obj2);
		 * 
		 * obj1.setId(2); System.out.println(obj1);
		 */

	}

}
