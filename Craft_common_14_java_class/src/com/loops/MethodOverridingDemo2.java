package com.loops;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class CBE extends Bank{
	
	@Override
	int getRateOfInterest() {
		return 10;
	}
}

class Dashen extends Bank{
	
	@Override
	int getRateOfInterest() {
		return 14;
	}
}

class Awash extends Bank{
	
	@Override
	int getRateOfInterest() {
		return 15;
	}
}


public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CBE b1 = new CBE();
		Dashen b2 = new Dashen();
		Awash b3 = new Awash();
		
		System.out.println("CBE rate of interest: " + b1.getRateOfInterest());
		System.out.println("Dashen rate of interest: " + b2.getRateOfInterest());
		System.out.println("Awash rate of interest: " + b3.getRateOfInterest());

	}

}
