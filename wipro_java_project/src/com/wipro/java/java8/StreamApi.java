package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Pratik", "Rahul", "Manikanta");
		List<String> stream = list.stream().filter(name->name.startsWith("P")).
				collect(Collectors.toList()); 
		System.out.println(stream);
		List<String> stream1=list.stream().
				map(String::toUpperCase).
				collect(Collectors.toList());
		System.out.println(stream1);

	}

}
