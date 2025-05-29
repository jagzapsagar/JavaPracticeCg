package com.example.demo.practices;

public class SortArray {
	public static void main(String[] args) {
		int[] ar = {4,1,7,4,9};
		int len = ar.length;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len-1;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int n : ar) {
			System.out.println(n);
		}
	}

}
