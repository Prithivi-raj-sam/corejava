package com.chainsys.strings;

public class StringlessonA {
      public static void lessonOne() {
    	  String firstString ="chainSys";
    	  System.out.println(firstString);
    	  char dataOne[]={'c','h','a','i','n'};
    	  String secondString =new String(dataOne);
    	  System.out.println(secondString);
    	  String thirdString = new String(new char[] {'c','h','a','i','n'});
    	  System.out.println(thirdString);
      }
      public static void lessonTwo() {
    	  String firstString = "hello";
    	  String secondString ="hello";
    	  String thirdString = "hello";
    	  int firstNumber =100;
    	  int secondnumber =100;
    	  int thirdNumber =100;
    	  firstString ="welcome";
    	  System.out.println(firstString);
    	  System.out.println(secondString);
      }
      public static void creatingStringInaForLoop() {
    	  for(int count=0;count<10;count++) {
     		  String sl="hello";
    	  }
      }
      public static void stringToCharArray() {
    	  java.util.Scanner scanner = new java.util.Scanner(System.in);
    	  System.out.println("enter the world");
    	  String firstString = scanner.nextLine();
    	  scanner.close();
    	  int stringlength = firstString.length();
    	  System.out.println("length "+ stringlength);
    	  char data[]=firstString.toCharArray();
    	  int dataarraylength = data.length ;
    	  System.out.println("length "+ dataarraylength);
      }
      public static void stringToUpperLower() {
    	  java.util.Scanner scanner =new java.util.Scanner(System.in);
    	  System.out.println("enter a word");
    	  String firstString =scanner.nextLine();
    	  scanner.close();
    	  System.out.println("s1 :" +firstString);
    	  String stringInUppercase =firstString.toUpperCase();
    	  System.out.println("toUpperCase =" + stringInUppercase);
    	  
    	  System.out.println("s1 :"+ firstString);
    	  String stringLowercase = firstString.toLowerCase();
    	  System.out.println("toLowercase :" + stringLowercase);
    	  System.out.println(firstString);
    	  String subString = firstString.substring(3);
    	  System.out.println(subString);
    	  subString = firstString.substring(2,6);
    	  System.out.println(subString);
    	  //replace
    	  String replacedString =firstString.replace('i','a');
    	  System.out.println(replacedString);
    	  //equals
    	  boolean flag1 =firstString.equals(stringInUppercase);
    	  System.out.println(flag1);
    	  //equalisIgnoreCase
    	  boolean flage = firstString.equalsIgnoreCase(stringInUppercase);
    	  System.out.println(flage);
      }
      public static void testStringTrim() {
    	  String secondString ="    hope   it    rain ";
    	  System.out.println(secondString.length());
    	  secondString = secondString.trim();
    	  System.out.println("After trim : "+ secondString.length());
    	  
      }
      public static void testSplit() {
    	  String firstString ="   tom and jerry are good friends  ";
    	  String trimmedString = firstString.trim();
    	  String[] data =trimmedString.split(" ");
    	  int count = data.length;
    	  System.out.println("word count :" +count);
      }
      public static void testSplitDays() {
    	  String firstString ="  Mon Tue wed Thu Fri Sat Sun  ";
    	  String trimmedString = firstString.trim();
    	  String[] data =trimmedString.split(" ");
    	  int count = data.length;
    	  System.out.println("word count :" +count);
    	  for (int index =count-1; index>=0; index--) {
    		  System.out.print(data[index]+ "\t");
    	  }
    
      }
      public static void reverse() {
    	  java.util.Scanner scanner= new java.util.Scanner(System.in);
    	  System.out.println("enter a Sentence:");
    	  String sentence ="";
    	  try {
    		  sentence = scanner.nextLine();
    	  }finally {
    		  scanner.close();
    	  }
    	  char[] data =sentence.toCharArray();
    	  int count = data.length;
    	  System.out.println("word count :" +count);
    	  for (int index =count-1; index>= 0; index--) {
    		  System.out.print(data[index]);
    	  }
    	  
    	  }
      public static void verifyString(String s1) {
    	  if(null==s1) {
    		  System.out.println("String is Null");
    		  return ;
    	  }
    	  else
    		  System.out.println("String is Not Null "+s1);
    	  
    	  if (!s1.isEmpty())
    		  System.out.println("\tNot Empty "+s1);
    	  else
    		  System.out.println("\t STring is Empty");
      }
      
}
