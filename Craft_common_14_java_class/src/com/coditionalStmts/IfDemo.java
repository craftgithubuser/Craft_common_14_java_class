package com.coditionalStmts;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Mark: ");
		double mark = in.nextDouble();
		
		if(mark > 75) {
			System.out.println("First Division");
		}
		else {
			System.out.println("Second Division");
		}

	}

}
