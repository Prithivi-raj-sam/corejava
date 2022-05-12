package com.chainsys.oops;

public class Phone {
	public void makeACall() {
		System.out.println("call made...");
	}
	public final void sendSMS() {
		System.out.println("SMS send..."); // can be inherited but can not be override
	}
}
class Nokia extends Phone{
	public void makeACall() {
		System.out.println("Call mad from Nokia...");
	}
//	public void sendSMS() {
//		System.out.println("SMS send from Nokia...");
//	}
}