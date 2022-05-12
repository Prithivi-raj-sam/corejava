package com.chainsys.classandmethods;
/** 
 * @author prit3136
 */
public class Car {
      private final String regnNo;
      private int yeaofPurchase;
      private String color;
      private String fuel;
      
      public Car(String rno) {
    	  this.regnNo=rno;
      }

	public String getRegnNo() {
		return regnNo;
	}

	public int getYeaofPurchase() {
		return yeaofPurchase;
	}

	public void setYeaofPurchase(int yeaofPurchase) {
		this.yeaofPurchase = yeaofPurchase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
