package com.chainsys.exception;

public class DemoTrace {
	public static void m1() {
		try {
			m2();
			
		}catch(Exception err){
			System.out.println("getMessage"+err.getMessage());
			err.printStackTrace();
//			Throwable t1 =err.getCause();
//			if (null!=t1) {;
//				Class c1=t1.getClass();
//				System.out.println("cause"+c1.getName());
//			}else {
//				System.out.println("Cause is null");
//			}
		}finally {
			System.out.println("inside m1 finally");
		}
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		m4();
	}
	public static void m4() {
		int x=0;
		int y=0;
		int z=0;
		x=100;
		z=x/y;
		System.out.println("result"+z);
	}
	public void m9() {
		int a=324;
		int b=0;
		int c=a/b;
		System.out.println("");
	}
         
}

