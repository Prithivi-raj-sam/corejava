package com.chainsys.collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListdemo {
	public static void main(String args[]) {
		LinkedList<String> stringLinkedList = new LinkedList();
		stringLinkedList.add("F");
		stringLinkedList.add("B");
		stringLinkedList.add("D");
		stringLinkedList.add("E");
		stringLinkedList.add("C");
		stringLinkedList.add("F");
		stringLinkedList.add("B");
		stringLinkedList.add("D");
		stringLinkedList.add("E");
		stringLinkedList.add("C");
//		stringLinkedList.addLast("Z");
//		stringLinkedList.addFirst("A");
//		stringLinkedList.add(1,"A2");
		stringLinkedList.add(5,"A2");
		Iterator<String> String_itr= stringLinkedList.iterator();
		 while (String_itr.hasNext()) {
			 System.out.print(String_itr.next()+" ");
		 }
		 System.out.println();
		 stringLinkedList.remove("F");
		 stringLinkedList.remove(2);
		 String_itr= stringLinkedList.iterator();
		 while (String_itr.hasNext()) {
			 System.out.print(String_itr.next()+" ");
		 }
		 System.out.println();
		 stringLinkedList.removeFirst();
		 stringLinkedList.removeLast();
		 String_itr= stringLinkedList.iterator();
		 while (String_itr.hasNext()) {
			 System.out.print(String_itr.next()+" ");
		 }
		
	}

}
