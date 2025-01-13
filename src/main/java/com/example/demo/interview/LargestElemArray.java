package com.example.demo.interview;

public class LargestElemArray {
	public static void main(String[] args) {
		int[] ar = {4,1,9,32,7,45};
		int temp;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		for(int a:ar) {
			System.out.println(a);
		}
	}

}
