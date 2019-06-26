package com.au.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoMysqlConnection {
	public static void main(String []str) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HR","root","Password@13");
		
			System.out.println("connecting mysql");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
