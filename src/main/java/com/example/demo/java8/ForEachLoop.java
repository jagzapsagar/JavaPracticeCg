package com.example.demo.java8;

import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] ar = {7,6,8,1};
		
		for(int a:ar) {
			System.out.println(a);
		}
		
		List<Integer> list = List.of(12,45,63,84);
		list.forEach(e -> System.out.println(e));
	}

}
