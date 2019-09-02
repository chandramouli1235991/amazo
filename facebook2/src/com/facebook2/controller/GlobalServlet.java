package com.facebook2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebook2.entity.FacebookEmployee;
import com.facebook2.service.FacebookService;
import com.facebook2.service.FacebookServiceInterface;


public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		
		String option=request.getParameter("ac");
		if(option.equals("register")) {
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			//now servlet want to transfer above data to service so it should transfer 
			//in form of object because ofDTD(data transfer object)
			//design pattern
			//object 
			FacebookEmployee fe=new FacebookEmployee();
			fe.setName(name);
			fe.setPass(pass);
			fe.setEmail(email);
			fe.setAddress(address);
			FacebookServiceInterface fs=FacebookService.createServiceObject();
			int i=fs.createProfile(fe);
			if(i>0) {
				out.println("profile created");
			}
			else
			{
				out.println("could not create profile");
			}
		}
		if(option.equals("login")) {
		
	}
if(option.equals("timeline")) {
}
out.println("</body></html>");
}
}