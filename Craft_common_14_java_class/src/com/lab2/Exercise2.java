package com.lab2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

//		Suppose that score is a variable of type double. Write the java code that increases 
//		the score by 5 marks if score is between 80 and 90
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mark score: " );
		double score = input.nextDouble();
		
		if(score <=90 && score >=80)
			score += 5;
		      System.out.println("Student score: " + score);
	 

	}

}
