package com.example.demo.array;

import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy3 {
	public static void main(String[] args) {
		List<Integer> li = List.of(7,2,6,7,1,4);
		List<Integer> collect = li.stream().filter(e -> e%3==0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
