package com.chainsys.entrypoint;

public class Person extends Branch{
	private String 	name;
	private  int id;
	private String address;
	private long phone_number;
	private String e_mail_address;
	public Person(int branch_id,int id)
	{
		super(branch_id);
		this.id =id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getE_mail_address() {
		return e_mail_address;
	}
	public void setE_mail_address(String e_mail_address) {
		this.e_mail_address = e_mail_address;
	}
	public int getId() {
		return id;
	}

}
