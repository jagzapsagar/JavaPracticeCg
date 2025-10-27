package com.example.demo.interfaces;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TechMStreamApi {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("banana");
		list.add("orange");
		list.add("Apple");
		list.add("banana");
		list.add("Apple");
		
		
Map<String,Long> collect = list.stream()
				.collect(Collectors
						.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(t -> t.getValue()!=1).collect(Collectors.toMap(e -> e.getKey(), t ->t.getValue()));
		
		System.out.println(collect);
		
		
		
	}

}
