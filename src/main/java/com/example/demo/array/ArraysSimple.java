package com.example.demo.array;

public class ArraysSimple {
	public static void main(String[] args) {
		int[] ar = {4,8,7,3};
		int[] arr = new int[5];
		
		arr[3] = 45;
		
		System.out.println(ar.length);
		System.out.println(arr.length);
		System.out.println("For lop");
		for(int a : ar) {
			System.out.println(a);
		}
	}

}
