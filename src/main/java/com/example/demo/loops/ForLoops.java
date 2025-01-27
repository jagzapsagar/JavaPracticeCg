package com.example.demo.loops;

public class ForLoops {
	public static void main(String[] args) {
		
		for (int i=0;i<5;i++) {
			System.out.print(i);
		}
		
		
		System.out.println("\n---------While Loop--------");
		int i= 1;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		
		System.out.println("\nDo While ");
		int j=1;
		do {
			System.out.println("Kara he"+j);
			j++;
		}while(j<5);
	}

}
