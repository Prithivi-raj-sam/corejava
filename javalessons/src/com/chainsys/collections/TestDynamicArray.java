package com.chainsys.collections;

public class TestDynamicArray {
	public static void main(String[] args) {
		DynamicArray dArray=new  DynamicArray();
		System.out.println( dArray.capacity);
		dArray.add("prithivi");
		dArray.add("raj");
		dArray.add("sam ");
		dArray.add(0, "s");
//		dArray.remove("prithivi");
		
		System.out.println(dArray.search("raj"));
		System.out.println(dArray);
		System.out.println( dArray.capacity);
	}
	

}
