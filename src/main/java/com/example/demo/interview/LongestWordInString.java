package com.example.demo.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestWordInString {
	public static void main(String[] args) {
		String str = "story on java";
		
		Optional<Integer> max = Arrays.stream(str.split(" ")).map(e -> e.length()).max(Comparator.naturalOrder());
		System.out.println(max);
		// find longest length element
		Map<String, Integer> collect = Arrays.stream(str.split(" ")).collect(Collectors.toMap(e -> e, e -> e.length()));
		System.out.println(collect);
		
		Optional<Entry<String,Integer>> max2 = collect.entrySet().stream().max(Comparator.comparingInt(e -> e.getValue()));
		System.out.println(max2);
	}

}
