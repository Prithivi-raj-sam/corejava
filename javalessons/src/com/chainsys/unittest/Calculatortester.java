package com.chainsys.unittest;

import com.chainsys.variable.Calculator;

public class Calculatortester {
	
	public static void testAddMethod() {
		   Calculator refobject= new Calculator();
		   System.out.println("result of add:" + refobject.add(1, 2));
	   }
	public static void testMultiplyMethod() {
		   Calculator refobject= new Calculator();
		   System.out.println("result of multiply:" + refobject.multiply(4, 2));
	   }
	public static void testDivisionMethod() {
		   Calculator refobject= new Calculator();
		   System.out.println("result of division:" + refobject.division(4, 2));
	   }
	public static void testSubtractMethod() {
		   Calculator refobject= new Calculator();
		   System.out.println("result of subtraction:" + refobject.subtract(1, 2));
	   }
}
