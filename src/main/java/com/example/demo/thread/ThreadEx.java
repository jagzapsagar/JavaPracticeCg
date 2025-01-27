package com.example.demo.thread;

public class ThreadEx extends Thread {
	
	public void run() {
		System.out.println("Running");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ThreadEx T = new ThreadEx();
		T.setDaemon(true); // To create demoen thread use
		T.isDaemon();// to check whethre demoen or not 
		
		// Sleep method use to paus thread
		// t1.join() // waiting for t1 to complete its task
		
		System.out.println(T.getState());
		T.start();
		System.out.println(Thread.currentThread().getState());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(T.getState());
		try {
			T.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// Waiting to complete execution on T thread then main thread will resume
		
		System.out.println(T.getState());
		
	}

}
