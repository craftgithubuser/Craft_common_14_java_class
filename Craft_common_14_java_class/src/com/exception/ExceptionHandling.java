package com.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Checked errors  - compile-time error
		int age =10;
		String name = "James";
		
	    //unchecked errors - run-time error - exception
		// try catch
		

		

		try {
			Integer i = new Integer("abc");
			
			int arr[] = new int[4]; // 0-3
			arr[4] = 10;
			
			int a = 10/0;
		}
		catch(Exception e) {

		}
		
	}

}
