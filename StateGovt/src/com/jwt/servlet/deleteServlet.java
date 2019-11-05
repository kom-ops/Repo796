package com.jwt.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteServlet {
	public static void main(String[] args) {
	    String jdbcUrl = "jdbc:oracle:thin:@localhost:8083:xe";
	    String username = "hr";
	    String password = "hr";
	    String sql = "delete from chiefminister where cid=123";

	    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
	        Statement stmt = conn.createStatement();) {
	      
	      stmt.executeUpdate(sql);
	      System.out.println("Record deleted successfully");
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
}
