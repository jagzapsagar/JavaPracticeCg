package com.example.demo.ComparableComarator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentComparatorLembda {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(45);
		list.add(5);
		list.add(85);
		
		List<Integer> collect = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("NaturalOrder: "+collect);
	}
	
	

}
