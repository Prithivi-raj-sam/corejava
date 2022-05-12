package com.chainsys.exception;
import java.util.Scanner;
public class NestedTry {
	static String[] data;
	public static void main(String[] args) throws Exception{
//		errorsample();
		exceptionthrow();
	}
	public static void basictry() {
		int num =0;
		int numValue =0;
		data=new String[2];
		java.util.Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			try {
			System.out.println("enter value for X");
			data[1]=sc.nextLine();
			numValue=Integer.parseInt(data[4]);
			System.out.println("the Square is "+ numValue*numValue);
		}catch(NumberFormatException nb) {
			System.out.println("not a number!");
		}
			num=data.length;
			System.out.println("Array Length"+num);
		}catch(NumberFormatException ne) {
			System.out.println("ArrayIndexOutOfBounds-no arguments given!!!");
		}catch(Exception er) {
			System.out.println("Exeption "+er.getMessage());
		}
	}
	public static void m4() {
		
		
		int b=10/5;
	
		//inner exception
		//e1 is nested inside e2
		//if a method throws an exception must call inside try  block.
		try {
//		e2.addSuppressed(e1);
			Exception e1=new Exception();
			Exception e2=new Exception("Error 2",e1);
		System.out.println("Error:"+e1.getMessage());
		throw e2;}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void testM4() {
		try {
			m4();
		}catch(Exception er) {
			System.out.println("inside Catch"+er.getMessage());
			Throwable t1=er.getCause();
			System.out.println("Cause "+t1.getMessage());
		}
	}
	public static void errorsample()  {
		Error e = new Error("StackOverflow");
		Error e4=new Error();
		
			e4.addSuppressed(e);
			System.out.println("Error:"+e.getMessage());
//	     throw e;	
	}
	public static void exceptionthrow()    {
		int b=0;
		
		if (b==0) {
			
				throw new RuntimeException("prithivi");
				// here compilation error handled by jdk. 
				//so if we throw RuntimeException or their subclass(ArithmeticException) there is no need for handle this exception.
				// but if we throw Exception it also includes compilation exception
				// because of that jdk will give warning to handle the Exception
				// note that without RuntimeException all the Exception are compile time Exception
		}
		System.out.println("after catch");
	}
	public static void m15() {
		
	}

}
