package com.labsession;

abstract class Bike{
	 Bike(){
		 System.out.println("Bike is created");
	 }
	 
	 abstract void run();    // abstract method
	 
	 void changeGear() {    // non abstract method/ concrete method
		 System.out.println("Gear changed");
	 }
}

class Honda extends Bike{

   @Override
   void run() {
	   System.out.println("Running safely");
   }
	
}
public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b1 = new Honda();
		b1.run();
		b1.changeGear();
		
	}

}
