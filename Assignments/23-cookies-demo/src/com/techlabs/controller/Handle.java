package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Handle
 */
@WebServlet("/Handle")
public class Handle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(true);
		RequestDispatcher dispatcher=request.getRequestDispatcher("Admin.jsp");
		if(request.getParameter("email").equals("abc@gmail.com") && request.getParameter("password").equals("1234"))
		{
	
			session.setAttribute("user", request.getParameter("email"));
			dispatcher.forward(request, response);
			
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
