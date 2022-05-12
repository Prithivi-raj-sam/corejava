package com.chainsys.entrypoint;

public class Branch{
	private final int branch_id ;
	private String location;
//	private int managerId;
	private final static String bank_name="ABC Bank";
	public Branch(int branchID)
	{
		this.branch_id=branchID;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
//	public int getManagerId() {
//		return managerId;
//	}
//	public void setManagerId(int managerId) {
//		this.managerId = managerId;
//	}
	public int getbranchID() {
		return branch_id;
	}
	public static String getBankName() {
		return bank_name;
	}
	

}
