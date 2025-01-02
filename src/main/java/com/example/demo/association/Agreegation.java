package com.example.demo.association;

import java.util.ArrayList;
import java.util.List;

//Association: create relationship btween 2 classes one to many, many to one

// Agreegation: one class having reference of another class is called agreegation.
//ir contain the object of another class.

public class Agreegation {
	public static void main(String[] args) {
		
		ArrayList<Course> clist = new ArrayList<>();
		clist.add(new Course("Comp"));
		clist.add(new Course("Mech"));
		clist.add(new Course("IT"));
		
		ArrayList<Student> stu = new ArrayList<>();
		stu.add(new Student("Sagar",clist));
		
		for (Student s : stu) {
			System.out.println(s.getName());
			System.out.println(s.getCours());
		}
		
	}

}


class Student{
	
	private String name;
	private List<Course> cours;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, List<Course> cours) {
		super();
		this.name = name;
		this.cours = cours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCours() {
		return cours;
	}

	public void setCours(List<Course> cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", cours=" + cours + "]";
	}
	
	
}

class Course{
	
	private String courses;

	public Course(String courses) {
		super();
		this.courses = courses;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Course [courses=" + courses + "]";
	}
	
	
}
