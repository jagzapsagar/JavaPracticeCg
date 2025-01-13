package com.example.demo.stream.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
	public static void main(String[] args) {
		int[] ar = {4,8,7,3};
		
		Integer[] sortN =Arrays.stream(ar).boxed().sorted(Comparator.naturalOrder()).toArray(Integer[]::new);
		for(int a:sortN) {
			System.out.println(a);
		}
		
		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		
		Collections.reverse(list);
	}

}
