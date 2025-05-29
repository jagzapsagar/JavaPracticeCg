package com.example.demo.interview;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int no =153;
		int a=no;
		int b=no;
		int count=0;
		int result = 0;
		
		while(a>0) {
			a = a/10;
			count++;
		}
		System.out.println(count);
		
		while(b>0) {
			int d = b%10;
			result += Math.pow(d, count);
			b = b/10;
		}
		System.out.println(result);
	}
	
	
	

}
