package com.te.stati.insertQuery;

import java.sql.*;

public class UpdateQuery {
	
public static void main(String[] args) {
	Statement stmt=null;
	ResultSet rs=null;
	Connection con=null;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
		stmt=con.createStatement();
		String quey="update engineeringstudents set department='CIVI' where  Student_id=2";
		stmt.executeUpdate(quey);
		System.out.println("update is sucessful..!!!!!");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
}
