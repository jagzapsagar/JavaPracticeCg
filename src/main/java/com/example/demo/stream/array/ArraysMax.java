package com.example.demo.stream.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class ArraysMax {
	public static void main(String[] args) {
		int[] ar = {2,8,7,3};
		
		Optional<Integer> max = Arrays.stream(ar).boxed().max(Comparator.naturalOrder());
		int sum = Arrays.stream(ar).boxed().mapToInt(e -> e).sum();
		System.out.println(max.get());
		System.out.println(sum);
	}

}
