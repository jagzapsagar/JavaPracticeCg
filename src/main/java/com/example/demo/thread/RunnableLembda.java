package com.example.demo.thread;

public class RunnableLembda {
	public static void main(String[] args) {
		
		Runnable run = () -> {
			System.out.println("Running!!!");
		};
		
		Thread t = new Thread(run);
		t.start();
		
		
		Thread tr = new Thread( ()  -> {
			for(int i=0;i<5;i++) {
				System.out.println("----");
			}
		});
		
		tr.start();
	}

}
