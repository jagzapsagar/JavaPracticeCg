package com.example.demo.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgByEmpGender {
	public static void main(String[] args) {
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(2,"Sagar",52000,"male"));
		elist.add(new Emp(3,"Kartik",41000,"male"));
		elist.add(new Emp(4,"Krutika",25000,"female"));
		elist.add(new Emp(5,"Shweta",12000,"female"));
		elist.add(new Emp(6,"Ram",86000,"male"));
		
		Map<String,Double> collect = elist.stream().collect(Collectors.groupingBy(e -> e.getGender(),LinkedHashMap::new, Collectors.averagingDouble(e -> e.getSalary())));
		System.out.println(collect);
	}

}
