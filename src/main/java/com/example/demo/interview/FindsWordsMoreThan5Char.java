package com.example.demo.interview;

import java.util.List;
import java.util.stream.Collectors;

public class FindsWordsMoreThan5Char {
	public static void main(String[] args) {
		List<String> list = List.of("Sagar","Ram","Krutika","Rishabh");
		
		List<String> newl = list.stream().filter(e -> e.length()>4).collect(Collectors.toList());
		for(String a:newl) {
			System.out.println(a);
		}
	}

}
