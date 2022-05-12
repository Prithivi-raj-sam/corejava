package com.chainsys.variable;

public class Demo {
   public static int DataA; //static global variable 
   public int DataB;//immutable global variable(not static)
   public final static int DataC=300;// constant
    
   //constructor
   /*constructor is a special method 
    * the name of the constructor and the name of the class will be same
    * constructor don,t have return type
    * constructor can take parameter
    * 
    */
   public Demo(int dataB) {
	   /* Assigning value to the global read only field (this dataB) */
	   this.DataB=dataB;
   }
    
   /**
    * Static method can be called without object
    */
   public static void sayhello() {
	   System.out.println("hello devolopers!!");
   }
   //greetUser
   public void greetUser() {
	   System.out.println("Greetings User!!");
   }
}
