package com.example.demo.HashcodeEqualsMethod;

import java.util.Objects;

class Student{
	private int id;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object s) {
		Student s1 = (Student) s;
		return s1.getId()==this.getId() && s1.getName().equals(this.getName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	
	
}

public class Example {
	public static void main(String[] args) {
		
	}

}
