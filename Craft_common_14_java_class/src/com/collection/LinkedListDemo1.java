package com.collection;

import java.util.*;
public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating Linkedlist
		LinkedList<String> city = new LinkedList<String>();
		
		//adding elements to the linkedlist
		city.add("Addis Ababa");
		city.add("Dubai");
		city.add("Dubai");
		city.add("Dubai");
		city.add("Newyork");
		city.add("Moscow");

//		Collections.sort(city);
		//traversing  on linkedlist
		//iterator
		
		Iterator it = city.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		// for-each	
		for(String list: city) {
			System.out.println(list);
		}
		
		
		
	}

}
