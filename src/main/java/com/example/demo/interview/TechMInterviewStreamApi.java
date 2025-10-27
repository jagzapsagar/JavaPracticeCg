package com.example.demo.interview;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TechMInterviewStreamApi {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("banana");
		list.add("orange");
		list.add("Apple");
		list.add("banana");
		list.add("Apple");
		
		// Output ->> banana and Apple
		Map<String,Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity()
				, Collectors.counting()))
				.entrySet().stream()
					.filter(e -> e.getValue()>1)
						.collect(Collectors.toMap(t -> t.getKey(), y -> y.getValue()));
		
		System.out.println(collect);
	}

}
