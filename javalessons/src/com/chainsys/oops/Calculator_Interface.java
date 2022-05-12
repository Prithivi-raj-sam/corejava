package com.chainsys.oops;

public class Calculator_Interface implements ICalculator {
	int v1=10;
	int v2=20;
	public  int add(int v1,int v2)
	{
		return v1+v2;
	}
	public  int multiply(int v1,int v2)
	{
		return v1*v2;
	}
	public int divide(int v1,int v2)
	{
		return v1/v2;
	}


}
