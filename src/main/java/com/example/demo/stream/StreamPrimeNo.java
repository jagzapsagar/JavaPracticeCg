package com.example.demo.stream;

import java.util.stream.IntStream;

public class StreamPrimeNo {
	public static void main(String[] args) {
		int no =5;
		boolean result = no >1 && IntStream
				.range(2, no).noneMatch(e -> no % e==0);
		System.out.println(result);
		
		
		int reduce = IntStream.rangeClosed(1, no).reduce(1,(a,b) -> a*b);
		System.out.println(reduce);
		System.out.println();
		IntStream
		.range(2, no).forEach(System.out::print);
		System.out.println();
		IntStream
		.rangeClosed(2, no).forEach(System.out::print);
	}

}
