
package com.lti.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.portable.InputStream;


public class EmployeeConn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmployeeConn() {
        super(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("txtEmpId"));
		String ename=request.getParameter("txtEmpName");
		long esal=Integer.parseInt(request.getParameter("txtEmpSal"));
		PrintWriter out=response.getWriter();
		out.print(eid+ " " +ename+" "+esal);
		
		InputStream is=(InputStream) getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties prop=new Properties();
		prop.load(is);
		String driver=(String)prop.get("db.driver");
		String url=(String)prop.get("db.url");
		String user=(String)prop.get("db.user");
		String pass=(String)prop.get("db.pass");
		
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			out.println("Connection is established");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
