package com.revature.Bank_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.Bank_app.dao.UserDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("LoginServlet").append(request.getContextPath());
	 String email =request.getParameter("email");
	 String password = request.getParameter("password");
	 PrintWriter out = response.getWriter();
	 out.println("Email:"  + email);
	 out.println("password:"  + password);
	 boolean isValidUser=false;
	 try {
		 UserDao userdao=new UserDao();
		 isValidUser= userdao.login(email,password);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 if(isValidUser) {
		 response.sendRedirect("home.jsp");
	 }else {
		 response.sendRedirect("index.jsp?message=Invalid Login Credentials");
		 
	 }
	 }
	}
