package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupinCountEmp {
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(2,"Sagar",52000,"male"));
		list.add(new Emp(3,"Kartik",41000,"male"));
		list.add(new Emp(4,"Krutika",25000,"female"));
		list.add(new Emp(5,"Shweta",12000,"female"));
		
		Map<String, Long> l =list.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		
		for(Map.Entry<String, Long> a: l.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
		
		l.forEach((a,b) -> {
			System.out.println(a+" "+b);
		});
	}

}
