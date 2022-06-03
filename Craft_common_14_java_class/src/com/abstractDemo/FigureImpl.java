package com.abstractDemo;

public class FigureImpl extends Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure f = new FigureImpl();
		f.calcArea(10);
		
	}

	@Override
	public void calcArea(double length) {
		// TODO Auto-generated method stub
		
		double result = length * length;
		System.out.println("Area of rectangle: " + result);
		
	}

}
