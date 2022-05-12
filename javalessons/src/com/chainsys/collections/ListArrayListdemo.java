package com.chainsys.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ListArrayListdemo {
	public static void main(String[] args) {
		ArrayList< Emp_Arraylist> empArrayList = new ArrayList< Emp_Arraylist>(30);
		System.out.println("InitialEMPArrayList size of empArray: "+empArrayList.size());
		try {
			for (int i=0;i<5;i++) {
				Emp_Arraylist e1=new  Emp_Arraylist(i);
				e1.name ="Emp"+i;
				empArrayList.add(e1);
				System.out.println(e1.name);
				System.out.println(e1.getID());
			}
//			System.out.println();
//			for(Iterator itr =empArrayList.iterator();iterator.hasNext())
//			System.out.println(empArrayList);
			System.out.println("size of empArrayList after addition:"+empArrayList.size());
			
			 Emp_Arraylist e3= (Emp_Arraylist)empArrayList.get(4);
			 empArrayList.add(e3);
			 System.out.println("size of empArray after addition:"+empArrayList.size());
			 
			 empArrayList.add(new Emp_Arraylist(4));
//			 System.out.println(empArrayList);
			 
			 System.out.println("freq of Emp_Arraylist id-4 in arrayList"+ Collections.frequency(empArrayList, e3));
			 Iterator<Emp_Arraylist> empIterator=empArrayList.iterator();
			 while (empIterator.hasNext()) {
				 Object element = empIterator.next();//return current object
				 Emp_Arraylist e1=(Emp_Arraylist) element;
				 System.out.println("\t"+e1.getID()+" "+e1.name);
			 }
		}catch(Exception err) {
			System.out.println("Error!:"+err.getMessage());
		}
		
	}

}
