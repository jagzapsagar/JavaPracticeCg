package com.example.demo.interview;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByCountingStringByLenghth {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("sagar");
		list.add("Ram");
		list.add("Sanke");
		list.add("Ram");
		
		Map<Integer, Long> newl =list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(newl);
		
		Map<String,Long> collect = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
	}
}
