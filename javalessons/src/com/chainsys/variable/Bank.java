package com.chainsys.variable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bank {
	public static int currentbalance=10000;
	public static int ref;
   public Bank () {
   }
   public int deposit(int depAmount) {
	   currentbalance +=depAmount;
	   return currentbalance;
   }
   public int withdraw(int takeAmount) {
	   currentbalance -= takeAmount;
	   return currentbalance;
   }
   public int checkbalance() {
	   return currentbalance;
   }
   public int  createAccountNumber(int branchID) {
	   // we are going to create account number that is depends on date and time
	   Calendar vCalendar =Calendar.getInstance();
		Date date =vCalendar.getTime();
		String dateString= String.valueOf(date);
		//below we are getting time
		StringBuilder stringbuilder =new StringBuilder();
		stringbuilder.append(dateString);
	    stringbuilder.delete(0,11);
	    stringbuilder.delete(7,16);
	    stringbuilder.delete(2,3);
	    stringbuilder.delete(4,5);
	
	    //below we are getting date
		SimpleDateFormat simpleDate=new SimpleDateFormat("yyyy-MM-dd");
		String simpleDateString =simpleDate.format(date);
		
		//here we are appending time and date
		stringbuilder.append(simpleDateString);
		stringbuilder.delete(10,11);
		stringbuilder.delete(12,13);
		String changingSbuilder = stringbuilder.toString();
		int accountNo=Integer.parseInt(changingSbuilder);
		accountNo--;
		System.out.println(stringbuilder);
		System.out.println(accountNo);
	//   return stringbuilder;
		return 0;
   }
}
