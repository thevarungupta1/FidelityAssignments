package com.fill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class testHttp extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("do get ...");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("do get request");
		
	}

}
