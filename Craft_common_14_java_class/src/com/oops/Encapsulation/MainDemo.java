package com.oops.Encapsulation;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student st = new Student();
//		
//		st.setFirstName("Jamie");
//		st.setLastName("Foxx");
//		st.setAge(45);
//		st.setCollege("Natural Science");
//	
//		System.out.println("Student First Name: " + st.getFirstName());
//		System.out.println("Student last Name: " + st.getLastName());
//		System.out.println("Student Age: " + st.getAge());
//		System.out.println("Student First Name: " + st.getCollege());
		
		
		Account acc = new Account();
		acc.setFullName("Jamie Foxx");
		acc.setAccountNumber(1000345634534L);
		acc.setAddress("RK road");
		acc.setEmail("jamie@gmail.com");
		acc.setDepositAmount(50);
		acc.setAccountBalance(20000);
		
		System.out.println("Employee Full Name: " + acc.getFullName());
		System.out.println("Employee Address: " + acc.getAddress());
		System.out.println("Employee Account Number: " + acc.getAccountNumber());
		System.out.println("Employee Email Address: " + acc.getEmail());
		System.out.println("Employee Deposit Amount: " + acc.getDepositAmount());
		System.out.println("Employee Total Account Balance: " + acc.getAccountBalance());
//		

	}

}
