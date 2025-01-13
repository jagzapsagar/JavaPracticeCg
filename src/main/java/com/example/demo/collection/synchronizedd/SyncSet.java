package com.example.demo.collection.synchronizedd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SyncSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new ConcurrentSkipListSet<>(); // recomanded
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Collections.unmodifiableList(list); // Immutabel
		
		//list = (ArrayList<Integer>) Collections.synchronizedCollection(list); // not recomanded
		

	}

}
