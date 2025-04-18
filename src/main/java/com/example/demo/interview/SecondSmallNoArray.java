package com.example.demo.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondSmallNoArray {
	public static void main(String[] args) {
		int[] ar = {9,7,2,5};
		
		Optional<Integer> findFirst = Arrays.stream(ar).boxed().sorted().skip(1).findFirst();
		System.out.println(findFirst);
		
		Optional<Integer> findFirst2 = Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findFirst2);
		
	}

}
