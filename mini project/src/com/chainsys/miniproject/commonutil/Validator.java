package com.chainsys.miniproject.commonutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;





public class Validator {

	public static void checkStringForParseInt(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[0-9]+$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("please enter Integer");
	}

	public static void CheckNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		if (data <= 0) {
			throw new InvalidInputDataException("please enter number greater than zero");
		}

	}

	public static void checklengthOfString(String data) throws InvalidInputDataException {

		int len = data.length();
		if (len > 15 && len < 3)
			;
		else
			throw new InvalidInputDataException("length does meet required length");

	}

	public static void checkStringOnly(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[a-zA-Z]+(\s[a-zA-Z]+)?$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("please enter character only");
	}

	public static void CheckNumberForGreaterThanZero(float data) throws InvalidInputDataException {
		if (data < 0)
			throw new InvalidInputDataException("please enter value greater than zero");

	}

	public static void checkEmail(String data) throws InvalidInputDataException {
		boolean result = false;
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\d.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern patt = Pattern.compile(regexPattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("your email does not meet required length or complex");
	}

	public static void checkJobId(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("wrong pattern for job id");
	}

	public static void checkPhone(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[0-9]{10}$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("please enter 10 digit ");
	}

	public static void checkSalaryLimit(float data) throws InvalidInputDataException {
		if (data < 7000 && data > 150000) {
			throw new InvalidInputDataException("please enter salary between 7000 and 150000");
		}
	}

	public static boolean checkDateFormat1(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		String[] data1 = data.split("/");

		int date = Integer.parseInt(data1[0]);
		int mon = Integer.parseInt(data1[1]);
		int yrs = Integer.parseInt(data1[2]);
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			if ((asc < 46) || (asc > 58))
				throw new InvalidInputDataException("Enter date in correct format ");
		}
		if (yrs > 1984 && yrs < 2022) {
			if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
				if (date > 0 && date <= 31)
					result = true;
				else
					throw new InvalidInputDataException("invalid day! day Should below 31");
			else if (mon == 2 || mon == 4 || mon == 6 || mon == 9 || mon == 11)
				if (date > 0 && date <= 30)
					throw new InvalidInputDataException("invalid day! day Should below 30");
				else
					throw new InvalidInputDataException("invalid day! day should below 28");
			else
				throw new InvalidInputDataException("enter valid month");
		} else
			throw new InvalidInputDataException("enter valid year");

		return result;

	}

	

//	public static boolean checkMail(String data) throws InvalidInputDataException{
//		boolean result=false;
//		int count =0;
//		int spechar=0;
//		int len=data.length();
//		for(int index=0;index<len;index++) {
//			int asc=(int)data.charAt(index);
//			if(asc<91 && asc>64 || asc==32)
//				throw new InvalidInputDataException("don't enter uppercase letters");
//			else if(asc>47 && asc<58)
//				count+=1;
//			else if(asc==64)
//				spechar+=1;
//		}
//		
//		if(count==0) throw new InvalidInputDataException("your email must contain Numerical value");
//		if(spechar==0 ) throw new InvalidInputDataException("your email must contain @");
//		if(!data.endsWith(".com"))
//			throw new InvalidInputDataException("your email must end with \".com\" ");
//		return result;
//	}
//	public static boolean checkStringForParseInt(String data) throws InvalidInputDataException{
//	//TODO--This method is incomplete 
//	boolean result =false;
//	int len=data.length();
//	for(int index=0;index<len;index++) {
//	int asc=(int)data.charAt(index);
//	if(asc>47 && asc<58)
//		result =true;
//	else throw new InvalidInputDataException("enter integer value");
//	}
//	
//	//if data is invalid throw new InvalidInputDataException ("The value in String must contain only numbers")
//	return result;
//}
//	public static boolean checkStringOnly(String data) throws InvalidInputDataException {
//		boolean result =false;
//		int len=data.length();
//		for(int index=0;index<len;index++) {
//			data.toUpperCase();
//			int asc=(int)data.charAt(index);
//			if(asc<91 && asc>64 || asc==32) {
//				result=true;
//			}
//			else throw new InvalidInputDataException("Enter only Alphabet");
//		}
//		return result;
//	}
//	public static void validateDate(String strDate) throws ParseException nullpointer
//	   {
//		if (strDate.trim().equals(""))
//		{
//		    throw new NullPointerException("date cannot be null");
//		}
//		else
//		{ 
//		    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
//		    sdfrmt.setLenient(false);
//		        Date javaDate = sdfrmt.parse(strDate); // it will throw exception
//		    
//		}
//	   }

}
