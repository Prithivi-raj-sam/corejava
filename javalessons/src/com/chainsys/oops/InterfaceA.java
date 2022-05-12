package com.chainsys.oops;

	public interface InterfaceA {
		abstract void  m1();
		void m2();
		void print();
		default void print(String type)
		{
			System.out.println("working");
		}
		public void echo();
//		{
//			System.out.println("Static Echo");
//		}
	}

