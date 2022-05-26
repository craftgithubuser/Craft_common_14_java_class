package com.lab2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your grade: " );
		String grade = in.next();
		
	    switch(grade) {
	    
	    case "A+":
	    	System.out.println("Highest honors");
	    	break;
	    
	    case "A-":
	    case "A":
	    	System.out.println("Honors");
	    	break;
	    	
	    case "B+":
	    case "B":
	    	System.out.println("Favorable Mention");
	    	break;
	    }
	}

}
