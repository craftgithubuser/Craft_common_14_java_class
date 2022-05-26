package com.arraydemo;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] ageOfStudents = new int[5]; // index = 0 - 4

		ageOfStudents[0] = 23;
		ageOfStudents[2] = 33;
		ageOfStudents[3] = 31;
		ageOfStudents[4] = 25;
		
		
//	   System.out.println(ageOfStudents[0]);
//	   System.out.println(ageOfStudents[1]);
//	   System.out.println(ageOfStudents[2]);
//	   System.out.println(ageOfStudents[3]);
//	   System.out.println(ageOfStudents[4]);
	   
//		for loop
//		while loop
//		do while loop
//		for each loop
		
//		for each stmts
		for(int elt : ageOfStudents) {
			System.out.print(elt + "  ");
		}
		
		System.out.println("\n");
		
//		for loop
		for(int i=0; i<5; i++) {
			System.out.print(ageOfStudents[i] + "  ");
		}
		

	}

}
