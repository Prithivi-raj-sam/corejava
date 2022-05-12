package com.chainsys.entrypoint;

import java.util.Scanner;

public class ABCEmployee {
	public static Scanner sc = new Scanner(System.in);
    public void AbcEmployee() throws Exception {
    	try {
    	ABCEmployee e1 = new ABCEmployee();
    	BankEmployee eobj = new BankEmployee(e1.branch_id(), e1.Employee_id());
    	eobj.setPhone_number(e1.phone_no());
    	String scannerSolution = sc.next();
    	eobj.setName(e1.name());
    	eobj.setLocation(e1.location());
    	eobj.setAddress(e1.address());
    	eobj.setE_mail_address(e1.mail_id());
    	e1.Showdata(eobj);
    	}catch(Exception er) {
    		System.out.println("Error:"+ er.getMessage());
    	}finally {
    		sc.close();
    	}
    	
    }
	public int branch_id() throws Exception {
		int branch_ID = 0;
		try {
			System.out.println("enter the branch ID:");
			branch_ID = sc.nextInt();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
			throw err;
		}
		return branch_ID;
	}

	public int Employee_id() {

		int Employee_id = 0;
		try {
			System.out.println("enter the Employee id:");
			Employee_id = sc.nextInt();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());

		}
		return Employee_id;
	}

	public long phone_no() {

		long phone_no = 0;
		try {
			System.out.println("enter the phone number:");
			phone_no = sc.nextLong();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return phone_no;
	}

	public String name() {

		String name = "";
		try {
			System.out.println("enter the Employee name:");
			name = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return name;
	}

	public String location() {

		String location = "";
		try {
			System.out.println("enter the Employee location:");
			location = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return location;
	}

	public String address() {

		String address = "";
		try {
			System.out.println("enter the Employee address:");
			address = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return address;
	}

	public String mail_id() {

		String email = "";
		try {
			System.out.println("enter the Employee mail id:");
			email = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return email;
	}
	public void Showdata(Object eobj) {
		System.out.println("Press 1 To Show emplpoyee Details \nPress any Number To close Application:");
		int showD = sc.nextInt();
		if (showD == 1) {
			BankEmployee emobj = (BankEmployee) eobj;
			System.out.println("Bank Name:" + Branch.getBankName());
			System.out.println("branc id:" + emobj.getbranchID());
			System.out.println("bank location:" + emobj.getLocation());
			System.out.println("employee ID:" + emobj.getId());
			System.out.println("employee phone:" + emobj.getPhone_number());
			System.out.println("employee Name:" + emobj.getName());
			System.out.println("employee Address:" + emobj.getAddress());
			System.out.println("employee email ID:" + emobj.getE_mail_address());
		} else {
			System.out.println("Thank you!!!");
		}

	}

}
