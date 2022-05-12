package com.chainsys.entrypoint;

public class CustomerDetails {
//	private final int customer_id ;
	private final int account_number; 
	private String account_type; // can also be an enum - study enum 
	private float current_balance;

	public CustomerDetails( int accno)
	{
		
//    	this.customer_id=cid;
		this.account_number=accno;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public float getCurrent_balance() {
		return current_balance;
	}
	public void setCurrent_balance(float current_balance) {
		this.current_balance = current_balance;
	}
	public int getAccount_number() {
		return account_number;
	}

}
