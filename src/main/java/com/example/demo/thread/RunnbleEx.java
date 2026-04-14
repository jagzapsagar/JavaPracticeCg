package com.example.demo.thread;

public class RunnbleEx implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method Running!!!!!");
	}
	
	public static void main(String[] args) {
		RunnbleEx obj = new RunnbleEx();
		
		Thread th = new Thread(obj);
		th.start();
		
		Thread th2 = new Thread(() -> {
			System.out.println("Using lembda");
		});
		th2.start();
	}

}


