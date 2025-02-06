package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
	//Function to check date and time
	public static void checkingAdjusters()
	{
		//current date
		LocalDate date = LocalDate.now();
		System.out.println("The current date is:" + date);
		
		//first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of next month is:" + dayOfNextMonth);
		
		//next saturday 
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday from now is:" + nextSaturday);
		
		//first day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of month:" + firstDay);
		
		//last day of current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("First day of month:" + lastDay);
		
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingAdjusters();
	}

}