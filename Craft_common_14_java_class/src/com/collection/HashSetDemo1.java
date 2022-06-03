package com.collection;

import java.util.*;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating Hashset
		HashSet<String> hs = new HashSet<String>();
	
		//adding elements
		hs.add("James");
		hs.add("joe");
		hs.add("Abnet");
		hs.add("James");
		
		
		//Traverse 
	    Iterator  it = hs.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		

	}

}
