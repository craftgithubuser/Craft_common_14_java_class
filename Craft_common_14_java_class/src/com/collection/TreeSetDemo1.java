package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating treeset
		TreeSet<String> al = new TreeSet<String>();
		
		//adding elements
		al.add("Ravi");
		al.add("Chris");
		al.add("Chris");
		al.add("Chris");
		al.add("Bob");
		al.add("Abel");
		
//		for(String ts: al) {
//			System.out.println(ts);
//		}
		
        Iterator it = al.descendingIterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
		
		
	}

}
