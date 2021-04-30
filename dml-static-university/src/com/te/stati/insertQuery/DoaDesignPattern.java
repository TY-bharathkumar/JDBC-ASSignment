package com.te.stati.insertQuery;
import java.sql.*;
public class DoaDesignPattern {
	public static DoaDesignPattern connectionMethod(){
		Connection con=null;
		ResultSet rs=null;
		if(con!= null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
			} catch (Exception e) {
				e.printStackTrace();	
			}
		}
			return null;
		}
	}


