package com.chainsys.jdbcBasic;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jpj_File {
	 public static void main(String[] args) {  
	        try{  
	        Class.forName("oracle.jdbc.driver.OracleDriver");  
	        Connection con=DriverManager.getConnection(  
	        "jdbc:oracle:thin:@localhost:1521:xe","system","Sampri3535");  
	              
	        PreparedStatement ps=con.prepareStatement("select * from image");  
	        ResultSet rs=ps.executeQuery();  
	        if(rs.next()){//now on 1st row  
	                      
	        Blob b=rs.getBlob(2);//2 means 2nd column data  
	        
	        byte barr[]=b.getBytes(1,(int)b.length());//1 means first image 
//	        System.out.println(b.position(b, 1));
//	        System.out.println("connection is "+con.createBlob());
            System.out.println("next:");
	  
	        System.out.println("length: "+barr.length);
	                      
	        FileOutputStream fout=new FileOutputStream("d:\\ass\\new.jpg");  
	        fout.write(barr);  
	                      
	        fout.close();  
	        }//end of if
	        System.out.println("ok");  
	                      
	        con.close();  
	        }catch (Exception e) {e.printStackTrace();  }  
	        }  

}
