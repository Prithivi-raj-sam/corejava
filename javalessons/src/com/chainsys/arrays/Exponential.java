package com.chainsys.arrays;

public class Exponential {
	public static void main(String[] args) {
		System.out.println("print somthing");
		int a=6;
		int b=16;
		int count=0;
		int max=0;
		int ref=0;
		for (int i=a;i<=b;i++) {
			int n=i;
			while (n%2==0) {
				n=n/2;
               count++;
			}
			if(count>max) {
				max=count;
				ref=i;
			}
			count=0;
		}
		System.out.println("maximum exponential of 2's number"+ref);
	}

}
