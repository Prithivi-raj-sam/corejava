package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class Employeetest {
	public static void testempname() {
		Employee firstemployee =new Employee(1234);
		firstemployee.setName("prithivi");
		System.out.println(firstemployee.getname());
	}
	public static void testempID() {
		Employee firstemployee =new Employee(1234);
//		firstemployee.setName("prithivi");
		System.out.println(firstemployee.getEmpID());
	}
	public static void testempcity() {
		Employee firstemployee =new Employee(1234);
		firstemployee.setcity("madurai");
		System.out.println(firstemployee.getcity());
	}
	public static void testempsalary() {
		Employee firstemployee =new Employee(1234);
		firstemployee.setsalary(10000);
		System.out.println(firstemployee.getsalary());
	}

}
