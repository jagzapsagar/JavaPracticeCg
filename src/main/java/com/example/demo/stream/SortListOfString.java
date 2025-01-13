package com.example.demo.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {
	public static void main(String[] args) {
		List<String> list = List.of("Sagar", "Rahil", "Aniket","XYZ");
		
		List<String> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
