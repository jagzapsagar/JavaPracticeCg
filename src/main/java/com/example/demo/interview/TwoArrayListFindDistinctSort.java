package com.example.demo.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoArrayListFindDistinctSort {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(78);
		list1.add(14);
		list1.add(82);
		list1.add(23);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(41);
		list1.add(14);
		list1.add(86);
		list1.add(64);
		
		List<Integer> sort =Stream.concat(list1.stream(), list2.stream()).distinct().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).distinct().sorted().collect(Collectors.toList());
	}

}
