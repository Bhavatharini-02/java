/**
 * 
 */
package com.wipro.java.collection;
//java program to demonstrate the use of comparable for sorting
import java.util.ArrayList;
import java.util.Collections;
//movie class which implements comparable
//interface to define default sorting
class Movie implements Comparable<Movie> {
	private String n;//movie name
	private double r;//movie rating
	private int y;//release year of the movie

	//constructor
	public Movie(String n,double r,int y) {
		// TODO Auto-generated constructor stub
		this.n=n;
		this.r=r;
		this.y=y;
	}

	//Implementation of compareTo method for default sorting by rate
	public int compareTo(Movie m) {
		//sort movies in ascending order
		//order of rate
		return Double.compare(this.r,m.r);
	}
	
	//Getter and setter method
	public String getName() {
		return n;
	}
	public double getRating() {
		return r;
	}
	public int getYear() {
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a list of movies
		ArrayList<Movie> l=new ArrayList<>();
		l.add(new Movie("Star Wars",8.7,1977));
		l.add(new Movie("Empire Strikes Back",8.8,1980));
		l.add(new Movie("Return of the Jedi",8.4,1983));
		
		//sort movies using Comparable's
		//comparable method by rate
		Collections.sort(l);
		//Display the sorted list of movies
		System.out.println("Movies after sorting by rate:");
		for(Movie m:l) {
			System.out.println(m.getName() + " "+ m.getRating() +" "+m.getYear());
		}
				
	}

}
