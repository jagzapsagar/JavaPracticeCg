package com.example.demo.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	int id;
	String name;
	List<Integer> mo;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, List<Integer> mo) {
		super();
		this.id = id;
		this.name = name;
		this.mo = mo;
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
	public List<Integer> getMo() {
		return mo;
	}
	public void setMo(List<Integer> mo) {
		this.mo = mo;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", mo=" + mo + "]";
	}
	
	
	
	
}
public class FlatmapMulMobileno {
	
	
	public static void main(String[] args) {
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(1,"sagar", List.of(4589653,49256)));
		elist.add(new Emp(2,"Aniket", List.of(6589653,69256)));
		elist.add(new Emp(3,"sagar", List.of(9589653,99256)));
		
		List<Integer> collect = elist.stream().flatMap(e -> e.getMo().stream()).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
