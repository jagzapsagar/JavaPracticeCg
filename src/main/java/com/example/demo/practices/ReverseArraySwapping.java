package com.example.demo.practices;

public class ReverseArraySwapping {
	public static void main(String[] args) {
		int[] ar = {3,6,4,1};
		int len = ar.length;
		
		for(int i=0;i<len/2;i++) {
			int temp=ar[i];
			ar[i] = ar[len-1-i];
			ar[len-1-i] = temp;
		}
		for(int n : ar) {
			System.out.println(n);
		}
		System.out.println("STRING");
		String str = "abcd";
		char[] charA = str.toCharArray();
		int lena = charA.length;
		
		for(int i=0;i<lena/2;i++) {
			char temp=charA[i];
			charA[i] = charA[lena-1-i];
			charA[lena-1-i] = temp;
		}
		for(char n : charA) {
			System.out.println(n);
		}
	}

}
