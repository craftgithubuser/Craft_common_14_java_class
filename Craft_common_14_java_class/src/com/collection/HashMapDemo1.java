package com.collection;

import java.util.*;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(100, "Abdul Hanif");
		hm.put(200, "Mohammed Gani");
		hm.put(300, "Smitha Ganesh");
		hm.put(400, "Robert Green");
		hm.put(500, "Robert Green");
		hm.put(300, "Daniel Chris");
		
		Set se = hm.entrySet();
		
		Iterator it  = se.iterator();
		
		while(it.hasNext()) {
			
		    Map.Entry me = (Map.Entry) it.next();
		    System.out.print(me.getKey() + " ");
		     System.out.println(me.getValue());

		}
		
	}

}
