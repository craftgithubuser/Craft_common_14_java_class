package com.inheritance;

class Calculation{
	int x, y,z;
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The addition of x and y : " + z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The subtraction of x and y : " + z);
	}
	
}

class MyCalculation extends Calculation{
	
	int x, y,z;
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The multiplication of x and y : " + z);
	}
	
	public void division(int x, int y) {
		z = x / y;
		System.out.println("The Division of x and y : " + z);
	}
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculation calc = new MyCalculation();
		calc.addition(10, 10);
		calc.subtraction(20, 10);
		calc.multiplication(10, 10);
		calc.division(20, 10);
		
		
	}

}
