package com.polymorphims;

class AreaCalc {
	
	public double calcArea(int length, int width) {
		double rectArea = length * width;
		return rectArea;
	}
	
	public double calcArea(double radius) {
		double circleArea = radius * radius * 3.14;
		return circleArea;
	}

}

public class MethodOverloadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaCalc calc = new AreaCalc();
		
		double returnValue1 = calc.calcArea(10);
		System.out.println("The Area of a circle is: " + returnValue1);
		
		double returnValue2 = calc.calcArea(10,12);
		System.out.println("The Area of a rectangle is: " + returnValue2);
		
		
	}

}
