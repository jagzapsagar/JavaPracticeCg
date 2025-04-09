package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LengthOfWordInList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Sagar");
		list.add("Ram");
		list.add("ABCDTY");
		// 1, take stream -> collect it -> use toMap -> e , e.length ///
		Map<String,Integer> collect = list.stream().collect(Collectors.toMap(e -> e, t -> t.length()));
		System.out.println(collect);
		
		Optional<String> max = list.stream().max(Comparator.comparingInt(e -> e.length()));
		System.out.println(max);
		
	}

}
