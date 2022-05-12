package com.chainsys.entrypoint;

public class ABCbankhelper {
	public static void condition() throws Exception {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int disition = 0;
		try {
		System.out.println("Press 1:To add Customer details \nPress 2:To add Employee details");
		disition =sc.nextInt();
		}catch(Exception err) {
			System.out.println("Error:" + err.getMessage());
		}
		switch(disition){
		case 1:
			ABCcustomer customer_obj = new ABCcustomer();
			customer_obj.customer();
			break;
		case 2:
			ABCEmployee employee_obj = new ABCEmployee();
			employee_obj.AbcEmployee();
			break;
		default:
			System.out.println("enter valid number:");
			disition=sc.nextInt();
			break;
		}
		sc.close();

	}

}
