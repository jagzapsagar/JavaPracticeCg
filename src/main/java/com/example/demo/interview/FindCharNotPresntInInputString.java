package com.example.demo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindCharNotPresntInInputString {
	
	public static void main(String[] args) {
		String input ="abc";
		String given = "asdfghjkloiuytrccttttt";
		ArrayList<Character> list = new ArrayList<>();
		
		Set<Character> collect = input.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
		System.out.println(collect);
		for(int i=0;i<given.length();i++) {
			boolean add = collect.add(given.charAt(i));
			if(add==true) {
				list.add(given.charAt(i));
			}
		}
		
		System.out.println(list);
		int no = 4;
		boolean anyMatch = IntStream.range(0,31).map(e -> 1<< e)
		.anyMatch(i -> i== no);
		System.out.println(anyMatch);
		
		String word = "Welcome back Punee";
		Map<String,Integer> collect2 = Arrays.stream(word.split(" "))
			.collect(Collectors.toMap(e -> e, e -> e.length()));
		
		Optional<String> max = Arrays.stream(word.split(" "))
		.max(Comparator.comparingInt(String::length));
		System.out.println(max);
		
		
		
		System.out.println(collect2);
		System.out.println(max);
		
		
		
	}

}
