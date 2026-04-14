package com.example.demo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewTest {
	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5,6};
		int[] ar2 = {6,7,8,9};
		//int size = ar1.length+ar2.length;
		//int[] ar3 = new int[size];
		int size = ar1.length;
		for(int i =0;i<(size/2);i++) {
			
			int temp = ar1[i];
			ar1[i] = ar1[size-1-i];
			ar1[size-1-i] =temp;
		}
		
		for(int a:ar1) {
			System.out.println(a);
		}
		
	
	}

}
