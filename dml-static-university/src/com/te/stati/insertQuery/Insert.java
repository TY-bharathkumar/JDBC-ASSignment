package com.te.stati.insertQuery;
import java.sql.*;

public class Insert {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
			stmt=con.createStatement();
			String query="insert into engineeringstudents values(7,'mech','Bhargav','bhav',2020,5655)";
			stmt.executeUpdate(query);
			System.out.println("Inserted successfully..!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
