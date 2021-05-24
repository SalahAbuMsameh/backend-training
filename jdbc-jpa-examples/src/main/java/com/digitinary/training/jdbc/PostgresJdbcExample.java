package com.digitinary.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * May 24, 2021
 * @author Salah Abu Msameh
 */
public class PostgresJdbcExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			//1. register driver
			Class.forName("org.postgresql.Driver");
			
			//2. connect to db
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/customer_service", "postgres", "postgres");
			
			//3. execute sql statement
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMERS");
			
			while(rs.next()) {//[1, 2, 3]
				System.out.println(String.format("ID:%d, Name:%s, Mobile:%s", rs.getLong(1), rs.getString(2), rs.getString(3)));
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("No postgres driver found");
			System.exit(1);
		} catch (SQLException e) {
			System.err.println("Connection error : " + e.getMessage());
			System.exit(1);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
