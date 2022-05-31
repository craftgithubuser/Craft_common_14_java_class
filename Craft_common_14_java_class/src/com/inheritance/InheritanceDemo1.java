package com.inheritance;

class Employee{
	
	float  salary = 5000;
}

class Programmer extends Employee{
	
	double bonus = 10000;
	
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programmer p = new Programmer();
		
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Bonus of programmer is : " + p.bonus);
		
	}

}
