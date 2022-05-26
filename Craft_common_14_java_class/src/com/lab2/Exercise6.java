package com.lab2;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

//		Convert the following switch statement into if-else statements:

		Scanner KB = new Scanner(System.in);
		
		String dayString1, dayString2, dayString3;
		
		int day = KB.nextInt();
		switch (day) {
		case 1:
			dayString1 = "Saturday";
		case 2:
			dayString2 = "Sunday";
			break;
		case 3:
			dayString3 = "Monday";
			break;
		case 4:
			dayString1 = "Tuesday";
		case 5:
			dayString2 = "Wednesday";
			break;
		default:
			dayString3 = "Invalid day";
			break;
		}
	}

}
