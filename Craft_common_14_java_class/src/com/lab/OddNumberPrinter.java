package com.lab;

public class OddNumberPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a code that will print odd number from 1 to 20;
		
//		for(int i=1; i<=20; i +=2) {
//			System.out.print(i + " " );
//		}
		
		
		int i = 1;
		while(i <=20) {
			if( i%2 ==1)
				System.out.print(i + " ");
			
			i++;
		}
		

	}

}
