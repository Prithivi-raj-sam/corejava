package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayListToArray {
	public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Contents of al: "+al);
        Object data[]=al.toArray();
        int sum=0;
        for(int i=0; i<data.length; i++)
        {
            sum+=((Integer) data[i]).intValue();
            System.out.println("Sum is: "+sum);
        }
    }

}
