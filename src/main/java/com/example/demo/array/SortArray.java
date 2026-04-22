package com.example.demo.array;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
	public static void main(String[] args) {
		int[] ar = {2,6,3,1,9};
		int[] ar2 = new int[ar.length];
		// Sort Array
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		for(int g:ar) {
			System.out.println(g);
		}
		
		//Revers Array
		System.out.println("Revese");
		int len = ar.length;
		for(int h=0;h<ar.length/2;h++) {
			
			int t = ar[h];
			ar[h] = ar[len-1-h];
			ar[len-1-h] = t;
		}
		for(int t:ar) {
			System.out.println(t);
		}
		
		//Reverse String
		System.out.println("Revrse String");
		String str = "abcd";
		
		String reduce = str.chars().mapToObj(e -> (char)e).map(t -> String.valueOf(t)).reduce(" ",(a,b) -> b + a);
		System.out.println(reduce);
		
		char[] sarr = str.toCharArray();
		int lenn = sarr.length;
		for(int h=0;h<lenn/2;h++) {
			
			int t = ar[h];
			ar[h] = ar[lenn-1-h];
			ar[lenn-1-h] = t;
		}
		for(char t:sarr) {
			System.out.println(""+t);
		}
		System.out.println("---------------");
		List<String> list = List.of("abc", "xyz");
		
		List<Character> list3 = list.stream().flatMap(e -> e.chars().mapToObj(t -> (char)t)).toList();
		System.out.println(list3);
		List<Integer> list2 = list.stream().map(e -> e.length()).toList();
		System.out.println(list2);
		
		
	}

}
