package com.chainsys.entrypoint;

import java.util.Scanner;

public class ABCcustomer {
	public static Scanner sc = new Scanner(System.in);

	public void customer() {
		try {
			ABCcustomer c = new ABCcustomer();
			CustomerDetails obj = new CustomerDetails(c.Account_no());
			Customer cobj = new Customer(c.branch_id(), c.customer_id());
			obj.setCurrent_balance(c.current_bal());
			cobj.setPhone_number(c.phone_no());
			cobj.setLocation(c.location());
			obj.setAccount_type(c.account_type());
			cobj.setName(c.name());
			cobj.setAddress(c.address());
			cobj.setE_mail_address(c.mail_id());
			c.showdata(cobj, obj);
		} catch (Exception err) {
			System.out.println("Error:" + err.getMessage());
			;
		} finally {
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public int Account_no() {

		int Account_no = 0;
		try {
			System.out.println("enter the Account Number:");
			Account_no = sc.nextInt();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());

		}
		return Account_no;
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


	public int customer_id() {

		int customer_id = 0;
		try {
			System.out.println("enter the customer id:");
			customer_id = sc.nextInt();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());

		}
		return customer_id;
	}

	public float current_bal() {

		float current_bal = 0;
		try {
			System.out.println("enter the current balance:");
			current_bal = sc.nextFloat();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return current_bal;
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
	public String location() {

		String location = "";
		try {
			System.out.println();
			String scannerSolution = sc.next();
			System.out.println("enter the customer location:");
			location = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return location;
	}

	public String account_type() {

		String account_type = "";
		try {
			System.out.println("enter the account type:");
			account_type = sc.nextLine();
			
			
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return account_type;
	}

	public String name() {

		String name = "";
		try {
			System.out.println("enter the customer name:");
			name = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return name;
	}

	public String address() {

		String address = "";
		try {
			System.out.println("enter the customer address:");
			address = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return address;
	}

	public String mail_id() {

		String email = "";
		try {
			System.out.println("enter the customer mail id:");
			email = sc.nextLine();
		} catch (NumberFormatException err) {
			System.out.println("Error:" + err.getMessage());
		}
		return email;
	}

	public void showdata(Object cobj, Object obj) {
		System.out.println("Press 1 To Show Customer Details \nPress any Number To close Application:");
		int showD = sc.nextInt();
		if (showD == 1) {
			Customer cusobj = (Customer) cobj;
			CustomerDetails cusD = (CustomerDetails) obj;
			System.out.println("bank name:" + Branch.getBankName());
			System.out.println("branch id:" + cusobj.getbranchID());
			System.out.println("bank location:" + cusobj.getLocation());
			System.out.println("customer Account type:" + cusD.getAccount_type());
			System.out.println("customer account Number:" + cusD.getAccount_number());
			System.out.println("customer ID:" + cusobj.getId());
			System.out.println("customer Name:" + cusobj.getName());
			System.out.println("current Account Balance:" + cusD.getCurrent_balance());
			System.out.println("customer phone:" + cusobj.getPhone_number());

			System.out.println("customer Address:" + cusobj.getAddress());
			System.out.println("customer Mail:" + cusobj.getE_mail_address());
		} else {
			System.out.println("Thank you!!!");
		}
	}

}
