package com.example.demo.practices;

import com.example.demo.interfaces.main;

public class Demo {

	public static void main(String[] args) {
		int[] ar = {3,8,7,1};
		
		for(int i=0;i<(ar.length/2);i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length-i-1];
			ar[ar.length-i-1]=temp;
		}
		
		for(int b :ar) {
			System.out.println(b);
		}
		
		// array sorting
		for(int k=0;k<ar.length;k++) {
			for(int l=k+1;l<ar.length;l++) {
				if(ar[k]>ar[l]) {
					int temp = ar[l];
					ar[l] = ar[k];
					ar[k] = temp;
				}
			}
		}
		System.out.println("Sorted");
		for(int x:ar) {
			System.out.println(x);
		}
		
		//reverse string
		
		String str = "abcd";
		String rev = "";
		for(int j=str.length()-1;j>=0;j--) {
			rev +=str.charAt(j);
		}
		System.out.println("Rev String: "+rev);
	}
}
