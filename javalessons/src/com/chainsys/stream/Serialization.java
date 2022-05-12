package com.chainsys.stream;
import com.chainsys.collections.Emp_Arraylist;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {

	public static void main(String arg[]) throws IOException // throws Exception
	{
		ArrayList<Emp_Arraylist>l=new ArrayList<Emp_Arraylist>();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		java.util.Scanner scanner = null;
//		BufferedOutputStream bos=new BufferedOutputStream(fos);
		try {
			fos = new FileOutputStream("d:\\ass\\link.dat");
			oos = new ObjectOutputStream(fos);
			scanner = new java.util.Scanner(System.in);
			System.out.println("Enter Emp ID");
			String sid = scanner.nextLine();
			Emp_Arraylist firstemp = new Emp_Arraylist(Integer.parseInt(sid));
			Emp_Arraylist secondemp = new Emp_Arraylist(145);
			l.add(firstemp);
			l.add(secondemp);
			oos.writeObject(l);
			oos.flush();
			System.out.println("Emp Object Saved " + firstemp.hashCode());
			System.out.println("Emp object saved "+ secondemp.hashCode());
		} catch (Exception e) {
			System.out.println("Exception during serialization: " + e);
		} finally {
			try {
				oos.close();
				scanner.close();
			} catch (Exception e) {
				System.out.println("Exception during oos.close: " + e);
			}
		}
	}
}
