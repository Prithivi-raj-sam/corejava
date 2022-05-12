package com.chainsys.jdbcBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCsample {
	public static void main(String[] args) {
		
		try { System.out.println("som");
			   Connection myCon  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sampri3535"); 
			   Statement mystat = myCon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			   Statement mystat = myCon.createStatement(1004,1008);
			   ResultSet myRs  = mystat.executeQuery("select * from FileTable order by id");
			   
//			   ResultSet myRs1= mystat.executeQuery("drop table FileTable2");
//			   System.out.println(myRs1.toString());
			   while(myRs.next()) {
				   System.out.println(myRs.getInt(1)+"\t"+myRs.getString(2)+"\t"+myRs.getDouble(3)+"\t"+myRs.getDouble(4));
			   }
			   System.out.println("-----------------------------------------------");
//			   myRs.first();
//			   myRs.last();
//			   myRs.absolute(0);
			   while(myRs.previous()) {
				   System.out.println(myRs.getInt(1)+"\t"+myRs.getString(2)+"\t"+myRs.getDouble(3)+"\t"+myRs.getDouble(4));
			   }
			   
			   myCon.close();
//			   myRs1.close();
		   }catch(Exception err) {
			   err.printStackTrace();
		   }
		
	}
	
}
