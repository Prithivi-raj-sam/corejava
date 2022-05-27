package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Appointments;


public class AppointmentsDao {
	
	
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
	public static int insertAppointments(Appointments newapp) {
		String insertquery = "insert into Appointments(app_id,app_date,doc_id,patient_name,fees_collected,fees_category) values(?,?,?,?,?,?)";
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement(insertquery);
			pstmt.setInt(1, newapp.getApp_id());
			pstmt.setDate(2, utiltoSqlConvert(newapp.getApp_date()));
			pstmt.setInt(3, newapp.getDoc_id());
			pstmt.setString(4, newapp.getPatient_name());
			pstmt.setFloat(5, newapp.getFees_collected());
			pstmt.setString(6, newapp.getFees_category());
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
	public static Appointments getAppointmentsById(int id) {
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Appointments app=null;
		try {
			pstmt = mycon.prepareStatement("select app_id,app_date,doc_id,patient_name,fees_collected,fees_category from Appointments where app_id=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			app=new Appointments();
			if(rs.next()) {
				app.setApp_id(rs.getInt(1));
				app.setApp_date(sqltoUtilconvert(rs.getDate(2)));
				app.setDoc_id((rs.getInt(3)));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getFloat(5));
				app.setFees_category(rs.getString(6));
					
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
		return app;
	}
	public static List<Appointments> getAllAppointments() {
		List<Appointments>listOfAppointments =new ArrayList<Appointments>();
		Connection mycon = getconnection();
		Statement stmt = null;
		ResultSet rs = null;
		Appointments app;
		try {
			stmt = mycon.createStatement();
			rs = stmt.executeQuery("select app_id,app_date,doc_id,patient_name,fees_collected,fees_category from Appointments");
			while(rs.next()) {
				app=new Appointments();
				app.setApp_id(rs.getInt(1));
				app.setApp_date(sqltoUtilconvert(rs.getDate(2)));
				app.setDoc_id((rs.getInt(3)));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getFloat(5));
				app.setFees_category(rs.getString(6));
				listOfAppointments.add(app);
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
		return listOfAppointments;
	}
	public static int updateAppointments(Appointments newapp) {

		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement("update Appointments set app_date=?,doc_id=?,patient_name=?,fees_collected=?,fees_category=? where app_id=?");
			pstmt.setDate(1, utiltoSqlConvert(newapp.getApp_date()));
			pstmt.setInt(2, newapp.getDoc_id());
			pstmt.setString(3, newapp.getPatient_name());
			pstmt.setFloat(4, newapp.getFees_collected());
			String cat=category(newapp.getDoc_id(),newapp.getFees_collected());
			pstmt.setString(5, cat);
			pstmt.setInt(6, newapp.getApp_id());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	public static int deleteAppointments(int id) {
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement("delete appointments where app_id=?");
			pstmt.setInt(1, id);
			row = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	public static int updatePatientName(int id,String docname) {
        String updatequery = "update appointments set patient_name=? where app_id=?";
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
    }public static int updateCollectedFees(int id, float fees) {
        String updatequery = "update appointments set fees_collected=? where app_id=?";
        Connection con = null;
        int rows = 0;
        PreparedStatement ps = null;
        try {
            con = getconnection();
            ps = con.prepareStatement(updatequery);
            ps.setDouble(1, fees );
            String cat=category(id,fees);
            ps.setString(2,cat);
            ps.setInt(3, id);
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

	public static String category(int doc_id, float collected_fees) {
    	
    	Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String category=null;
		try {
			pstmt = mycon.prepareStatement("select Standard_fees from doctors where doc_id=?");
			pstmt.setInt(1, doc_id);
			rs=pstmt.executeQuery();
			if(rs.getInt(1)==collected_fees )
				category="Standard fees";
			else if(rs.getInt(1)<collected_fees )
				category="extra fees";
			else if(rs.getInt(1)>collected_fees )
				category="low fees";
			else category="wrong input";
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
		return category;
    }
     
}
