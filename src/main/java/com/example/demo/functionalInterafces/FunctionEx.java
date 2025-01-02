package com.example.demo.functionalInterafces;

import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {
		Function<Integer,String> fun = ((a)-> "ABC");
		System.out.println(fun.apply(123));
	}

}
