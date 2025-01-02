package com.example.demo.collection;

import java.util.HashSet;

public class HashSetEx {
	
	public static void main(String[] args) {
		HashSet<Book> set = new HashSet<>();
		
		set.add(new Book(1,"Math"));
		set.add(new Book(2,"Chem"));
		
		set.forEach(e -> System.out.println(e.getId()+" "+e.getName()));
		for(Book b : set) {
			System.out.print(b.getId()+" ");
			System.out.print(b.getName());
			System.out.println();
		}
	}

}

class Book{
	private int id;
	private String name;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	
}
