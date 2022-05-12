package com.chainsys.exception;
import java.util.Scanner;
public class Exceteption {
	public static void main(String args[]) {
		System.out.println("Before Try");
		int x=0,y=0,z=0;
		java.util.Scanner sc=null;
		String s1=null,s2=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("inside Try");
			System.out.println("enter value for X");
			s1=sc.nextLine();
			System.out.println("enter value fpor Y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("result"+z);
		}
		catch(ArithmeticException err) {
			System.out.println("inside catch1 "+err.getMessage());
			System.out.println("errorType "+err.getClass().getName());
		}
		catch(NumberFormatException err) {
			System.out.println("inside catch2 "+err.getMessage());
			System.out.println("errorType "+err.getClass().getName());
		}
		catch(Exception err) {
			System.out.println("inside catch3 "+err.getMessage());
			System.out.println("errorType "+err.getClass().getName());
		}
		finally {
			System.out.println("After finally");
			sc.close();
		}
		
	}

}
