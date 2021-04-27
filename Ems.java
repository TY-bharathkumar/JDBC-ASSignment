package com.tyss.jdbc;
import java.sql.*;
public class Ems {
public static void main(String[] args){
	/*String s="bharath";*/
	//1.load a driver
	Connection con=null;
	Statement stmt=null;
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		Driver driver=new com.mysql.jdbc.Driver(); // interface
		DriverManager.registerDriver(driver);
		System.out.println("driver has been created");
		//2.get connection via a driver
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
		
		//3.issue sequel queries via connection
		String query="insert into Employee values(5,'Rthod',40,1122334455)";
		 stmt=con.createStatement();
		 //4.process the result set
		int count=stmt.executeUpdate(query);
		System.out.println("number of rows affected "+count);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		//close the all jdbc objects
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
