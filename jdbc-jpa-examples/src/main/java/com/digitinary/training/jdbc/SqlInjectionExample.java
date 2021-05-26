package com.digitinary.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 
 * May 26, 2021
 * @author Salah Abu Msameh
 */
public class SqlInjectionExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter customer id >> ");
		int customerId = in.nextInt();
		
		System.out.println("Please enter customer name >> ");
		String customerName = in.next();
		
		Connection con = null;
		
		try {
			//1. register driver
			Class.forName("org.postgresql.Driver");
			
			//2. connect to db
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/customer_service", "postgres", "postgres");
			
			//3. execute sql statement
			String sql = "SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID = ? OR NAME = ?";
			PreparedStatement stmt = con.prepareStatement(sql);//compile sql
			stmt.setInt(1, customerId);
			stmt.setString(2, customerName.trim());
			
			ResultSet rs = stmt.executeQuery();
			
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
