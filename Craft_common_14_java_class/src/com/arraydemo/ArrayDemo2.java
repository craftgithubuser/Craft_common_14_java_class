package com.arraydemo;

public class ArrayDemo2 {

	public static void main(String[] args) {

//		String nameOfStudent[] = new String[10];
//		
//		nameOfStudent[0] = "Aman";
//		nameOfStudent[1] = "john";
		
		String nameOfStudent[] = {"Aman", "John", "Jamie", "Abebe", "kebede", "kiya", "bob","liya","Isaac", "selam"}; // index = 0 - 9
		
		System.out.println(nameOfStudent.length);
		
		for(String elt: nameOfStudent) {
			System.out.print(elt + "  ");
		}
		
		System.out.println("\n");
		
		for(int i=0; i < nameOfStudent.length; i++) {
			System.out.print(nameOfStudent[i] + "  ");
		}
	}

}
