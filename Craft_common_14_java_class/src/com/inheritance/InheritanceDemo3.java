package com.inheritance;

class Animal1{
	void eat() {
		System.out.println("animal eating....");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("wof wof ....");
	}
}

class BabyDog extends Dog1{
	void drink() {
		System.out.println("drink milk");
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog  d = new BabyDog();
		d.drink();
		d.bark();
		d.eat();

	}

}
