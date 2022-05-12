package com.chainsys.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		// Initial capacity is 3 increment it by double.
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Initial size : " + v.size());
		System.out.println("Initial capacity :" + v.capacity());
		v.add(1);          // new Integer (1)
		v.add(2);
		v.addElement(3);
		v.add(1,4);
		System.out.println("capacity :" + v.capacity());
		v.addElement(null);
		v.addElement(6);
		System.out.println("capacity :" + v.capacity());
		System.out.println("First element: " + (Integer) v.firstElement());
		System.out.println("Last element: " + (Integer) v.lastElement());
		if (v.contains(3))
			System.out.println("Vector contains 3.");
		Enumeration <Integer> vEnum =v.elements();
		System.out.println("\n Elements in Vector:");
		while(vEnum.hasMoreElements()) {
			System.out.println(vEnum.nextElement()+" ");
		}
		Iterator<Integer> iterator2 =v.iterator();
        while(iterator2.hasNext()) {
        	System.out.print("\t"+iterator2.next());
        }
	}

}
