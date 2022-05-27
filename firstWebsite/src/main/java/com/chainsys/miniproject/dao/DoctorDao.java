package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Doctor;




public class DoctorDao {
	private static Connection getconnection() {
		Connection con = null;
		String drivername="oracle.jdbc.OracleDriver";
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="Sampri3535";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(dburl,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static java.sql.Date utiltoSqlConvert(java.util.Date date){
		return new java.sql.Date(date.getTime());
	}
	public static java.util.Date sqltoUtilconvert(java.sql.Date date){
		return new java.util.Date(date.getTime());
	}
	public static int insertDoctor(Doctor newdoc) {
		String insertquery = "insert into doctors(Doc_id,Doc_name,Dob,Speciality,Doc_city,Phone,Standard_fees) values(?,?,?,?,?,?,?)";
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		Doctor doc=new Doctor();
		int row = 0;
		try {
			pstmt = mycon.prepareStatement(insertquery);
			pstmt.setInt(1, newdoc.getDoc_id());
			pstmt.setString(2, newdoc.getDoc_name());
			pstmt.setDate(3, utiltoSqlConvert(newdoc.getDob()));
			pstmt.setString(4, newdoc.getSpeciality());
			pstmt.setString(5, newdoc.getDoc_city());
			pstmt.setLong(6, newdoc.getPhone());
			pstmt.setFloat(7, newdoc.getStandard_fees());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	public static Doctor getDoctorById(int id) {
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Doctor doc=null;
		try {
			pstmt = mycon.prepareStatement("select Doc_id,Doc_name,Dob,Speciality,Doc_city,Phone,Standard_fees from doctors where doc_id=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			doc=new Doctor();
			if(rs.next()) {
				doc.setDoc_id(rs.getInt(1));
				doc.setDoc_name(rs.getString(2));
				doc.setDob(sqltoUtilconvert(rs.getDate(3)));
				doc.setSpeciality(rs.getString(4));
				doc.setDoc_city(rs.getString(5));
				doc.setPhone(rs.getLong(6));
				doc.setStandard_fees(rs.getFloat(7));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;
	}
	public static List<Doctor> getAllDoctors() {
		List<Doctor>listOfDoctors =new ArrayList<Doctor>();
		Connection mycon = getconnection();
		Statement stmt = null;
		ResultSet rs = null;
		Doctor doc;
		try {
			stmt = mycon.createStatement();
			rs = stmt.executeQuery("select Doc_id,Doc_name,Dob,Speciality,Doc_city,Phone,Standard_fees from doctors");
			
			while(rs.next()) {
				doc=new Doctor();
				doc.setDoc_id(rs.getInt(1));
				doc.setDoc_name(rs.getString(2));
				doc.setDob(sqltoUtilconvert(rs.getDate(3)));
				doc.setSpeciality(rs.getString(4));
				doc.setDoc_city(rs.getString(5));
				doc.setPhone(rs.getLong(6));
				doc.setStandard_fees(rs.getFloat(7));
				listOfDoctors.add(doc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfDoctors;
	}
	public static int updateDoctor(Doctor newdoc) {

		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement("update doctors set Doc_name=?,Dob=?,Speciality=?,Doc_city=?,Phone=?,Standard_fees=? where doc_id=?");
			pstmt.setString(1, newdoc.getDoc_name());
			pstmt.setDate(2, utiltoSqlConvert(newdoc.getDob()));
			pstmt.setString(3, newdoc.getSpeciality());
			pstmt.setString(4, newdoc.getDoc_city());
			pstmt.setLong(5, newdoc.getPhone());
			pstmt.setFloat(6, newdoc.getStandard_fees());
			pstmt.setInt(7, newdoc.getDoc_id());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	public static int deleteDoctor(int id) {
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement("delete doctors where doc_id=?");
			pstmt.setInt(1, id);
			row = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	public static int updateDoctorName(int id,String docname) {
        String updatequery = "update doctors set doc_name=? where doc_id=?";
        Connection con = null;
        int rows = 0;
        PreparedStatement ps = null;
        try {
            con = getconnection();
            ps = con.prepareStatement(updatequery);
            ps.setString(1, docname);
            ps.setInt(2, id);
            ps.executeUpdate();
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rows;
    }public static int updateStandardFees(int id, float fees) {
        String updatequery = "update doctors set Standard_fees=? where doc_id=?";
        Connection con = null;
        int rows = 0;
        PreparedStatement ps = null;
        try {
            con = getconnection();
            ps = con.prepareStatement(updatequery);
            ps.setDouble(1, fees );
            ps.setInt(2, id);
            ps.executeUpdate();
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rows;
    }


}
