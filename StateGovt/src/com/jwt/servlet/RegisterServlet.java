package com.jwt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String qualification = request.getParameter("qualification");
		String state = request.getParameter("state");
		String enddate = request.getParameter("enddate");
		String party = request.getParameter("party");
		
		try {
			Class.forName("oracle.jdbc.Driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:8083:xe","hr","hr");
			
			PreparedStatement ps = con
					.prepareStatement("insert into chiefminister values(?,?,?,?,?,?)");

			ps.setString(1, cid);
			ps.setString(2, cname);
			ps.setString(3, qualification);
			ps.setString(4, state);
			ps.setString(3, enddate);
			ps.setString(3, party);

			int i = ps.executeUpdate();
			if (i >= 0)
				out.print("You are successfully registered...");

		} catch (Exception e2) {
			System.out.println("ERROR");
			System.out.println(e2);
		}

		out.close();
	}

}