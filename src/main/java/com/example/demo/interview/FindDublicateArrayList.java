package com.example.demo.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDublicateArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(7);
		list.add(4);
		list.add(9);
		
		//find Frequency of no
		Map<Integer,Long> collect = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
		
		//Find dublicate
		List<Integer> collect2 = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()>1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println("Dublicate: "+collect2);
		
		
	}

}
