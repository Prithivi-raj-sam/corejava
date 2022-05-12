package com.chainsys.collections;

public class Sample {
	private  String name ;
	private final int id ;
	private long accono;
    
	public Sample(int id,String name,long accono) {
		this.id=id;
		this.name=name;
		this.accono=accono;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public long getAccono() {
		return accono;
	}
}
