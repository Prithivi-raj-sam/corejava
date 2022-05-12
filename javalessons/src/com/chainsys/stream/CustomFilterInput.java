package com.chainsys.stream;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomFilterInput extends FilterInputStream {

	protected CustomFilterInput(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	public int read() throws IOException {
		int temp = super.read();
		int tempref = 0;
		if(temp!=-1) {
			if (temp > 64 && temp < 91 || temp == 32) {
				tempref = temp;
			}
		}else {
			tempref=-1;	
			}
		return tempref;
	}
}
