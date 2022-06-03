package com.collection;

import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// creating an ArrayList
		ArrayList<String> fruits = new ArrayList<String>();

		//Adding elements to arraylist
		fruits.add("Mango"); // index = 0
		fruits.add("Apple"); // index = 1
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Berry"); // index = 2
		fruits.add("Orange"); // index = 3
		fruits.add(1,"Banana");
		
		
		Collections.sort(fruits);
		
		//removing elements from arraylist
		fruits.remove("Mango");

		//Displaying arraylist
		System.out.println(fruits);
	
		//Traversing  ArrayList
		//through iterator interface
		Iterator itr = fruits.iterator();	
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		System.out.println("\n");
		// for-each	
		for(String list: fruits) {
			System.out.println(list);
		}
		
		System.out.println("\n");
		//through for
		for(int i=0; i<fruits.size(); i++) {
			
			System.out.println(fruits.get(i));
		}
		
	}

}
