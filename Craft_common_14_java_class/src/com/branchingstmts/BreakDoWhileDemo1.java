package com.branchingstmts;

public class BreakDoWhileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		do {
			if (i == 15) {
				i++;
				break;
			}
			System.out.print(i + " ");
			i++;
		} while (i <= 20);

	}

}
