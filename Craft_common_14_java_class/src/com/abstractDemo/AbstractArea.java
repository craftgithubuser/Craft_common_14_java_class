package com.abstractDemo;

abstract class Figure2{
	double dim1, dim2;
	
	Figure2(double d1, double d2){	
		dim1 = d1;
		dim2 = d2;
	}
	
	abstract double area();
}

class Rectangle extends Figure2{
	
	Rectangle(double d1, double d2) {
		super(d1, d2);
	}

	@Override
	double area() {
		return dim1 * dim2;
	}
}

public class AbstractArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure2 f2 = new Rectangle(10,11);
	    
		System.out.println(f2.area());
	}

}
