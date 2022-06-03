package com.abstractDemo;

class A{
	
}

public class MammalInt extends A implements Animal, reptile, domestic{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eats ....");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels ....");
	}
	
	public int noOfLegs() {
	      return 0;
	   }
	
	public static void main(String[] args) {
		
		MammalInt  m1 = new MammalInt();
		
		m1.eat();
		m1.travel();
		m1.noOfLegs();
		
//		MammalInt m1 = new MammalInt();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}
