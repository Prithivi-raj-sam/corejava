package com.chainsys.oops;

public class testDemoA {
	
//		AbsDemoA a1=new AbsDemoA();//abstract class
//		AbsDemoA.show();// static method
public static void test() {
	AbsDemoB b1 = new DemoBChild();// child class
		b1.echo();// parent.echo()
}

}
