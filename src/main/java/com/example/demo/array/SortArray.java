package com.example.demo.array;

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
	}

}
