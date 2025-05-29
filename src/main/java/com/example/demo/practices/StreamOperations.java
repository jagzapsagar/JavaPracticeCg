package com.example.demo.practices;

import java.util.List;

public class StreamOperations {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,9,1,3);
		
		int sum = list.stream().mapToInt(e -> e).sum();
		System.out.println(sum);
	}

}
