package com.amazon1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AmazonDao implements AmazonDaoInterface{
	
	public static AmazonDaoInterface createDaoObject() {
		
		return new AmazonDao();
	}

	@Override
	public int createProfileDao(String ac) {
		int i=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Zensar123");
			PreparedStatement ps=con.prepareStatement("insert into facebookemployee values(?,?,?,?)");
			ps.setString(1, ac.getName());
			ps.setString(2, ac.getPass());
			ps.setString(3, ac.getEmail());
			ps.setString(4, ac.getAddress());
			i=ps.executeUpdate();
		
		//return 1;
		
	}
	
	}}


