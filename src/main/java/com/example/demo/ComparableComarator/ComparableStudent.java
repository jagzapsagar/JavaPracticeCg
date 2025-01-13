package com.example.demo.ComparableComarator;

import java.util.ArrayList;

class Studentc {
	int id;
	String name;
	int salatry;
	public Studentc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentc(int id, String name, int salatry) {
		super();
		this.id = id;
		this.name = name;
		this.salatry = salatry;
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
	public int getSalatry() {
		return salatry;
	}
	public void setSalatry(int salatry) {
		this.salatry = salatry;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salatry=" + salatry + "]";
	}
	
	
}
		

public class ComparableStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> slist = new ArrayList<>();
		
		slist.add(new Student(1,"Sagar",42000));
		slist.add(new Student(1,"Kishor kumar",32000));
		slist.add(new Student(1,"Aniket k",62000));
		slist.add(new Student(1,"rahul",66000));
		
		// sorting name by alphabetical asce order
		slist.sort((a,b) -> a.getName().compareTo(b.getName()));
		System.out.println(slist);
		
	}

}
