package com.example.demo.thread;

public class Test {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		//Counter c2 = new Counter();
		MyThread t1 = new MyThread(c1);
		MyThread t2 = new MyThread(c1);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c1.getCount());
	}

}
