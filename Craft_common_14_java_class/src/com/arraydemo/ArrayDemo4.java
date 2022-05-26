package com.arraydemo;

public class ArrayDemo4 {

	public static void main(String[] args) {

		double[] studentMarks = { 67.9, 78, 80, 95, 55, 77 };
		double returnVal = GradeCalulator(studentMarks);
		System.out.println("Average mark of student: " + returnVal);
	}
	
	public static double GradeCalulator(double[] marks) {
		int total_mark = 0;
		double avg_mark;

//		for(int i =0; i< marks.length; i++) {
//			total_mark = total_mark + marks[i];
//		}

		for (double elt : marks) {
			total_mark += elt;
		}

		avg_mark = total_mark / marks.length;
		return avg_mark;
	}
}
