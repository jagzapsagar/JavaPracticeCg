package com.example.demo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FriquencyOfWord {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Sagar");
		list.add("rahul");
		list.add("Aniket");
		list.add("Sagar");
		list.add("Aniket");
		list.add("Sagar");
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		
		for(Map.Entry<String, Long> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
		String str = "hello welcome to hello to";
		
		Map<String, Long> mapm =Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapm);
	}

}
