package com.chainsys.strings;

public class Reverse {
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

}
