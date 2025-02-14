package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		//adding key-value pair to the map
		map.put(1,"Apple");
		map.put(2,"Banana");
		map.put(3,"Cherry");
		//accessing value by key
		System.out.println("Key 1:" + map.get(1));
		System.out.println("Key 2:" + map.get(2));
		//checking if a key exists in map
		if(map.containsKey(3)) {
			System.out.println("Key 3 exists with value:"+map.get(3));
			
		}
		//iterating over the map using for-each loop
		System.out.println("\n Iterating through the map:");
		for(Map.Entry<Integer,String>entry:map.entrySet()) {
			System.out.println(entry.getKey() +":" +entry.getValue());
		}
		//removing a key-value pair
		map.remove(2);
		//Display the map after removal
		System.out.println("\n Map after removal of key 2:");
		for(Map.Entry<Integer,String>entry:map.entrySet()) {
			System.out.println(entry.getKey() +":" +entry.getValue());
		}
	}

}
