package com.lab2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

//		Write the java code that assigns 1 to x if y is greater than 0

		Scanner in = new Scanner(System.in);
		System.out.println("Enter y value: ");
		int y = in.nextInt();

		if (y > 0) {
			int x = 1;
			System.out.println("The value of x: " + x);
		}

	}

}
