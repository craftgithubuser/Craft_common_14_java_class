package com.icraftjava;

public class InstanceVariableDemo {

	int age = 25; // <----Instance Variable Declared outside methods

	public void methodone() {
		int i = 10; // local variable
		System.out.println("Value of i:" + i); // 10
		System.out.println("Value of  age:" + age); //27
	}

	public void methodtwo() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k); // 30
		System.out.println("Value of  age:" + age); //25
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo m1 = new InstanceVariableDemo();
		m1.age = 27;
		m1.methodone();
//		m1.methodtwo();
		
		
		InstanceVariableDemo m2 = new InstanceVariableDemo();
		m2.age=30;
		m2.methodone();
		
		InstanceVariableDemo m3 = new InstanceVariableDemo();
		m3.methodone();
		
		InstanceVariableDemo m4 = new InstanceVariableDemo();
		m4.methodone();
	}

}
