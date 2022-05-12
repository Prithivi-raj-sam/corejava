package com.chainsys.introduction;

public class Fourth {

	public static void main(String[] args) {
    	taskA();
      taskB(); 
		taskC();
	taskD();
	}
		public static void taskA() {
		System.out.println("enter your name:");
		java.util.Scanner sc= new java.util.Scanner(System.in);  
        String name=sc.next();
         sc.close();
        System.out.println(name);
	}
		public static void taskB() {
        	System.out.println("enter your number:");
			java.util.Scanner sc= new java.util.Scanner(System.in); 
	        int intvalue= sc.nextInt();
	        sc.close();
	        System.out.println(intvalue);
		}
		public static void taskC() {
			String s1="100";
			String s2="25";
			System.out.println(s1+s2);
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int z=a+b;
			System.out.println(z);
			
		}
		public static void taskD() {
			System.out.println("enter your age:");
			java.util.Scanner sc= new java.util.Scanner(System.in); 
	        int age=sc.nextInt();
	        if(age<=0) {
	        	System.out.println("invalid age");
	        }
	        if (age<18) {
	        	System.out.println("you need to wait for DL");
	        }
	        else {
	        	System.out.println("happy biking");
	        }
	        sc.close();
			
		}
}