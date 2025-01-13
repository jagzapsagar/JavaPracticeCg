package com.example.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByGender {
	public static void main(String[] args) {
		
		ArrayList<Integer> ilist = new ArrayList<>();
		ilist.add(2);
		ilist.add(3);
		ilist.add(7);
		ilist.add(8);
		
		Map<Boolean,List<Integer>> even = ilist.stream().collect(Collectors.groupingBy(e -> e%2==0));
		for(Map.Entry<Boolean, List<Integer>> a: even.entrySet()) {
			System.out.println(a.getKey()+": "+a.getValue());
		}
		
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(2,"Sagar",52000,"male"));
		list.add(new Emp(3,"Kartik",41000,"male"));
		list.add(new Emp(4,"Krutika",25000,"female"));
		list.add(new Emp(5,"Shweta",12000,"female"));
		
		Map<String,List<Emp>> collect = list.stream().collect(Collectors.groupingBy(Emp::getGender));
		collect.forEach((e,b) ->{
			System.out.println(e +": "+b);
		});
		
		Map<String,Long> collect2 = list.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println("Counting: "+collect2);
	}

}
