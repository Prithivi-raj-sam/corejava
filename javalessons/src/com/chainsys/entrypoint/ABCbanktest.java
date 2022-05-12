package com.chainsys.entrypoint;

import java.util.Scanner;

public class ABCbanktest {
	public static void customerInfoGet() {
		java.util.Scanner sc=null;
		sc = new Scanner(System.in);
		System.out.println("enter the branch ID:");
		int branch_ID = sc.nextInt();
		System.out.println("enter Account number:");
		int account = sc.nextInt();
		
		CustomerDetails obj = new CustomerDetails(account);
		System.out.println("enter the customer ID:");
		int ID = sc.nextInt();
		System.out.println("enter current balance");
		float currentbalance = sc.nextInt();
		obj.setCurrent_balance(currentbalance);
		Customer cobj = new Customer(branch_ID, ID);
		System.out.println("enter phone number:");
		long phone = sc.nextLong();
		cobj.setPhone_number(phone);
		System.out.println(" ");
		String scannerSolution = sc.nextLine();
		System.out.println("enter the location:");
		String location = sc.nextLine();
		cobj.setLocation(location);
		System.out.println("enter Account type:");
		String acctype = sc.nextLine();
		obj.setAccount_type(acctype);
		System.out.println("enter name:");
		String name = sc.nextLine();
		cobj.setName(name);
		System.out.println("enter Address");
		String add = sc.nextLine();
		cobj.setAddress(add);
		System.out.println("enter the emailID:");
		String email = sc.nextLine();
		cobj.setE_mail_address(email);
		System.out.println("Press 1 To Show Customer Details \nPress any Number To close Application:");
		int showD = sc.nextInt();
		sc.close();
		if (showD == 1) {
			System.out.println("bank name:" + Branch.getBankName());
			System.out.println("branch id:" + cobj.getbranchID());
			System.out.println("bank location:" + cobj.getLocation());
			System.out.println("customer Account type:" + obj.getAccount_type());
			System.out.println("customer account Number:" + obj.getAccount_number());
			System.out.println("customer ID" + cobj.getId());
			System.out.println("customer Name:" + cobj.getName());
			System.out.println("current Account Balance::" + obj.getCurrent_balance());
			System.out.println("customer phone:" + cobj.getPhone_number());

			System.out.println("customer Address:" + cobj.getAddress());
			System.out.println("customer Mail:" + cobj.getE_mail_address());
		} else {
			System.out.println("Thank you!!!");
		}
	}

	public static void EmployeeInfoget() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the branch ID:");
		int branch_ID = sc.nextInt();

		System.out.println("enter the employee ID:");
		int ID = sc.nextInt();
		BankEmployee eobj = new BankEmployee(branch_ID, ID);
		System.out.println("enter employee phone number:");
		long phone = sc.nextLong();
		eobj.setPhone_number(phone);
		System.out.println(" ");
		String scannerSolution = sc.nextLine();
		System.out.println("enter the location:");
		String location = sc.nextLine();
		eobj.setLocation(location);
		System.out.println("enter employee name:");
		String name = sc.nextLine();
		eobj.setName(name);
		System.out.println("enter employee Address");
		String add = sc.nextLine();
		eobj.setAddress(add);
		System.out.println("enter employee emailID:");
		String email = sc.nextLine();
		eobj.setE_mail_address(email);
		System.out.println("Press 1 To Show emplpoyee Details \nPress any Number To close Application:");
		int showD = sc.nextInt();
		sc.close();
		if (showD == 1) {
			System.out.println("Bank Name:" + Branch.getBankName());
			System.out.println("branc id:" + eobj.getbranchID());
			System.out.println("bank location:" + eobj.getLocation());
			System.out.println("employee ID:" + eobj.getId());
			System.out.println("employee phone:" + eobj.getPhone_number());
			System.out.println("employee Name:" + eobj.getName());
			System.out.println("employee Address:" + eobj.getAddress());
			System.out.println("employee email ID:" + eobj.getE_mail_address());
		} else {
			System.out.println("Thank you!!!");
		}

	}

}
