package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Rate implements Comparator<Movie1>{
	public int compare(Movie1 m1, Movie1 m2) {
		
		//Sort by name in alphabetical order
		return Double.compare(m2.getR(),m1.getR());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a list of movies
		ArrayList<Movie1> m1=new ArrayList<>();
		m1.add(new Movie1("Force Awakens",8.3,2015));
		m1.add(new Movie1("Star Wars",8.7,1977));
		m1.add(new Movie1("Empire Strikes Back",8.8,1980));
		
		//Sort movies by name and display all
		Collections.sort(m1, new Rate());
		System.out.println("\nMovies sorted by rate:");
		for(Movie1 m:m1) {
			System.out.println(m.getR() +" "+m.getN()+" "+m.getY());
		}
	}
}
