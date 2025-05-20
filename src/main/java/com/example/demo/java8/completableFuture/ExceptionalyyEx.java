package com.example.demo.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExceptionalyyEx {
	public static void main(String[] args) {
		CompletableFuture<String> fu = CompletableFuture.supplyAsync(() -> {
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("5000 completed");
			
			return "ok";
			// if we enter time 6 second plus then it will not throw any excption
		}).orTimeout(4, TimeUnit.SECONDS).exceptionally((a) -> "Exception occuredddd");
		fu.join();
		System.out.println(fu.join());
	}

}
