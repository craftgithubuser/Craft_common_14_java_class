package com.lab3;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Accepting array element from the keyboard

		// define the scanner object
		Scanner in = new Scanner(System.in);

		// promt user to insert the size of an array
		System.out.println("Enter your array size/length: ");

		// accept the size
		int size = in.nextInt();

		// array declaration and initialization
		double studentMark[] = new double[size];
		
		
		double value[] =  ArrayAccept(studentMark,size);
		
		double result = GradeCalculator(value);

		System.out.println("Average student mark: " + result);

	}

	private static double[] ArrayAccept(double[]studentMark, int size) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// accepting the element of an array using for loop
		for (int i = 0; i < studentMark.length; i++) {
			System.out.println("Enter the element " + (i + 1) + " : ");
			studentMark[i] = in.nextDouble();
		}
		
		return studentMark;

	}

	private static double GradeCalculator(double[] marks) {
		int total_mark = 0;
		double avg_mark;

		for (double elt : marks) {
			total_mark += elt;
		}

		avg_mark = total_mark / marks.length;
		return avg_mark;

	}

}
