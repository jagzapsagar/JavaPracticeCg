package com.example.demo.array;

import java.util.Arrays;

public class IntToIntegerArray {
	public static void main(String[] args) {
		int[] ar = {4,9,3,7};
		
		Integer[] array = Arrays.stream(ar).boxed().toArray(Integer[]::new);
	}

}
