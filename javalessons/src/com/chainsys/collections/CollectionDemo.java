package com.chainsys.collections;
import java.util.ArrayList;
public class CollectionDemo {
	public static void usingStringArraylist() {
		ArrayList<String> stringArrayList =new ArrayList<String>();
		System.out.println("intitial size of string array list:"+ stringArrayList.size());
		try {
			stringArrayList.add("car");
			stringArrayList.add("auto");
			stringArrayList.add("egg");
			stringArrayList.add("box");
			stringArrayList.add("doll");
			stringArrayList.add("fan");
			
			//will insert a new value
			//pushing the current value of index 1 to the next index
			stringArrayList.add(1,"Animal");
			stringArrayList.add("girl");
			stringArrayList.add("fan");
			System.out.println("size of stringArrayList after addition:"+stringArrayList.size());
			System.out.println("contents of stringArrayList:"+ stringArrayList);
			// will replace the value in index
			stringArrayList.set(2, "xenas");
			
			System.out.println("After set (2):"+stringArrayList);
			System.out.println("last index of : 'fan'"+stringArrayList.lastIndexOf("fan"));
			//remove the first index of 'fan'
			stringArrayList.remove("fan");
			stringArrayList.remove(2);
			System.out.println("size of remove(2):"+stringArrayList.size());
			System.out.println("contents of Arraylist:"+stringArrayList);
    		}catch(Exception err) {
    			System.out.println(err.getMessage());
    		}
		
	}

} 
