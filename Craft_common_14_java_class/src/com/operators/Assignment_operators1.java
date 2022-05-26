package com.operators;

class Assignment_operators1 {
	public static void main(String as[]) {
		
		int a = 30;
		int b = 10;
		int c = 10;
		
		c = a + b; //  30+10 = 40
		System.out.println("c = a + b = " + c);//40
		
		c += a;// c = c+a; = 40+30
		System.out.println("c += a  = " + c);//70
		
		c -= a; // c = c-a; 70-30
		System.out.println("c -= a = " + c);//40
		
		c *= a; // c = c*a 40*30
		System.out.println("c *= a = " + c);//1200
		
		a = 20;
		c = 25;
		c %= a; // c = c%a; 25%20
		System.out.println("c %= a  = " + c); //5

	}
}
