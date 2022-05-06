package com.sol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConn {

	public static void main(String[] args) {
		String userName = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/rs1"; //rs1 is DataBase Name
		
		Connection con  = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url,userName,password);
			String sql = "select * from persons";
			PreparedStatement pst = con.prepareStatement(sql);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Table Data is ..");
			while(rs.next()) {
				System.out.println("id --> "+rs.getInt(1)+" Name is "+rs.getString(2)+" Gender is "+rs.getString(3)+" Country is "+rs.getString(4));
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		

	}

}
