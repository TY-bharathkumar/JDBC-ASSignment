package com.tyss.jdbc;
import java.sql.*;
public class DeleteJdbc {
public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
		String query="delete from employee where e_id=2";
		stmt=con.createStatement();
		int count =stmt.executeUpdate(query);	
		System.out.println("object has been deleted");
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
	}
}
}
