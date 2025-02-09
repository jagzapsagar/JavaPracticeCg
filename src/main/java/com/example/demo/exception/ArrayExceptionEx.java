package com.example.demo.exception;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		//int[] ar = null;
		int[] ar = new int[5];
		//int[] ar = null;
		
		
		try {
			System.out.println(ar[2]);
			//System.exit(0);  //  it will terminate program 
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of Bound "+e);
		}catch(NullPointerException e) {
			System.out.println("Null Pointer "+e);
		}finally {
			System.out.println("Finally executed");
		}
		System.out.println("Good Job");
	}

}
