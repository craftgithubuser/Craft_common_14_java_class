package com.labsession;

interface printable{
	
	void print(); 
	
	default void msg() {
		System.out.println("default method");
	}
	static void msg2() {
		System.out.println("static method");
	}
}

interface Showable{
	void show();
}

class A4 implements printable, Showable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printed");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showed");
	}
	
}

public class TestInterface {
	
	public static void main(String[] args) {
	
		printable p1 = new A4();
		p1.print();
		
	}

}
