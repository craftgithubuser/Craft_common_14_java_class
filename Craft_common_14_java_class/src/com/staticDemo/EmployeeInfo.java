package com.staticDemo;

public class EmployeeInfo {

	static String myname = "Daniel kafele";  //static variable
	static int age = 24;  //static variable
	int salary = 20000;   //instance variable

	public static void getEmpDetails() {

		System.out.println("Name: " + myname);
		System.out.println("Age: " + age);
//		 System.out.println("Salary: "+ salary);
	}

	public void printEmpDetails() {
		System.out.println("Name: " + myname);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}
