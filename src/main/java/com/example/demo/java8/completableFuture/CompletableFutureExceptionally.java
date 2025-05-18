package com.example.demo.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExceptionally {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		CompletableFuture comp = CompletableFuture.supplyAsync(()->{
			return "Comp1";
		}).exceptionally((e) -> {
			return "exptionnn";
		});
		//
		comp.join();
		System.out.println(comp.get());
	
	}

}
