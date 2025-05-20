package com.example.demo.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.example.demo.interfaces.main;

public class CombiningFuturesEx {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> fu = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> fu2 = CompletableFuture.supplyAsync(() -> "India");
		CompletableFuture<String> thenCombine = fu.thenCombine(fu2, (a,b) -> a + " "+b);
		
		thenCombine.thenAccept(System.out::println);
		System.out.println(thenCombine.join());
		System.out.println(thenCombine.get());
	}

}
