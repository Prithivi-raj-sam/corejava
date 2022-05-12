package com.chainsys.unittest;

import com.chainsys.variable.Calculator;
import com.chainsys.variable.Demo;

/**
 * tester class for global variable
 * 
 * @author prit3136
 * @category to test Demo class, its field and methods date:mar 24 2022 
 */

public class VariableTester {
	/**
	 * test static variable
	 */
   public  static void testGlobalvariable() {
	   /**
	    * display the value of static field 
	    * value is zero(default value)
	    * Data is accessed with out creating object
	    */
	   System.out.println("dataA: "+ Demo.DataA);
	   //display the value pf immutable field
	   //this is not possible without an object
//	   Demo sc=new Demo(10);
//	   System.out.println("DataB: " + sc.DataB);
	   //display the value of constant field
	   System.out.println("DataC" + Demo.DataC);
	   //modifing value of the static field DataA
	   Demo.DataA=2345;
	   System.out.println("dataA: " + Demo.DataA);
	   //modifing value of the static field DAtaC
	   //Demo.DataC=2345;
   }
   /**
    * to test how to use immutable variable of a class
    * created on  :25 mar 2022
    */
   public static void testimmutableVariable() {
	/**
	 *cannot make a static reference to the non-static field
	 *first create an object or the class
	 *pass an int value as an argument to the constructors
	 *access the immutable instance field using the object reference   
	 */
	   Demo firstObject = new Demo(123);
//	   Demo firstObject =new Demo(567);
	   System.out.println(firstObject.DataB);
	   /**
	    * value assigned to an immutablre field can not be changed
	    * value for the immutable field can be assigned only throw the constructor
	    */
//	   firstObject.DataB = 567;
   }
   /**
    * calling static method using class name 
    * without creating an object 
    * created on : march 25 2022
    */
   public static void testStaticMethod() {
	   Demo.sayhello();
   }
   /**
    * calling non-static method using object reference 
    * without creating an object,non static method cannot be called 
    * created on : march 25 2022
    */
   public static void testNonStaticMethod() {
	  //ERROR
	   //Demo.greetUser();
	   Demo firstObject =new Demo(111);
	   //call the non static method
	   firstObject.greetUser();
   }
 }
