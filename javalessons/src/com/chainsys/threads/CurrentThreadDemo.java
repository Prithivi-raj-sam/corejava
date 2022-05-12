package com.chainsys.threads;

public class CurrentThreadDemo {
	public static void main(String[] args) {
		
		Thread t1 =new Thread(){
			public void run() {
		try {
			Thread t1=Thread.currentThread();
			System.out.println("mainThread Id:"+t1.getId());
			Worker w= new Worker();
			w.callme();
			System.out.println("in main after callme");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			}
		};
		Thread t2 =new Thread() {
			public void run() {
				Thread t1=new Thread();
				System.out.println("Thread id:"+t1.getId());
		for(int i=0;i<10;i++) {
			
			System.out.println("my program out:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			}
		};
		t1.start();
		t2.start();
		
		
	}

}
