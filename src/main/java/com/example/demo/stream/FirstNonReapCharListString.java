package com.example.demo.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonReapCharListString {
	public static void main(String[] args) {
		List<String> li = List.of("hello", "welcomewe","sagar");
		
		List<Optional<Character>> collect = li.stream().map(e -> e.chars()
				.mapToObj(k -> (char)k)
				.collect(Collectors
						.groupingBy(Function.identity(), 
								LinkedHashMap::new, 
								Collectors.counting()
								))
				.entrySet().stream()
				.filter(g -> g.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst())
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}

}
