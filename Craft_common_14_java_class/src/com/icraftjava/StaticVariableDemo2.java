package com.icraftjava;

class EmployeeInfo{
	
	public static String first_name = "kebede";   //static variable
	public String city = "Addis Ababa";           //instance variable
	
}

public class StaticVariableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Employee name: " + EmployeeInfo.first_name); // Kebede
//		System.out.println("Employee city: " + EmployeeInfo.city); //
		
		EmployeeInfo m1 = new EmployeeInfo();
		m1.first_name = "marta";
		m1. city = "NY";
		System.out.println("Employee name: " + m1.first_name);  //marta
		System.out.println("Employee city: " + m1.city); //NY
		
		System.out.println("\n");
		
		EmployeeInfo m2 = new EmployeeInfo();
		System.out.println("Employee name: " + m2.first_name); //marta 
		System.out.println("Employee city: " + m2.city); //Addis Ababa

	}

}
