package com.abstractDemo;

public class MainDemo extends AbstractDemo1 {

	@Override
	void callme() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of call me method from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractDemo1 a1 = new MainDemo();
		a1.callme();
		a1.callmetoo();
		
	}

}
