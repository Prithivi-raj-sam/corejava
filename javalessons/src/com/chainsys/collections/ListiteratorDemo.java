package com.chainsys.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ListiteratorDemo {
	public static void main (String [] args) {
		ArrayList<String> stringArrayList=new ArrayList<String>();
		String s1="B";
		stringArrayList.add("c");
		stringArrayList.add(s1);
		stringArrayList.add("A");
		stringArrayList.add("E");
		stringArrayList.add(s1);
		stringArrayList.add("D");
		stringArrayList.add("F");
		stringArrayList.add(s1);
		Iterator<String> String_itr= stringArrayList.iterator();
		 while (String_itr.hasNext()) {
			 System.out.println(String_itr.next()+" ");
		 }
		 System.out.println();
		 ListIterator<String> String_List_itr= stringArrayList.listIterator();
		 while (String_List_itr.hasNext()) {
			 String element =String_List_itr.next();
			 System.out.println(element+" ");
		 }
		 System.out.println();
		 Iterator<String> String_itr1= stringArrayList.iterator();
		 while (String_itr1.hasNext()) {
			 String element =String_itr1.next();
			 System.out.println(element+" ");
		 }
		
		 System.out.println();
		 
		 while (String_List_itr.hasPrevious()) {
			 String element =String_List_itr.previous();
			 System.out.println(element+" ");
		 }
	}
	

}
