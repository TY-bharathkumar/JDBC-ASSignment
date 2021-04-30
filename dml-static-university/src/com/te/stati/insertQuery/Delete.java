package com.te.stati.insertQuery;

import java.sql.*;

public class Delete {
	public static void main(String[] args) {
		Connection con =null;
		Statement stmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
			String query="delete from engineeringstudents where Student_id=7  ";
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("delete of a row is done sucessfully..!!!!");
			con.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
