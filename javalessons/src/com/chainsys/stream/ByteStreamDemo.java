package com.chainsys.stream;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
public class ByteStreamDemo {
	public static void main(String[] args) throws IOException  {
		String  s="99% is &approx equal to 100 but 50 this is &approx: not equal to 95";
		byte by[]=s.getBytes();
		ByteArrayInputStream Bin =new ByteArrayInputStream(by);
		ByteArrayOutputStream bout =new ByteArrayOutputStream();
		int c;
		int ref=0;
		bout.write(by);
		bout.write(32);         //it add space between 2 write statement
		bout.write(by,5,50);
		byte byte2[]=bout.toByteArray();
		for(int i=0;i<byte2.length;i++) {
			System.out.print((char)byte2[i]);
		}
		System.out.println();
		//we can also write into file by ByteArrayInputStream methods
        //That method is bout.write(OutputStream f);
		String outString= bout.toString();
		System.out.println("Content inside the ByteArrayOutpputStream:"+outString);
		boolean con=true;
		Bin.skip(5);
		while((c=Bin.read()) !=-1) {
			System.out.print((char)c);
			ref++;
			if(ref==30 && con==true) {
				Bin.reset();
				con=false;
			}
		}
		Bin.close();
		bout.close();
	}
}
