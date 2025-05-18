package com.example.demo.array;

public class RverseArray {
	public static void main(String[] args) {
		int[] arr = {2,7,3,5};
		int[] rev = new int[4];
		int len= arr.length;
		// using swaping
		for(int k=0;k<(len/2);k++) {
				int temp=arr[k];
				arr[k]=arr[len-1-k];
				arr[len-1-k]=temp;
		}
		
		for(int v :arr) {
			System.out.println(v);
		}
		
		// using second array
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			rev[j] = arr[i];
			j++;
		}
		for(int g: rev) {
			//System.out.println(g);
		}
	}

}
