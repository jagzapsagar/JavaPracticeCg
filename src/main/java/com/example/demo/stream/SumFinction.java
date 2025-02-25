package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumFinction {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		
		Integer sum =list.stream().mapToInt(e -> e).sum();
		System.out.println(sum);
		
		int sum2 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
		
		Double avg = list.stream().mapToInt(e -> e).average().orElse(0.0);
		
		Optional<Integer> min =list.stream().min(Comparator.naturalOrder());
		System.out.println("Min: "+min);
		
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println("Max: "+max);
		
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(2,"Sagar",52000,"male"));
		elist.add(new Emp(3,"Kartik",41000,"male"));
		elist.add(new Emp(4,"Krutika",25000,"female"));
		elist.add(new Emp(5,"Shweta",12000,"female"));
		
		Optional<Integer> reduce = elist.stream().map(Emp::getSalary).reduce((a,b) -> a+b);
		
		int sum3 = elist.stream().mapToInt(Emp::getSalary).sum();
		System.out.println(sum3);
	}

}
