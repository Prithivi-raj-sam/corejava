package com.chainsys.collections;

public class DynamicArray {
	int size=0;
	int capacity =10;
	Object[]array=null;
	public DynamicArray () {
		this.array=new Object[capacity];
	}
	public  DynamicArray(int capacity) {
		this.capacity=capacity;
		this.array=new Object[capacity];
	}
	public void add(Object data) {
		if(size>=capacity) {
			grow();
		}
		array[size]=data;
		size++;
		
	}
	public void add(int index,Object data) {
		if(size>=capacity) {
			grow();
		}
		for(int i=size;i>index;i--) {
			array[i]=array[i-1];
		}
		array[index]=data;
		size++;
		
	}
	public void remove(Object data) {
		for(int i=0;i<size;i++) {
			if(array[i]==data) {
				for(int j=0;j<size-i-1;i++) {
					array[i+j]=array[i+j+1];
				}
				array[size-1]=null;
				size--;
				if (size<=(int) (capacity/3)){
					Shrink();
				}
				break;
			}
		}
		
	}
	public int search(Object data) {
		for(int i=0;i<size;i++) {
			if(array[i]==data) {
				return i;
			}
		}
		return -1;
	}
	private void grow() {
		int newcapacity=(int)capacity*2;
		Object[] newArray=new Object[newcapacity];
		for(int i=0;i<size;i++) {
			newArray[i]=array[i];
		}
		capacity=newcapacity;
		array=newArray;
	}
	private void Shrink() {
		int newcapacity=(int)capacity/2;
		Object[] newArray=new Object[newcapacity];
		for(int i=0;i<size;i++) {
			newArray[i]=array[i];
		}
		capacity=newcapacity;
		array=newArray;
		
	}
	public boolean isEmpty() {
		return size==0;
	}
	public String toString() {
		String string ="";

		for(int i=0;i<size;i++) {
			string+=array[i]+",";
		}
		if(string!="") {
			string="["+string.substring(0,string.length()-2)+"]";
		}
		else {
			string="[]";
		}
		return string;
	}
	

}