package com.icraftjava;

public class LocalVariableDemo {
	
	public void methodOne() {
		int j = 25;    // <---------- local variable
		System.out.println("Value of j:" + j); //25
	}
	
	public void methodTwo() {
		int k = 30; // <---------- local variable
		System.out.println("Value of k:" + k); // 30
//		System.out.println("Value of j:" + j); // ← Error
	}
	
	int k = 40;  

	public static void main(String[] args) {
		
		LocalVariableDemo m1 = new LocalVariableDemo(); //creating an  object
		
		m1.methodTwo();	
		m1.methodOne();
	}

}
