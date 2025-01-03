package com.example.demo.stream;

import java.util.List;

public class AnyMatchAllMatch {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,5,6,7,8,9);
		Boolean b = list.stream().anyMatch(e -> e==12);
		System.out.println(b);
		
		Boolean all =list.stream().allMatch(e -> e<50);
		System.out.println(all);
	}

}
