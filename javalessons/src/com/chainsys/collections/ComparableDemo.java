package com.chainsys.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ComparableDemo {
	public static void main(String[] args) {
		sortComparableEmp();
	}
	public static void sortComparableEmp() {
		EmpComparable e1 =new EmpComparable(100);
		e1.Name = "sam;";
		EmpComparable e2 =new EmpComparable(200);
		e2.Name = "sam;";
		EmpComparable e3 =new EmpComparable(300);
		e3.Name = "sam;";
		List<EmpComparable> empList = new ArrayList<>();
		empList.add(e2);
		empList.add(e3);
		empList.add(e1);
		Iterator<EmpComparable> emp_iterator =empList.iterator();
        while(emp_iterator.hasNext()) {
        	System.out.println(emp_iterator.next().getID());
        }
		
	}

}
