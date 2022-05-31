package com.MethodOverriding;

class Vehicle {
	
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	
	@Override
	void run() {
		System.out.println("Bike is running");
	}
	
}

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b1 = new Bike();
		b1.run();
	}

}
