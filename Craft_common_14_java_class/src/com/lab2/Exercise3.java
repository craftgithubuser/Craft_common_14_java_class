package com.lab2;

import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {

//		Write a java code that prints true if x is an odd number and positive else prints false
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your x value: ");
		int x = in.nextInt();
		
		if(x%2 != 0 && x>0)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
	}

}
