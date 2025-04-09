package com.example.demo.interview;

import java.util.List;

public class SumOfIntegerNumber {
	public static void main(String[] args) {
		int no = 123;
		int sum = 0;
		while(no>0) {
			sum += no%10;
			no = no/10;
		}
		System.out.println("---");
		System.out.println(sum);
		
		List<Integer> list = List.of(2,5,7);
		int sum2 = list.stream().mapToInt(e -> e).sum();
		System.out.println(sum2);
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
	}

}
