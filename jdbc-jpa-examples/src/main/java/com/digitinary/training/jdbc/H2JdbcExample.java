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
public class H2JdbcExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			//1. register driver
			Class.forName("org.h2.Driver");
			
			//2. connect to db
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			//3. execute sql statement
			Statement stmt = con.createStatement();
			
			//3.1 create table
			String ceateTable = "CREATE TABLE CUSTOMERS (\r\n"
					+ "	CUSTOMER_ID NUMERIC PRIMARY KEY,\r\n"
					+ "	NAME VARCHAR(250),\r\n"
					+ "	MOBILE_NO VARCHAR(15)\r\n"
					+ ")";
			
			
			stmt.execute("DROP TABLE CUSTOMERS");
			stmt.execute(ceateTable);
			
			//con.setAutoCommit(false);//don't save immediatly
			stmt.execute("INSERT INTO CUSTOMERS VALUES (1, 'Salah', '1111111')");
			stmt.execute("INSERT INTO CUSTOMERS VALUES (2, 'Ismael', '2222222')");
			stmt.execute("INSERT INTO CUSTOMERS VALUES (3, 'Third', '33333333')");
			//con.commit();//save db changes
			
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
			//con.rollback();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.exit(0);
	}
}
