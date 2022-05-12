package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;
/**
 * @author prit3136
 */
public class Cartester {
     public static void tescar() {
    	 Car firstcar= new Car("TN59 CD6679");
    	 firstcar.setColor("red");
    	 firstcar.setFuel("petrol");
    	 firstcar.setYeaofPurchase(2022);
    	 System.out.println(firstcar.getRegnNo());
    	 System.out.println(firstcar.getColor());
    	 System.out.println(firstcar.getFuel());
    	 System.out.println(firstcar.getYeaofPurchase());
     }
     
}
