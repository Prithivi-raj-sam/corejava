package com.chainsys.oops;

public class Test_Interface_calculator {
	public static void main(String[] args) {
		Test_Interface_calculator t = new Test_Interface_calculator();
		t.test1();
	}

	public static void cal() {
		ICalculator cal = new Calculator_Interface();
		System.out.println("Addition two value :" + cal.add(1, 2));
		System.out.println("Divide two value: " + cal.divide(4, 2));
		System.out.println("Multiply two value: " + cal.multiply(2, 3));

	}
//this method used to check how we can return interface object
	public void test1() {
		try {
			InterfaceReturn i = new InterfaceReturn();
			ICalculator z = i.inter2();
			System.out.println(z);
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
