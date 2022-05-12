package com.chainsys.datelessons;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class WorkingWithDate {
	public static void displayCurrentDate() {
		Calendar vCalendar =Calendar.getInstance();
		Date date =vCalendar.getTime();
		System.out.println(date);
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println(dateFormat.format(date));
		
		
	}
	public static void displayDob() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your DOB :(yyyy-MM-dd)");
		String dobString =sc.nextLine();
		sc.close();
		int year = Integer.parseInt(dobString.substring(0,4));
		int month=Integer.parseInt(dobString.substring(5,7))-1;
		int day=Integer.parseInt(dobString.substring(8,10));
		System.out.println(year+ "-"+month+"-"+day);
		
		Calendar date =new GregorianCalendar(year,month,day);
		Date dob =date.getTime();
		System.out.println("DOB1 ="+ dob);
		SimpleDateFormat f1 =new SimpleDateFormat("YYYY-MMM-dd");
		System.out.println("dob"+f1.format(dob));
		//retirement date
		date.add(Calendar.YEAR, 60);
		date.add(Calendar.MONTH, 1);
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.add(Calendar.DATE, -1);
		System.out.println("DOR "+f1.format(date.getTime()));
	}

}
