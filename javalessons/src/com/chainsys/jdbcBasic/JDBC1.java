package com.chainsys.jdbcBasic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBC1 {
	public static void main(String[] args) {
		JDBC1 j = new JDBC1();
//		j.insert();
//		j.update();
//		j.metadata();
//		j.databasemetadat();
//		j.toatalTable();
//		j.totalView();
//		j.retreive();
//		j.storedProcedure();
//		j.funcSQL();
//		j.transactionANDbatch();
//		j.batchSimple();
		j.rowsetExample();
	}

	public void insert() {
		Connection myCon = getConnection();
		try {
			PreparedStatement ps = myCon.prepareStatement("insert into FileTable values(?,?,?,?)");
			File f = new File("d:\\ass\\record.txt");
			FileReader fr = new FileReader(f);
//	          ps.setString(1, "FileTable");
			ps.setInt(1, 103);
//	          ps.setCharacterStream(2, fr,(int)f.length());
			ps.setString(2, "prithivi2");
			ps.setInt(3, 98);
			ps.setDouble(4, 90.24);
			int i = ps.executeUpdate();
			System.out.println(i + " " + "record inserted");
			close(myCon);
			fr.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}

	public void update() {
		Connection myCon = getConnection();
		System.out.println("enter the password:");
		try {
			PreparedStatement ps = myCon.prepareStatement("{update FileTable set id=? where name=?}");
			ps.setString(2, "prithivi1");
//        ps.setDouble(2, 95.8);
			ps.setInt(1, 102);
			int i = ps.executeUpdate();
			System.out.println(i + " record updated");
			myCon.commit();
			ps.close();
			myCon.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		close(myCon);

	}

	public void delete() {

	}

	private Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Connection myCon = null;
		try {
			 myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Sampri3535");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myCon;
	}

	public void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void metadata() {
		Connection myCon;
		try {
			myCon = getConnection();
			Statement mystat = myCon.createStatement();
			ResultSet myRs = mystat.executeQuery("select * from FileTable order by id");
			ResultSetMetaData rsmd = myRs.getMetaData();
			int countcolumn = rsmd.getColumnCount();
			System.out.println("count of column:" + countcolumn);
			for (int i = 1; i <= countcolumn; i++) {
				System.out.println(
						"Column name:" + rsmd.getColumnName(i) + "\t" + "column type:" + rsmd.getColumnTypeName(i));
			}
			myRs.close();
			mystat.close();
			myCon.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void databasemetadat() {
		Connection myCon;
		try {
			myCon = getConnection();
			Statement mystat = myCon.createStatement();
			DatabaseMetaData dbmd = myCon.getMetaData();
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
			mystat.close();
			myCon.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void toatalTable() {
		Connection myCon;
		try {
			System.out.println("something:");
			myCon = getConnection();
			DatabaseMetaData dbmd = myCon.getMetaData();
			String[] table = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);
//			original method is below:
//			ResultSet getTables(String catalog, String schemaPattern,
//                    String tableNamePattern, String types[]) throws SQLException;

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void totalView() {
		Connection myCon;
		try {
			myCon = getConnection();
			Statement mystat = myCon.createStatement();
			DatabaseMetaData dbmd = myCon.getMetaData();
			String table[] = { "VIEW" };
			ResultSet rs = dbmd.getTables(null, null, null, table);

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
			myCon.close();
			mystat.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void retreive() {
		Connection myCon;
		try {
			System.out.println("something:");
			myCon = getConnection();

			PreparedStatement ps = myCon.prepareStatement("select * from fileretreive");
			ResultSet rs = ps.executeQuery();

			rs.next();// now on 1st row

			Clob c = rs.getClob(2);
			Reader r = c.getCharacterStream();

			FileWriter fw = new FileWriter("d:\\ass\\record.txt");

			int i;
			while ((i = r.read()) != -1)
				fw.write((char) i);

			fw.close();
			myCon.close();
			System.out.println("success");
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void storedProcedure() {
		Connection myCon;
		try {
			System.out.println("something:");
			myCon = getConnection();
			CallableStatement stmt = myCon.prepareCall("{call insertR(?,?,?,?)}");
			stmt.setInt(1, 98);
			stmt.setString(2, "sabari");
			stmt.setInt(3, 83);
			stmt.setInt(4, 80);
			stmt.execute();
			stmt.close();
			myCon.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void funcSQL() {
		Connection myCon;
		try {
			System.out.println("something:");
			myCon = getConnection();
			CallableStatement stmt = myCon.prepareCall("{?=call sum4(?,?)}");
			stmt.setInt(2, 100);
			stmt.setInt(3, 200);
			stmt.registerOutParameter(1, Types.INTEGER);
			stmt.execute();
			System.out.println("ans:" + stmt.getInt(1));
			stmt.close();
			myCon.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void transactionANDbatch() {
		Connection myCon;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.Scanner strSc = new java.util.Scanner(System.in);
		try {
//			System.out.println("something:");
			myCon = getConnection();

			myCon.setAutoCommit(false);
			PreparedStatement mystat = myCon.prepareStatement("insert into FileTable values(?,?,?,?)");

			while (true) {
				System.out.println("enter id:");
				int id = sc.nextInt();
				System.out.println("enter name:");
				String name = strSc.nextLine();
				System.out.println("enter mark:");
				int mark = sc.nextInt();
				System.out.println("enter percent:");
				double percent = sc.nextDouble();

				mystat.setInt(1, id);
				mystat.setString(2, name);
				mystat.setInt(3, mark);
				mystat.setDouble(4, percent);

				mystat.addBatch();
				System.out.println("if you want add more rows press y \n else press any key:");
				String cond = sc.next();
				String ref = "y";
				if (ref.equals(cond)) {

				} else {

					break;
				}

			}
			mystat.executeBatch();
			System.out.println("if you want to commit press c!");
			String s1 = strSc.next();
			System.out.println("if you want to rollback press r!");
			String s2 = strSc.next();
			if (s1.equals("c")) {
				myCon.commit();
			} else if (s2.equals("r")) {
				myCon.rollback();
			} else {
				System.out.println("enter valuable input");
			}
			System.out.println("record sucess fully added!");

			myCon.close();
			mystat.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			strSc.close();
			sc.close();
		}
	}

	public void batchSimple() {
		Connection myCon;
		try {
			System.out.println("something:");
			myCon = getConnection();
			myCon.setAutoCommit(false);
			Statement stmt = myCon.createStatement();
			stmt.addBatch("insert into FileTable values(32,'sundar lal',54,87.65)");
			stmt.addBatch("delete Filetable where id=99");
			stmt.executeBatch();
			myCon.commit();

			stmt.close();
			myCon.close();
			System.out.println("Successfully executed");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void rowsetExample() {
		try {
			System.out.println("something");
			JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
			rowset.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rowset.setUsername("system");
			rowset.setPassword("Sampri3535");

			rowset.setCommand("select * from FileTable");
			rowset.execute();

			rowset.addRowSetListener(new Mylistener());
			while (rowset.next()) {
				System.out.println("name :" + rowset.getString("name"));
				System.out.println("mark :" + rowset.getInt("mark"));
			}
			rowset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
