package com.example.demo.stream;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Average {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(asDouble);
		
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(2,"Sagar",52000,"male"));
		elist.add(new Emp(3,"Kartik",41000,"male"));
		elist.add(new Emp(4,"Krutika",25000,"female"));
		elist.add(new Emp(5,"Shweta",12000,"female"));
		
		OptionalDouble average = elist.stream().mapToDouble(e -> e.getSalary()).average();
		System.out.println("AVG emp sal: "+average.getAsDouble());
		
		int sum = elist.stream().mapToInt(e -> e.getSalary()).sum();
	}

}
