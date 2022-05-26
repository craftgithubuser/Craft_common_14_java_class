package com.arrademo;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
	 int studentMarks[][] = {
			                   {67, 78, 80, 95,},
			                   {72, 78, 70, 59, 55, 77},
			                   {47, 78, 85, 95, 85, 70},
		                       {77, 78, 78, 95, 55, 77},
			                   {57, 80, 78, 95, 55, 77},
			                   {71, 78, 80, 59, 55, 77},
			                   {60, 78, 80, 95, 85, 70},
			                   {73, 78, 80, 95, 55, 77}
			                   };
	 
	 for(int i = 0; i<studentMarks.length; i++) {
		 
		 System.out.print("Student" + (i+1) + ": ");
		 
		 for(int j =0; j<studentMarks[i].length; j++) {
			 System.out.print(studentMarks[i][j] + "  ");
		 }
		 System.out.println();	 
	 }

	}

}
