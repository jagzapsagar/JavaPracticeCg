package com.example.demo.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonReapetedCharInString {
	public static void main(String[] args) {
		String str = "Java is the bJest";
		// First non reapeated charecter in string
		Map<Character, Long> collect = str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);
		
		Optional<Entry<Character,Long>> findFirst = collect.entrySet().stream().filter(e -> e.getValue()==1).findFirst();
		System.out.println(findFirst);
	}

}
