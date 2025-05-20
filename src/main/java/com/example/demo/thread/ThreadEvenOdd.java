package com.example.demo.thread;

public class ThreadEvenOdd {
	public int no=1;
	public final int max=20;
	
	public synchronized void printOdd() {
		while(no<=max) {
			if(no%2==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println(no+ "Odd");
				no++;
				notify();
			}
		}
	}
	
	public synchronized void printEven() {
		while(no<=max) {
			if(no%2==0) {
				System.out.println(no + "Even");
				no++;
				notify();
			}else {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreadEvenOdd obj= new ThreadEvenOdd();
		
		Thread t1 = new Thread(obj::printEven);
		Thread t2 = new Thread(() -> obj.printOdd());
		
		t1.start();
		t2.start();
	}

}
