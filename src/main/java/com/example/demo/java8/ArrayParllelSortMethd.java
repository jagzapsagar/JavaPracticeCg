package com.example.demo.java8;

import java.util.Arrays;

public class ArrayParllelSortMethd {
	
	public static void main(String[] args) {
		int[] ar = {4,8,3,7,12,75,14};
		
		Arrays.sort(ar);
		System.out.println(ar);
		/*
		 * improve performance on large arrays by leveraging multiple cores of the CPU.
		 * It uses a parallel sorting algorithm, which splits the array into smaller
		 * chunks and sorts them in parallel, then merges the results.
		 */
		
		Arrays.parallelSort(ar);
	}
	
	
	
	

}
