package com.login.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class LoginDao {
	
	
	String sql="select * from logindetails where un=? and pass=?";
	String url ="jdbc:mysql://localhost:3306/login";
	String uname="root";
	String password="123qweasdzxcMYSQLDB";
	
	
	public boolean logincheck(String un, String pass)
	{
		System.out.println(">>>logincheck");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, un);	
		st.setString(2, pass);
		ResultSet rs =st.executeQuery();
		System.out.println("<<<logincheck");

		
		if(rs.next())
		{
			return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
