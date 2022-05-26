package com.operators;

class Arithmetic_operators1 {
	public static void main(String as[]) {
		
		int a, b, c;
		a = 10;
		b = 2;

		c = a + b;
		System.out.println("Addtion: " + c); //12
		c = a - b;
		System.out.println("Substraction: " + c);//8
		c = a * b;
		System.out.println("Multiplication: " + c);//20
		c = a / b;
		System.out.println("Division: " + c);//5
		
		b = 3;
		c = a % b; 
		
		System.out.println("Remainder: " + c);//1
//		a = ++a;
//		System.out.println("Increment Operator: " + a);
//		a = --a;
//		System.out.println("decrement Operator: " + a);
	}
}
