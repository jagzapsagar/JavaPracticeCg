package com.example.demo.thread;

public class MyThread extends Thread {
	
	public Counter counter;
	
	public MyThread(Counter c) {
		this.counter = c;
	}
	public void run() {
		for(int i =0;i<1000;i++) {
			counter.increment();
		}
	}

}
