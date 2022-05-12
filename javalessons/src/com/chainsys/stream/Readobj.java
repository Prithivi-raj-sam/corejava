package com.chainsys.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import com.chainsys.collections.Emp_Arraylist;

	public class Readobj
	{
	    public static void main(String arg[])throws Exception
	    {
	    	ArrayList<Object> l =new ArrayList<Object>();
//	    	private static final long serialVersionUID=0;
	         FileInputStream fis = 
	                 new FileInputStream("d:\\ass\\link.dat") ;
	         ObjectInputStream ois = new ObjectInputStream(fis) ;
	          Emp_Arraylist ob =null;
	         try
	        {
	            l.add(ois.readObject());
	        }
	        catch(Exception e)
	        {
	            System.out.println("Exception during deserialization: " +e);
	        }
	        finally
	        {
	            try
	            {
	                ois.close();
	            }
	            catch(Exception e)
	            {
	                System.out.println("Exception during ois close: " + e);
	            }
	        }
	        Iterator<Object> itr =l.iterator();
	        while(itr.hasNext()) {
//	        	Emp_Arraylist e=(Emp_Arraylist) itr.next();
	        	System.out.println("id:"+itr.next());
	        }
	    }
	}


