package com.example.demo.java8.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {
	public static void main(String[] args) {
		
		CompletableFuture f = CompletableFuture.runAsync(() -> {
			try {
				System.out.println("Start 2000");
				Thread.sleep(500);
				System.out.println("Complete 2000");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Future");
		});
		
		f.join();
		System.out.println("END");
		
	}

}
