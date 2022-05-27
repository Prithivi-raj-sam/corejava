package com.chainsys.arrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Exponential {
	public static void main(String[] args) throws ParseException {
		String date="0.00";
		try {
			stest(date);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		System.out.println(date);
//		ptest();
	}
	public static void exponential() {
		System.out.println("print somthing");
		int a=6;
		int b=16;
		int count=0;
		int max=0;
		int ref=0;
		for (int i=a;i<=b;i++) {
			int n=i;
			while (n%2==0) {
				n=n/2;
               count++;
			}
			if(count>max) {
				max=count;
				ref=i;
			}
			count=0;
		}
		System.out.println("maximum exponential of 2's number"+ref);
	}
	public static void validate() {
//		String pattern = "^[-+]?[0-9]{0-10}$";
//		String pattern="^[-+]?[0-9]{9}";
//		String pattern ="^[0-9]*[.][0-9]$";
//		String pattern ="^[0-9]*[.]?[0-9]+$";
//		String pattern ="^[1-9]+";
//		String pattern ="^[A-Za-z][A-Za-z0-9!@#$%^&*]*$"; //first letter must alphabet remaining any
//		String pattern ="(.*)th(.*)$";
//		String pattern ="\"^[\\\\p{L} .'-]+$\"";
//		String pattern ="^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		/*
* ^[a-zA-Z0-9]      # start with an alphanumeric character
  (                 # start of (group 1)
    [._-](?![._-])  # follow by a dot, hyphen, or underscore, negative lookahead to
                    # ensures dot, hyphen, and underscore does not appear consecutively
    |               # or
    [a-zA-Z0-9]     # an alphanumeric character
  )                 # end of (group 1)
  {3,18}            # ensures the length of (group 1) between 3 and 18
  [a-zA-Z0-9]$      # end with an alphanumeric character

                    # {3,18} plus the first and last alphanumeric characters,
                    # total length became {5,20}
		 */
//		String pattern ="^[a-zA-Z]+(\\s[a-zA-Z]+)?$";
//		String pattern ="^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		String name="92/04/2011";
//		String pattern="^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
	    String pattern= "^\\d{2}/\\d{2}/\\d{4}$";
		Pattern patt=Pattern.compile(pattern);
		Matcher match = patt.matcher(name);
		boolean m=match.matches();
		System.out.println(m);
	}
	public static void m1() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();	
		System.out.println("enter integer:");
		int n=sc.nextInt();
		System.out.println(n);
		System.out.println(s);
		sc.close();
	}
	public static void m2() {
		String a="r";
		
		try {
			int i=Integer.parseInt(a);
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static String validateDate() throws InvalidInputDataException {
		System.out.println("somthing");
		String data="s/1/2021";
		String[] date = data.split("/");
		for (int i = 0; i < date.length; i++) {
			boolean result = false;
			String pattern = "^[0-9]+$";
			Pattern patt = Pattern.compile(pattern);
			Matcher match = patt.matcher(date[i]);
			result = match.matches();
			if (!result)
				throw new InvalidInputDataException("please enter date as integer");
		}

		int day = Integer.parseInt(date[0]);
		int mon = Integer.parseInt(date[1]);
		int year = Integer.parseInt(date[2]);
		if (year > 1985 || year < 2022) {
			if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
				if (day < 0 && day > 31)
					throw new InvalidInputDataException("invalid day! day Should below 31");

			} else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
				if (day < 0 && day > 30)
					throw new InvalidInputDataException("invalid day! day Should below 30");
			} else if (mon == 2)
				if (day < 0 && day > 28)
					throw new InvalidInputDataException("invalid day! day should below 28");
				else
					throw new InvalidInputDataException("Enter Valid Month");
		} else
			throw new InvalidInputDataException("Enter valid year");
		return data;
	}
	public static void date(String date)throws  InvalidInputDataException{
	
		String pattern1="^((\\d{1})|(\\d{2}))/((\\d{1})|(\\d{2}))/\\d{4}$";
		if(!match(pattern1,date)) 
			throw new InvalidInputDataException("date must be number");
		
		String pattern6= "^((\\d{1})|(\\d{2}))/(1[3-9]|[2-9][0-9])/\\d{4}$";
		if(match(pattern6,date))
			throw new InvalidInputDataException("month must be below 12");
		
		String pattern2="^((\\d{1})|(\\d{2}))/(0[13578]|1[02])/\\d{4}$";
		String pattern3="^(3[01]|[12][0-9]|0?[1-9])/(0?[13578]|1[02])/[0-9]{4}$";
		if(match(pattern2,date))  {
			if(!match(pattern3,date))throw new InvalidInputDataException("In this month day should be below 31");
		}
		
		String pattern4="^((\\d{1})|(\\d{2}))/(0?[469]|11)/(\\d{4})$";
		String pattern5="^((3[0]|[12][0-9]|0?[1-9]))/(0?[469]|11)/\\d{4}$";
		if(match(pattern4,date)) {
			if(!match(pattern5,date))throw new InvalidInputDataException("In this month day should be below 30");
		}
		
		String pattern7="((\\d{1})|(\\d{2}))/(2|02)/(([0-9][0-9][24680][048])|([0-9][0-9][13579][26]))$";
		String pattern8="^(([1][0-9]|0?[1-9])|(2[0-9]))/(2|02)/(([0-9][0-9][24680][048])|([0-9][0-9][13579][26]))$";
		if(match(pattern7,date)) 
			if(!match(pattern8,date))
			throw new InvalidInputDataException("In this month day should be below 29");

        String pattern10="((\\d{1})|(\\d{2}))/(2|02)/([0-9][0-9](([24680][1235679])|([13579][48013579])))$";
		String pattern9="^(([1][0-9]|0?[1-9])|(2[0-8]))/(2|02)/([0-9][0-9](([24680][1235679])|([13579][48013579])))$";
		 if(match(pattern10,date))
			if(!match(pattern9,date))
			throw new InvalidInputDataException("In this month day should below 28");
		 
		String pattern12="^((\\d{1})|(\\d{2}))/((\\d{1})|(\\d{2}))/((19[89][0-9])|(20([01][0-9])|20(2[0-2])))$";
		if(!match(pattern12,date))throw new InvalidInputDataException("hire date must be between 1980-2022");
		boolean m1=match(pattern12,date);
		System.out.println(m1);
		
	}
	public static boolean match(String pattern,String date) {
		Pattern patt=Pattern.compile(pattern);
		Matcher match = patt.matcher(date);
		return match.matches();
	}
	public static void stest(String date) throws InvalidInputDataException {
		String pattern8="^[0-9]+(.[0-9]*)?$";
		System.out.println(match(pattern8,date));
		if(!match(pattern8,date))throw new InvalidInputDataException("error");
	}
	public static void ptest() throws ParseException {
		SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
		String hdate="2/1/2021";
		Date date=hire_dateFormate.parse(hdate);
		System.out.println(date);
	}
public static void checkHireDate(String date)throws  InvalidInputDataException{
		
		String pattern1="^((\\d{1})|(\\d{2}))/((\\d{1})|(\\d{2}))/\\d{4}$";
		if(!match(pattern1,date)) 
			throw new InvalidInputDataException("date must be number");
		
		String pattern2= "^((\\d{1})|(\\d{2}))/(1[3-9]|[2-9][0-9])/\\d{4}$";
		if(match(pattern2,date))
			throw new InvalidInputDataException("month must be below 12");
		
		String pattern3="^((\\d{1})|(\\d{2}))/(0[13578]|1[02])/\\d{4}$";
		String pattern4="^(3[01]|[12][0-9]|0?[1-9])/(0?[13578]|1[02])/[0-9]{4}$";
		if(match(pattern3,date))  {
			if(!match(pattern4,date))throw new InvalidInputDataException("In this month day should be below 31");
		}
		
		String pattern5="^((\\d{1})|(\\d{2}))/(0?[469]|11)/(\\d{4})$";
		String pattern6="^((3[0]|[12][0-9]|0?[1-9]))/(0?[469]|11)/\\d{4}$";
		if(match(pattern5,date)) {
			if(!match(pattern6,date))throw new InvalidInputDataException("In this month day should be below 30");
		}
		
		String pattern7="((\\d{1})|(\\d{2}))/(2|02)/(([0-9][0-9][24680][048])|([0-9][0-9][13579][26]))$";
		String pattern8="^(([1][0-9]|0?[1-9])|(2[0-9]))/(2|02)/(([0-9][0-9][24680][048])|([0-9][0-9][13579][26]))$";
		if(match(pattern7,date)) 
			if(!match(pattern8,date))
			throw new InvalidInputDataException("In this month day should be below 29");

        String pattern9="((\\d{1})|(\\d{2}))/(2|02)/([0-9][0-9](([24680][1235679])|([13579][48013579])))$";
		String pattern10="^(([1][0-9]|0?[1-9])|(2[0-8]))/(2|02)/([0-9][0-9](([24680][1235679])|([13579][48013579])))$";
		 if(match(pattern9,date))
			if(!match(pattern10,date))
			throw new InvalidInputDataException("In this month day should below 28");
		 
		String pattern11="^((\\d{1})|(\\d{2}))/((\\d{1})|(\\d{2}))/((19[89][0-9])|(20([01][0-9])|20(2[0-2])))$";
		if(!match(pattern11,date))throw new InvalidInputDataException("hire date must be between 1980-2022");
		
		
	}
	

}
