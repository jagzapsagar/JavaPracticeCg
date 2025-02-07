package com.example.demo.ComparableComarator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentt implements Comparator<Studentt> {
	int id;
	String name;
	int salatry;
	public Studentt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentt(int id, String name, int salatry) {
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
	/*
	 * @Override public int compareTo(Studentt o) { // TODO Auto-generated method
	 * stub return Integer.compare(this.id, o.id); }
	 */
	
	public int compare(Studentt o1, Studentt o2) {
		//return o1.getSalatry()-o2.getSalatry();
		return Integer.compare(o1.getId(), o2.getId());
		
		/*
		 * if(idcompaure==0) { 01.getname.compare o2.getName(); }
		 */
	}
	
	
}
public class Practice {
	public static void main(String[] args) {
ArrayList<Studentt> slist = new ArrayList<>();
		
		slist.add(new Studentt(6,"Sagar",42000));
		slist.add(new Studentt(7,"Kishor kumar",32000));
		slist.add(new Studentt(8,"Aniket k",62000));
		slist.add(new Studentt(1,"rahul",42000));
		
		//Collections.sort(slist);
		Collections.sort(slist, new Studentt());
		System.out.println(slist);
		
		//Comparator<Studentt> com = (a,b) -> Integer.compare(a.getSalatry(), b.getSalatry());
		Comparator<Studentt> com2 = Comparator.comparingInt(Studentt::getSalatry).thenComparingInt(Studentt::getId);
		
		
		Collections.sort(slist, com2);
		System.out.println(slist);
	}

}
