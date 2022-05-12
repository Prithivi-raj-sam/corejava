package com.chainsys.oops;

import java.sql.SQLException;

public class InterfaceSecondParty implements ICalculator{
	
  public String name="Samayapuram maryamman thunai";
  
  //this method calling in InterfaceReturn class
	public ICalculator secondparty() throws SQLException {
		int num = 10;
		System.out.println("This is Second party 1");
		System.out.println(num);
		InterfaceSecondParty sp=new InterfaceSecondParty();
		ICalculator Ic=secondparty2();
		if (Ic !=sp ) {
//			System.out.println("som:");
			return Ic;
		}else  throw (new SQLException("this error is made my self!"));

	}
	public ICalculator secondparty2() {
		System.out.println("this is second Party 2");
		ICalculator In=new InterfaceSecondParty();
		return In;
		
	}
	@Override
	public int add(int v1, int v2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int multiply(int v1, int v2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int divide(int v1, int v2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
