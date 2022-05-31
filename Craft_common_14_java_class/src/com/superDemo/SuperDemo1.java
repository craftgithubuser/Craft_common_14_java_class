package com.superDemo;

class Animal{
	Animal(){
		System.out.println("Animal .....");
	}
	
	String color = "Brown";
	void eat() {
		System.out.println("Animal is eating....");
	}
}

class Dog extends Animal{
	
	Dog(){
		super();
		System.out.println("Dog ...");
	}
	
	String color = "Black";
	void bark() {
		System.out.println("bark bark ...");
	}
	
	void eat() {
		System.out.println("Dog is eating ....");
	}
	
	void display() {
		System.out.println(color); //black
		System.out.println(super.color); //Brown
		eat();
		super.eat();
		bark();
	}
	
}

public class SuperDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d  = new Dog();
		d.display();
		
	}

}
