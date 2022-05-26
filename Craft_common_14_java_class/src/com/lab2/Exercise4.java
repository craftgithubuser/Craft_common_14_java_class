package com.lab2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

//		Write a java code that prints true if both x and y are positive numbers else print false

		Scanner in = new Scanner(System.in);

		int x, y;
		
		System.out.println("Enter your x value:");
		x = in.nextInt();
		
		System.out.println("Enter your y value:");
		y = in.nextInt();
		

		if (x > 0 && y > 0) {
			System.out.println("true");
		}

		else {
			System.out.println("False");
		}

	}

}
