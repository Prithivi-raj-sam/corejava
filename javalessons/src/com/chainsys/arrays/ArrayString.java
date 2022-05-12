package com.chainsys.arrays;

public class ArrayString {
	public static void main(String[] args) {
		ArrayString a=new ArrayString();
		a.summa();
//		a.strarray();
	}
	public void strarray() {
		// wrong method !
		System.out.println("Answer:");
		String input1="a4d7k9f3";
		String input=input1.toLowerCase();
		int n[]=new int [input.length()];
		char c[] =new char[input.length()/2];
		char inputtemp[]=input.toCharArray();
		int count=0;
		int a=0;
		int b=0;
		int ref=0;
		for(int i=0;i<inputtemp.length;i++) {
			
			int asc=(int)inputtemp[i];
			
			if(asc<123 && asc>96) {
				
				c[a++]=inputtemp[i];
				count =0;
			}
			else if(asc>47 && asc<58){
				
				if(count==0) {
				 ref=asc-48;
				}
				else {
					ref=ref*10+(asc-48);
				}
				while(ref>0) {
					System.out.println(c[a]);
					ref--;
				}
				
			}
			
		}
	}
	public void summa() {
		String input="a4d17k19";
		String number= "";
		char alpha=' ';
		
		for(int i=0;i<input.length();) {
			int num;
			if (Character.isLetter(input.charAt(i))) {
				alpha=input.charAt(i);
				i++;
				try {
					while(Character.isDigit(input.charAt(i))) {
						number=number + input.charAt(i);
						System.out.println(number);
						i++;
					}
				}catch(StringIndexOutOfBoundsException sr) {
//						System.out.println(sr.getMessage());
						
				}
			}
			num=Integer.parseInt(number);
			while(num>0) {
				System.out.print(alpha);
				num--;
			}
			System.out.println();
			number="";
		}
	}
		
}


