package com.jwt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class displayServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:8083:xe","hr","hr");
			System.out.println("Connection is established");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM chiefminister");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+ rs.getString(2)+ " " + rs.getString(3) + rs.getString(4) + rs.getString(5) + rs.getString(6));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
			System.out.println(e);
		}
		out.close();
	}

}