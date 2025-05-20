package com.example.demo.java8.completableFuture;

import java.util.concurrent.CompletableFuture;

import com.example.demo.interfaces.main;

public class ThenAcceptEx {
	public static void main(String[] args) {
		//thenAccept() method specifies an action to perform upon completion, in this case, printing the result.
		CompletableFuture<String> fu = CompletableFuture.supplyAsync(() -> "Welcome");
		fu.thenAccept(a -> System.out.print(a));
	}

}
