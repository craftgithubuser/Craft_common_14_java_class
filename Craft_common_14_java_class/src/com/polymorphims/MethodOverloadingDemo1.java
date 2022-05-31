package com.polymorphims;


class Adder{
	
	static int add(int a) {
		return a+a;
	}
	
	static int add( int a, int b) {
		return a+b;
	}
	
	static double add(double a, int b) {
		return a+b;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
	static double add(int a, double b) {
		return a+b;
	}
}

public class MethodOverloadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Adder.add(10));
		System.out.println(Adder.add(10.5, 11.4));

	}

}
