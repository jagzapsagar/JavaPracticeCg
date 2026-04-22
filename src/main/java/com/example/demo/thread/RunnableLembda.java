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
		
		
		
		
		
		
		
		
		Runnable run2 = () -> {
			System.out.println("run2");
		};
		run2.run();

		Thread thh = new Thread(run2);
		//thh.start();

		Thread timpl = new Thread(() -> {
			System.out.print("timpl");
		});
		timpl.start();
		
		
		
		String s = null;
		System.out.println(s.valueOf(10));
	}

}
