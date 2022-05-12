package com.chainsys.unittest;

import com.chainsys.variable.Bank;
import java.util.Scanner;

public class Banktest {
	public static int accno = 910618;
	public static String name = "prithivi";

	public static void testDeposit() {
		Bank bankObject = new Bank();
		System.out.println("enter your acc no:");
		Scanner sc = new Scanner(System.in);
		int refnum = sc.nextInt();
		while (true) {
			if (refnum == accno) {
				System.out.println("your name is :" + name);
				System.out.println("To confirm press 1");
//    	     Scanner sca=new Scanner(System.in);
				int confirm = sc.nextInt();
				System.out.println("enter amount to deposit:");
				int depositAmount = sc.nextInt();
				sc.close();
				if (confirm == 1) {
					System.out.println("your amount has been deposited! ");
					System.out.println("the current balance is: " + bankObject.deposit(depositAmount));
				}
				break;
			} else {
				System.out.println("wrong Account number!!");
			}
		}
	}

	public static void testwithdraw() {
		Bank bankObject = new Bank();

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Account number:");
		int refnumber = scan.nextInt();
		System.out.println("enter the amount:");
		int takeAmount = scan.nextInt();
		boolean condition = refnumber == accno;
		while (condition) {
			if (Bank.currentbalance < takeAmount) {
				System.out.println("insufficient amount !!");
				System.out.println("your Account balance:" + bankObject.checkbalance());
				System.out.println("re-Enter correct Amount:");
				takeAmount = scan.nextInt();
				continue;
			} else {
				System.out.println("after withdraw account balance:" + bankObject.withdraw(takeAmount));
				break;
			}

		}
		if (condition == false) {
			System.out.println("account number is in correct \nplease enter the valid number:");

		}
		scan.close();
	}

	public static void testcheckbalance() {

		Bank bankObject = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your account number:");
		int refnumber = sc.nextInt();
		
		while (true) {
			if (refnumber == accno) {
				System.out.println("your account balance:" + bankObject.checkbalance());
				break;
			} else {
				System.out.println("wrong account number \nplease enter valid account number:");
				refnumber=sc.nextInt();
			}
		}
		sc.close();
	}

	public static void testopenaccount() {

		System.out.println("enter the name:");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("enter the Account number");
		long AccNo = s.nextInt();
		s.close();
		System.out.println("new Account holder name:" + name);
		System.out.println("new Account holder accno:" + AccNo);
	}

}
