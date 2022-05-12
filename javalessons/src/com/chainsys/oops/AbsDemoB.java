package com.chainsys.oops;

public abstract class AbsDemoB {
	public abstract void echo();
	 //constructor
	  public AbsDemoB()
	  {
		  System.out.println("AbsDemoA created "+hashCode());
	  }
	  public static void show()
	  {
		  System.out.println("AbsDemoA show ");
	  }
}
// Abstract class must be inherited
// abstract methods must be overriden
class DemoBChild extends AbsDemoB
{
	public void echo() {
		System.out.println("Overriding the abstract method");
	}
	  // static method
	  
	  
	 


}


