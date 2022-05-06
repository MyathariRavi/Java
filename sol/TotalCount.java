package com.sol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TotalCount {

	public static void main(String[] args) {
		String userName = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/rs1"; //rs1 is DataBase Name
		
		Connection con  = null;
		Statement st = null;
		ResultSet rs  = null;
		PreparedStatement pst  = null;
		String sql = null;
		
		//Connection  & Total Count
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url,userName,password);
			sql = "select count(*) from persons";
			 pst = con.prepareStatement(sql);
			st = con.createStatement();
			rs= st.executeQuery(sql);
			rs.next();
			System.out.println("Table  size is "+rs.getInt(1));
//			while(rs.next()) {
//				
//				System.out.println("id --> "+rs.getInt(1)+" Name is "+rs.getString(2)+" Gender is "+rs.getString(3)+" Country is "+rs.getString(4));
//			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//Non- Null Count
		try {
			st = con.createStatement();
			sql = "select count(name) from persons where name is NOT NULL";
			rs = st.executeQuery(url);
			rs.next();
			System.out.println(rs.getInt(1));
			
		}catch(Exception ex) {
//			ex.printStackTrace();
			System.out.println("Erroe at NON-NULL Count \n"+ex.getMessage());
		}
		
		
		
		

	}

}
