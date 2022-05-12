package com.chainsys.oops;

import java.sql.SQLException;

//import com.chainsys.oops.ICalculator;

public class InterfaceReturn {
	//this method is calling from Test_Interface_calculator
     public ICalculator inter2() throws SQLException {
    	 InterfaceSecondParty In = new InterfaceSecondParty();
    	 System.out.println(In.name);
    	 ICalculator c=In.secondparty();
    	 System.out.println("working part 2!");
    	 return c;
     }
}

