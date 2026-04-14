package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechMInterview {
	public static void main(String[] args) {
		List<String> list = List.of("Mumbai", "Pune", "Nashik","Nagpur");
		//filter = A
		List<String> list2 = list.stream().filter(e -> e.startsWith("N")).toList();
		System.out.println(list2);
		
		int[] ar1 = {2,7,3,6};
		int[] ar2 = {23,45,52,1};
		
		List<Integer> concat = Stream
				.concat(Arrays.stream(ar1).boxed(), 
						Arrays.stream(ar2).boxed())
				.toList();
		System.out.println(concat);
	}

}
