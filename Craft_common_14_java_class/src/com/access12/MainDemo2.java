package com.access12;

import com.accessModifier.ProtectedDemo;

//import com.accessModifier.PublicDemo;

//import com.accessModifier.DefaultDemo;

public class MainDemo2 extends ProtectedDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DefaultDemo m2 = new DefaultDemo();
//		m2.msg();

		
		MainDemo2 m3 = new MainDemo2();
		m3.msg();
		
		
		com.accessModifier.PublicDemo m4 = new com.accessModifier.PublicDemo();
		m4.msg();
	}

}
