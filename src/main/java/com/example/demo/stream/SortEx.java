package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.stream.Emp;

public class SortEx {
	public static void main(String[] args) {
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(2,"Sagar",52000,"male"));
		elist.add(new Emp(3,"Kartik",41000,"male"));
		elist.add(new Emp(4,"Krutika",25000,"female"));
		elist.add(new Emp(5,"Shweta",12000,"female"));
		
		elist.sort(Comparator.comparing(Emp::getSalary).reversed());
		System.out.println(elist);
		
		List<Emp> collect = elist.stream().sorted(Comparator.comparingInt(e -> e.getSalary())).collect(Collectors.toList());
		
	}

}
