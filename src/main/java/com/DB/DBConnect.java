package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
private static Connection con;
	
	public static Connection getConn() {
		try {
			if(con==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Enotes","root","test");
				System.out.println("At DbConnect "+con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
