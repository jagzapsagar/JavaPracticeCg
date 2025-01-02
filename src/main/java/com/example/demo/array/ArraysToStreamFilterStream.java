package com.example.demo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ArraysToStreamFilterStream {
	public static void main(String[] args) {
		int[] ar = {2,8,6,7,3,9};
		
		Arrays.stream(ar).filter(e -> e%2==0).forEach(System.out::println);
		
		long count = Arrays.stream(ar).filter(e -> e%2==0).count();
		System.out.println("even No Count is : "+count);
		
		Optional<Integer> min =Arrays.stream(ar).boxed().min(Comparator.naturalOrder());
		System.out.println(min.get());
		
		List<Integer> list = List.of(7,9,4,3,8);
		Optional<Integer> min2 = list.stream().min(Comparator.naturalOrder());
		System.out.println(min2.get());
	}

}
