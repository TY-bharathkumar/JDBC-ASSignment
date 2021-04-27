package com.tyss.jdbc;
import java.sql.*;
public class SelectJdbc {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
			String query="select * from employee";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getInt("e_id"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getInt("dept"));
				System.out.println(rs.getInt("phno"));
				System.out.println("based on column execution :");
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
