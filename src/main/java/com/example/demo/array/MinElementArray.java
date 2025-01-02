package com.example.demo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinElementArray {
	public static void main(String[] args) {
		int[] ar = {4,6,7,3,12};
		Optional<Integer> min =Arrays.stream(ar).boxed().min(Comparator.naturalOrder());
		System.out.println(min);
		
		Integer[] arr = {4,6,7,3,12};
		List alist = Arrays.asList(ar);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		Collections.addAll(list, arr); // we can add only Integer Type data not premitive
		System.out.println(list);
		
		
		
		
	}

}
