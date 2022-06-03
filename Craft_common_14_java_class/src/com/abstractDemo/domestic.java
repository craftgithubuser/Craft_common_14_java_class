package com.abstractDemo;

public interface domestic{

    void eat();   //public abstract void eat();
	
	void travel(); //public abtract void travel();
	
	void sleep(); //public abstract void sleep();
	
	default void methodOne() {
		
	}
	
	static void methodTwo() {
		
	}
}
