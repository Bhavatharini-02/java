package com.wipro.java.collection;
//java program to demonstrate the use of comparable for sorting
import java.util.ArrayList;
import java.util.Collections;
//Animal class which implements comparable
//interface to define default sorting
class Animal implements Comparable<Animal> {
	private String n;//Animal name
	private int y;//age of the animal

	//constructor
	public Animal(String n,int y) {
		// TODO Auto-generated constructor stub
		this.n=n;
		this.y=y;
	}

	//Implementation of compareTo method for default sorting by age
	public int compareTo(Animal a) {
		//sort animals in ascending order
		//order of age
		return Integer.compare(this.y,a.y);
	}
	
	//Getter and setter method
	public String getName() {
		return n;
	}

	public int getYear() {
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a list of Animals
		ArrayList<Animal> l=new ArrayList<>();
		l.add(new Animal("Cow",8));
		l.add(new Animal("Lion",15));
		l.add(new Animal("Cat",10));
		
		//sort animals using Comparable's
		//comparable method by age
		Collections.sort(l);
		//Display the sorted list of animals
		System.out.println("Animals after sorting by age:");
		for(Animal a:l) {
			System.out.println(a.getName() + " " +a.getYear());
		}
				
	}

}
