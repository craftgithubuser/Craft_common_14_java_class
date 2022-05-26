package com.arraydemo;

public class ArrayDemo3 {

	public static void main(String[] args) {

		int []  studentMarks = {67,78,80,95,55,77};
		int total_mark = 0;
		double avg_mark;
		
//		for(int elt: studentMarks) {
//			total_mark += elt; // total_mark = total_mark + elt
//		}
			
		for(int i=0; i<studentMarks.length; i++) {
			total_mark  = total_mark + studentMarks[i];
		}
		
		avg_mark = total_mark / studentMarks.length;
		
		System.out.println("Total mark of student: " + total_mark);
		System.out.println("Average mark of student: " + avg_mark);
		

	}

}
