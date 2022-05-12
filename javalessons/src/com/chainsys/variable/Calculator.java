package com.chainsys.variable;

public class Calculator {
	/**
	 * Add method: takes 2 integer value using the following parameters,
	 * and will add the values. The result of totaling WILL BE RETURNED BACK
	 * this is a static method object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int add(int param1, int param2) {
		int result=param1+param2;
		return result;
	}
	/**
	 * Multiply method: takes 2 integer value using the following parameters,
	 * and will multiply the values. The result of Multiplying WILL BE RETURNED BACK
	 * this is a static method object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int multiply(int param1, int param2) {
		int result=param1*param2;
		return result;
	}
	/**
	 * Divided method: takes 2 integer value using the following parameters,
	 * and will divide the values. The result of dividing WILL BE RETURNED BACK
	 * this is a static method object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int division(int param1, int param2) {
		int result=param1/param2;
		return result;
	}
	/**
	 * Subtract method: takes 2 integer value using the following parameters,
	 * and will Subtract the values. The result of Subtracting WILL BE RETURNED BACK
	 * this is a static method object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int subtract(int param1, int param2) {
		int result=param1-param2;
		return result;
	}	
}
