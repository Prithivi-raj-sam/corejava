package com.chainsys.jdbcBasic;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Store_image {
	 public static void main(String args[]) {
	      try {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sampri3535");
	      System.out.println("Connection is "+con);
	      PreparedStatement ps =con.prepareStatement("insert into image values(?,?)");
	      ps.setInt(1, 1);
	      FileInputStream fin= new FileInputStream("d:ass\\sam\\prithiv.jpg");
	      ps.setBinaryStream(2, fin,fin.available());
	      int i=ps.executeUpdate();
	      System.out.println(i+"Rows inserted");
	      }catch(Exception e) {
	          e.printStackTrace();
	      }
	      
	  }
      //synchronized methods
	 // multiThread 
	 //all methods of connection,resultSet .....
	 // add and retrieve meta data into SQL
	 //
}
