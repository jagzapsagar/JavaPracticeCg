package com.example.demo.functionalInterafces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
	public static void main(String[] args) {
		
		Predicate<Integer> pr = ((a) -> a<5);
		
		int b=4;
		System.out.println(pr.test(b));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(1);
		
		List<Integer> fil = list.stream().filter(pr).collect(Collectors.toList());
		System.out.println(fil);
		
	}

}
