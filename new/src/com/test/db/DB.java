package com.test.db;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DB {

	public static Connection getDb() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection s = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb", "root", "");
			return s;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
