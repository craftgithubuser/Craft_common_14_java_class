package com.labsession;

abstract class Shape{
	
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
	}
	
}


public class TestAbstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle();
		s1.draw();
		
	}

}
