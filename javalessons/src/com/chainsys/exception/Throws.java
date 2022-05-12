package com.chainsys.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {
	public static void main (String args[]) {
		Throws t1=new Throws();
		System.out.println(t1.ids());
//		System.out.println(this.getClass());
	} 
	public  int ids(){
		Scanner sc = new Scanner(System.in);
		int number = 0,a=0;
		try {
			System.out.println("enter a number:");
			String name=sc.nextLine();
			number = Integer.parseInt(name);
			a=number/0;
		} catch (InputMismatchException err) {
			System.out.println(err);
			System.out.println("mismatch");
			System.out.println(err.getMessage());
		}catch(ArithmeticException err) {
			System.out.println(err);
			System.out.println("arithmatic");
			System.out.println(err.getMessage());
		}catch(NumberFormatException er){
			System.out.println(er);
			System.out.println();
			System.out.println(er.getMessage());
		}catch(Exception er) {
			System.out.println(er);
			System.out.println(er.getMessage());
		}finally {
			sc.close();
		}
		
//		System.out.println(a);
		System.out.println("ytfdyt");
		return number;
	}
	public void nestTry() {
		Scanner sc = new Scanner(System.in);
		int number = 0,a=0;
		try {
			try {
			System.out.println("enter a number:");
//			String name=sc.nextLine();
			number = sc.nextInt();
			a=number/0;
			}catch(Exception er) {
				System.out.println(er);
			}
	}finally {
		sc.close();
	}

	}
		
}
