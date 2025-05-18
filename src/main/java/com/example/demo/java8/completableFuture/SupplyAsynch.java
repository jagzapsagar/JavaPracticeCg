package com.example.demo.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsynch {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// supplyAsync -> It returns a CompletableFuture<T> that holds the result of that Supplier.
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> "abc")
				//thenApply() is used to process & transform the result of a CompletableFuture when it completes.
				.thenApply(e -> e + " xyz"); 
		System.out.println(supplyAsync.get());
	}

}
