package com.finalDemo;

final class Bike{
	final int speedLimit = 90;

	final void run() {
     System.out.println("Bike is running safely");
	}
}

class Honda {
	
	void run() {
		System.out.println("Honda bike running safely with 100kmph");
	}
}

public class FinalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda obj = new Honda();
		obj.run();
		
	}

}
