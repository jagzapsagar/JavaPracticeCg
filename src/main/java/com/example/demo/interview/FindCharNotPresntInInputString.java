package com.example.demo.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
		
	}

}
