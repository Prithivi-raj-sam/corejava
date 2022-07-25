package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSetDemo {
	public static void main(String args[]) {
		demoA();
	}
	public static void demoA() {
		HashSet<String> String_hs = new HashSet<String>();
		String_hs.add("Bee");
		String_hs.add("Apple");
		String_hs.add("Doll");
		String_hs.add(null);
		String_hs.add("egg");
		String_hs.add("Cinema");
		String_hs.add("fan");
		System.out.println("size "+String_hs.size());
		String_hs.add("Fan");
		String_hs.add(null);
		System.out.println("size "+String_hs.size());
		Iterator<String> String_itr1= String_hs.iterator();
		while (String_itr1.hasNext()) {
			 System.out.print(String_itr1.next()+" ");
		 }
	}
	public static void demoB()
    {
        HashSet< Emp_Arraylist> hs=new HashSet< Emp_Arraylist>();
        Emp_Arraylist e1=null;
        for(int i=0; i<10;i++)
        {
            e1=new  Emp_Arraylist(i);
            e1.name="Emp "+i;
            hs.add(e1);
        }
        System.out.println("Count "+hs.size());
        hs.add(e1);
        System.out.println("Count "+hs.size());
        
        Iterator< Emp_Arraylist> itr=hs.iterator();
        while(itr.hasNext())
        {
        	 Emp_Arraylist e2= itr.next();
        	 System.out.println(e2.getID()+ " "+e2.name);
        }
	
    }
}
