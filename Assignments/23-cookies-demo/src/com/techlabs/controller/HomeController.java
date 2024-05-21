package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		
         Cookie cookie=new Cookie("firstname",request.getParameter("firstname"));
		
		response.addCookie(cookie);
		
		writer.print("<h1> Hi "+request.getParameter("firstname")+"</h1><br>");
		writer.print("<form action=\"CookieController \"><input type=\"text\" name=\"lastname\" placeholder=\"Enter Last Name\">\r\n" + 
				"<button>Send</button></form>");
		
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
