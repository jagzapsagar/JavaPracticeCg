package com.example.demo.ComparableComarator;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
	int id;
	String name;
	int salatry;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int salatry) {
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
public class StudentComparator {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<>();
		
		slist.add(new Student(1,"Sagar",42000));
		slist.add(new Student(1,"Kishor kumar",32000));
		slist.add(new Student(1,"Aniket k",62000));
		slist.add(new Student(1,"rahul",66000));
	
		// diretly passing comparator
		slist.sort((a,b) -> a.getSalatry()-b.getSalatry());
		System.out.println("Direct pass Compartor in SORT: "+slist);
		
		//sort Asc or DESC using reverse for DESC
		Comparator<Student> com = Comparator.comparing(Student::getSalatry).reversed();
		
		slist.sort(com);
		System.out.println(slist);
		
		//sort name on it lesntgh of char
		slist.sort((a,b) -> a.getName().length() - b.getName().length());
		System.out.println("lenghth name: "+slist);
		
	}

}
