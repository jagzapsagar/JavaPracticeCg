package com.example.demo.association;

import java.util.ArrayList;
import java.util.Iterator;

public class ManyToOne {
	public static void main(String[] args) {
		
		Dep d1 = new Dep("Mech");
		Dep d2 = new Dep("Comp");
		Dep d3 = new Dep("IT");
		
		Emp e1 = new Emp(1,"Sagar",d2);
		Emp e2 = new Emp(2,"Rakesh",d1);
		Emp e3= new Emp(1,"Rahul",d2);
		
		ArrayList<Emp> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for (Emp emp : list) {
			System.out.println(emp.getName());
			System.out.println(emp.getDep());
		}
		
	}

}

class Emp{
	private int id;
	private String name;
	private Dep dep;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, Dep dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
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
	public Dep getDep() {
		return dep;
	}
	public void setDep(Dep dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	
	
}

class Dep{
	private String name;

	public Dep(String name) {
		super();
		this.name = name;
	}

	public Dep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dep [name=" + name + "]";
	}
	
	
}
