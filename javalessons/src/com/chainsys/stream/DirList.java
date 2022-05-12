package com.chainsys.stream;

import java.io.File;

public class DirList {
	public static void main(String[] args) {
		String dirname="d:/ass";
		File file= new File(dirname);
		String listoffilesNamesInDerectory []=null;
		if(file.isDirectory()) {
			System.out.println(dirname+"is a directory");
			listoffilesNamesInDerectory=file.list();
			for(int i=0;i<listoffilesNamesInDerectory.length;i++) {
				File f= new File (dirname+"/"+listoffilesNamesInDerectory[i]);
				if(f.isDirectory()) {
					System.out.println("\t"+f.getName()+">is a sub dierectory");
				}else {
					System.out.println("\t<"+f.getName()+">is a file");
				}
			}
		}
	}

}
