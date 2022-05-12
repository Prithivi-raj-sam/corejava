package com.chainsys.oops;

public interface Interface_AddSubtract {
	default void print() {
    	System.out.println("welcome to interface consept!");
    }
	static int add(int v1, int v2) {
	  return v1+v2;	
	}
    static int subtract(int v1,int v2) {
		return v1-v2;
	}
    

}
