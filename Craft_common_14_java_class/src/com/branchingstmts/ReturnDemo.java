package com.branchingstmts;

public class ReturnDemo {
	public static void main(String[] args) {
		for (int k =25; k< 31; k++){			
			new ReturnDemo().checkEven(k);
		}
	}
	public boolean checkEven(int a){
		if (a%2 == 0){
			System.out.println(a + " is even number");
			return true;
		}
		System.out.println(a + " is odd number");
		return false;
	}
}
