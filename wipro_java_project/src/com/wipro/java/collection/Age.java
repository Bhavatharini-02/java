package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Age implements Comparator<Animal1> {
	public int compare(Animal1 a1, Animal1 a2) {
		return Integer.compare(a1.getAge(), a2.getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal1> a1 = new ArrayList<>();
		a1.add(new Animal1("Dog", 5));
        a1.add(new Animal1("Cat", 3));
        a1.add(new Animal1("Elephant", 10));
		
		Collections.sort(a1, new Age());
		System.out.println("\nAnimals sorted by age:");
		for (Animal1 a : a1) {
			System.out.println(a.getAge() + " " + a.getName() + " " );
		}

	}

}