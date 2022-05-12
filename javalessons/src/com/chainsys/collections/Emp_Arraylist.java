package com.chainsys.collections;
import java.io. Serializable;
public class Emp_Arraylist implements  Serializable{
	private final int id;
	public String name;
    private static final long serialVersionUID=0;
	public Emp_Arraylist(int v1) {
		id = v1;
	}

	public int getID() {
		return id;
	}
      //override equals
	public boolean equals(Object obj) {
		Class c1 = obj.getClass();
		boolean flag = false;
		if (c1 == this.getClass()) {
			Emp_Arraylist other = (Emp_Arraylist) obj;
			if (this.hashCode() == other.hashCode()) {
				flag = true;
			}
		}
		return flag;
	}

}
