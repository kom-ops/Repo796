package com.lti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EmpServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("txtEmpId"));
		String ename=request.getParameter("txtEmpName");
		long esal=Integer.parseInt(request.getParameter("txtEmpSal"));
		PrintWriter out=response.getWriter();
		out.print(eid+ " " +ename);
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
