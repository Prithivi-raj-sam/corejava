package com.chainsys.arrays;

public class Array {
	public static void singleDimentionArray() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		String [] days=new String[size];
		String scannersolution =sc.nextLine();
		for(int index =0;index<size;index++) {
			System.out.println("enter value here:");
			days[index]=sc.nextLine();
		}
		for(int index =0;index<size;index++) {
			System.out.println("days["+index+"]="+days[index]);
		}
		sc.close();
	}
	public static void multiDimArray() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		String [][]days=new String[size][];
		int column=0;
		for(int row=0;row<size;row++) {
			System.out.println("enter the number of column in row"+row+":");
			column=sc.nextInt();
		}
		for(int row=0;row<size;row++) {
			for(int colmn=0;colmn<column;colmn++) {
				
			}
		}
	}

}
