package com.stringHandling;

public class StringHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = "James";
//		
//		System.out.println("Name: " + str1);
//		
//		String str2 = str1.concat(" Bond");
//		
//		System.out.println("Name Full: " + str1);
//		System.out.println("Name Full: " + str2);

//		String  str3 = new String("This is a new string");
//		
//		System.out.println(str3);
//		
//		String strnew = "I" + " Like" + " Java" + " Language";
//		System.out.println(strnew);
//		
//		int len = strnew.length();
//		System.out.println("length of strnew string: " + len);
//		
//		char c = strnew.charAt(2);
//		System.out.println(c);
		
		
//		String str4 = "Ismail";
//		String str5 = "Daniel";
//		
//		
//		if(str4.equalsIgnoreCase(str5)) {
//			System.out.println("They are equal");
//		}
//		else {
//			System.out.println("They are not equal");
//		}
		

//		String str6 = "567867A56";
//		char ch;
//		for(int i=0; i<str6.length(); i++) {
//		       ch = str6.charAt(i);
//		       System.out.println(ch);
//		       
//		       if(Character.isLetter(ch)){
//		          continue;
//		          }
//		        else{
//		          System.out.println("String contains NON Letter");
//		         }
//		}

//		String str7  =  "Today is holiday. Tomorrow is working day.";
//		
//		 int  loc = str7.indexOf("holiday");
//		 System.out.println("Position of holiday:" + loc);
//		 
//		 String sub = str7.substring(9, 16);
//		 System.out.println("SubString: " + sub);
//		 
//		 
//		 String[] arr = str7.split(" ");
//		 
//		 for(String elt: arr) {
//			 System.out.println(elt);
//		 }
		 
//		 String str8 = "          Hello World       ";
//		 System.out.println(str8.replace('l', 'w'));
//		 
//
//		 System.out.println(str8.trim());
//		 
//		 System.out.println(str8.toUpperCase());
//		 System.out.println(str8.toLowerCase());
		 
		 
		
		StringBuffer str1 = new StringBuffer("Hello");
	      str1.insert(5," World");   
	      
	      System.out.println(str1.reverse());
		
	}

}
