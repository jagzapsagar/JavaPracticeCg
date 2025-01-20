package com.example.demo.functionalInterafces;

import java.util.function.Function;

/*you cannot pass two arguments to a Function<T, R> 
in Java because the Function interface from the 
java.util.function package takes only one argument 
and returns one result.*/

public class FunctionEx {
	public static void main(String[] args) {
		Function<Integer,String> fun = ((a)-> "ABC");
		System.out.println(fun.apply(123));
	}

}
