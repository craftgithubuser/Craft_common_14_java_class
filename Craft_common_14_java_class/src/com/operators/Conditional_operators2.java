package com.operators;

import java.util.Scanner;

public class Conditional_operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("insert any number: ");
		
		double number = in.nextDouble();
		
        String result;
        result = (number > 0.0) ? "positive" : "not positive";
         System.out.println(number + " is " + result);


	}

}
