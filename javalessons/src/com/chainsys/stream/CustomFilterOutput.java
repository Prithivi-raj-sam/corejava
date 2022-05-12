package com.chainsys.stream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CustomFilterOutput extends FilterOutputStream {
	// during extends we should create constructor for FilterOutputStream.
	public CustomFilterOutput(OutputStream out) {
		super(out);
	}

	// To achieve Filter Output Stream,
	// we should inherit that class and override the methods
	// that what we want to filter!
	public void write(String s) throws IOException {
		if (!s.contentEquals(s.toLowerCase())) {
			byte b[] = s.getBytes();
			super.write(b);
		}

	}

//	public void write(int b) throws IOException {
//		 out.write(b);
//    }
	public void write(byte b[]) throws IOException {
		for (int i = 0; i < b.length; i++) {
			if (b[i] < 91 && b[i] > 64||b[i]==32) {
				super.write(b[i]);
			}
		}

	}
//	 public void write(byte b[], int off, int len) throws IOException {
//	        if ((off | len | (b.length - (len + off)) | (off + len)) < 0)
//	            throw new IndexOutOfBoundsException();
//
//	        for (int i = 0 ; i < len ; i++) {
//	            write(b[off + i]);
//	        }
//	 }
//	The above methods can override and also we can create own overload method.

}
