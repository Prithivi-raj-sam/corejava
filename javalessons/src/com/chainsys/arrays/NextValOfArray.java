package com.chainsys.arrays;

public class NextValOfArray {
	public static void main(String[] args) {
		NextValOfArray n=new NextValOfArray();
		n.nextVal();
	}
	public void nextBigNumber() {
	    System.out.println("ans:");
		int [] a= {8,4,1,9,6,2};
		for (int num:a) {
			int temp=100;
			for(int num1:a) {
				if(num<num1 && num1<temp) {
				    temp=num1;
				}
			}
			if (temp==100)
				System.out.print(num+"->"+",");
			else
			System.out.print(num+"->"+temp+",");
		}
	}
	public void nextVal() {
		System.out.println("ans:");
		int [] a= {8,4,1,9,6,2};
		int temp=0;
		for (int num:a) {
			for(int num1:a) {
				if(num1==num+1) {
					temp=num+1;	
				}
				else temp=0;
			}
			System.out.println(num+"->"+temp+",");
		}
	}

}
