package com.example.demo.interview.cg;

import java.util.function.Function;

interface Inter{
	int test(int a, int b);
}

public class FunctionalInterfaceex {
	public static void main(String[] args) {
		Inter i= ((a,b) -> a+b);
		System.out.println(i.test(2, 3));
	}
	// we can not pass 2 values in function
	Function<Integer, Integer> f = ((a) -> a+8); 

}
