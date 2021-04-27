package com.tyss.jdbc;
import java.sql.*;
public class CommandDynamicInput {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			//load 
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
			//get connection  via deriver
			try{
				con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ems","root","root");
			}
			catch(SQLException e){
				System.out.println("connction failed ! check the console");
				e.printStackTrace();
				return;
			}
			String query="select * from employee where e_id=?";	
			try{
				pstmt=con.prepareStatement(query);
				String eid=args[0];
				int employeeid=Integer.parseInt(eid);
				pstmt.setInt(1, employeeid);
				rs=pstmt.executeQuery();
			}
			catch(SQLException e){
				e.printStackTrace();	
			}
if(rs.next()){
	int e_id=rs.getInt("e_id");
	String ename=rs.getString("ename");
	int dept =rs.getInt("dept");
	int phno=rs.getInt("phno");
	System.out.println("emloyee id : "+e_id);
	System.out.println("emloyee name : "+ename);
	System.out.println("emloyee dept : "+dept);
	System.out.println("emloyee phone number : "+phno);
}

			/*	pstmt.setString(1, "Suresh");
			pstmt.setInt(2,5 );
			int count=pstmt.executeUpdate();*/
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


