package com.chainsys.collections;
import java.util.TreeSet;
import java.util.Iterator;
public class SetTreeDemo {
	public static void demoA() {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("cut");
		ts.add("Fun");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("Dog");
		ts.add("Aag");
		ts.add("AAg");
		ts.add("Event");
		ts.add("FAn");
		ts.add("Delhi");
//		ts.add(null);
	
		ts.add("Carrot");
		ts.add("Ball");
		ts.add("Apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("fool");
	    System.out.println("size "+ts.size());
	    Iterator<String> itr = ts.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
