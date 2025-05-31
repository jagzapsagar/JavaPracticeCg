package com.example.demo.stream;

import java.util.stream.Collectors;

import com.example.demo.interfaces.main;

public class RemoveVawel {
	public static void main(String[] args) {
		String str = "abcdO";
		
		String collect = str.chars().mapToObj(e -> (char)e)
		.filter(r -> !"aeiouAEIOU".contains(String.valueOf(r)))
		.map(k -> String.valueOf(k)).collect(Collectors.joining());
		
		System.out.println(collect);
	}

}
