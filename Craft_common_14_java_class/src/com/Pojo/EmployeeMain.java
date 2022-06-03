package com.Pojo;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<EmployeeInfo> list = new ArrayList();
		Map<Integer, EmployeeInfo> hm = new HashMap();
		EmployeeInfo emp1 = new EmployeeInfo();
		
		emp1.setEmpid(1001);
		emp1.setEmpname("Robert Green");
		emp1.setEmpsalary(100000);
		hm.put(1, emp1);
//		list.add(emp1);
		
		EmployeeInfo emp2 = new EmployeeInfo();
		
		emp2.setEmpid(1002);
		emp2.setEmpname("Mohammed Iqbal");
		emp2.setEmpsalary(15000.67);
		hm.put(2, emp2);
//		list.add(emp2);
		
		EmployeeInfo emp3 = new EmployeeInfo();
		
		emp3.setEmpid(1002);
		emp3.setEmpname("Mohammed Iqbal");
		emp3.setEmpsalary(15000.67);
		hm.put(3, emp3);
//		list.add(emp3);
		
		
		Set se = hm.entrySet();
		
		Iterator it = se.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.print("key: " + me.getKey()  + " ");
			EmployeeInfo e1 = (EmployeeInfo) me.getValue();
			System.out.println("Employee Information: " + e1.getEmpid() + " " + e1.getEmpname() + " " + e1.getEmpsalary());			
		}
		
//		EmployeeInfo e = hm.get(1);
//		System.out.println("Employee Information: " + e.getEmpid() + " " + e.getEmpname() + " " + e.getEmpsalary());
//		
//		
		
//		for(EmployeeInfo elt: list) {
//			System.out.println("Employee Information: " + elt.getEmpid() + " " + elt.getEmpname() + " " + elt.getEmpsalary());
//
//		}
		

//		System.out.println("Employee 1 Information: " + emp1.getEmpid() + " " + emp1.getEmpname() + " " + emp1.getEmpsalary());

//		System.out.println("Employee 2 Information: " + emp2.getEmpid() + " " + emp2.getEmpname() + " " + emp2.getEmpsalary());		
//		

	}

}
