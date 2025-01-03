package com.example.demo.interview;

public class ArraySort {
	public static void main(String[] args) {
		int[] ar = {7,6,1,4,2,5};
		
		for(int i = 0; i < ar.length; i++) {
			for(int j =i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			
		}
		
		  for (int i = 0; i < ar.length; i++) { 
			  System.out.println(ar[i]); 
			  }
		 
	}

}
