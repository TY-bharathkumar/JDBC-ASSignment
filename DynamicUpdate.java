package com.tyss.jdbc;
import java.sql.*;

public class DynamicUpdate {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			//load 
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
			//get connection via deriver
			String query="update employee set ename=? where e_id=?";			
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, "Suresh");
			pstmt.setInt(2,5 );
			int count=pstmt.executeUpdate();
			System.out.println("update is done now ");

		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
