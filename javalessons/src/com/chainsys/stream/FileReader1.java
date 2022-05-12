package com.chainsys.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) {
		int charfromfile;
		FileInputStream fin = null;
		String fname = "d:\\ass\\sam\\testFile.txt";
		try {
			fin = new FileInputStream(fname);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
			try {
				System.out.println("IsData Available" + fin.available());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		try {
			do {
				charfromfile = fin.read();
				if (charfromfile != -1) {
					System.out.print((char) charfromfile);
				}
			} while (charfromfile != -1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(null!=fin) fin.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
