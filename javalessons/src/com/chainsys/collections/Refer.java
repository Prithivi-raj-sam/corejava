package com.chainsys.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Refer {
	public static void main(String[] args) {
		LinkedList<Sample> samplearray= new LinkedList<Sample> ();
        int condition = 0;
		//		System.out.println(samplearray.capacity());
        Scanner sc=new Scanner(System.in);
        try {	
            while (condition==0){
            
	    	System.out.println("enter the name:");
	    	String name=sc.nextLine();
	    	System.out.println("enter the id:");
	    	int id=sc.nextInt();
	    	System.out.println("enter the accono:");
	    	long accono =sc.nextLong();
	    	System.out.println("Do you want add more acoount details\n0 to add more \n1 to quite this process:");
	    	condition=sc.nextInt();
	    	String prop=sc.nextLine();
	    	Sample s1=new Sample(id,name,accono);
//	    	System.out.println(id+name+accono);
	    	samplearray.add(s1);
	    }
	   }catch(Exception err) {
		   System.out.println("Error:"+err.getMessage());
		  
	   }finally {
		   sc.close();
	   }
        Sample s2=new Sample(12,"pri",454);
        samplearray.addFirst(s2);
        Sample s3=new Sample(1,"sam",7643);
        samplearray.addLast(s3);
        Iterator<Sample> itr =samplearray.iterator();
        while(itr.hasNext()) {
        	Object obj=itr.next();
        	Sample s1=(Sample)obj;
        	System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAccono());
        }

   }
}