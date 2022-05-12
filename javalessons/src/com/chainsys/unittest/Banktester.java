package com.chainsys.unittest;
import com.chainsys.variable.Banker;

public class Banktester {
	public static void testDeposit() {
		System.out.println("Before Balance " + Banker.currentBalance);
		Banker.deposit(10000);
		System.out.println("After Balance " + Banker.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Banker.currentBalance);
		int withdraw = Banker.withdraw(5000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Banker.currentBalance);
	}

	public static void testOpenaccount() {
		Banker.openAccount("suriya", 1234565432);
		System.out.println(Banker.customerName);
		System.out.println(Banker.accountNumber);

	}

}
