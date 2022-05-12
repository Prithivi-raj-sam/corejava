package com.chainsys.introduction;
import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Swap();
	
	}
	public static void checkUserName() {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String userName=sc.nextLine();
        sc.close();
        System.out.println("name is "+ userName);
        char[] nameAsCharacters = userName.toCharArray();
        int lengthofArray=nameAsCharacters.length;
        System.out.println("Length Of your name is:"+lengthofArray);
        if(lengthofArray<3) {
        	System.out.println("name must have atleast 3 chars");
        	return;
        }
        if(lengthofArray>15) {
        	System.out.println("name must not have more than 15 chars");
        	return;
        }
        String nameinuppercase=userName.toUpperCase();
        nameinuppercase=nameinuppercase.trim();
        char[] uppercasecharArray=nameinuppercase.toCharArray();
        lengthofArray=uppercasecharArray.length;
        int asciivalue=0;
        for(int index=0;index<lengthofArray;index++) {
        	asciivalue=(int) uppercasecharArray[index];
        	System.out.println("ASCII:" + asciivalue);
        	if (asciivalue<65 || asciivalue>90) {
        		 if(asciivalue!=32) {
        			 System.out.println("IN valid character in Name:");
        			 return;
        		 }
        	}
        }
        for(int index=0;index<lengthofArray;index++) {
        	System.out.println(index+ " "+nameAsCharacters[index]);
        	
        }
	}
    public static void findEvenNumbers() {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("enter any 10 digit numbers:");
    	long value=sc.nextLong();
    	sc.close();
    	long num= value;
    	long reminder=0;
    	while(num>0) {
    		reminder=num%10;
    		if(reminder%2==0) {
    			System.out.println(reminder);
    		}
    		num=num/10;
    	}
    }
    public static void Swap() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the first number:");
    	long a = sc.nextLong();
    	System.out.println("enter the second number:");
    	long b= sc.nextLong();
    	a=a+b;
    	b=a-b;
    	a=a-b;
    	System.out.println("the first number is:"+a);
    	System.out.println("the second Number is:" + b);
    	
    }
}