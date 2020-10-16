import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstServlet implements Servlet{
ServletConfig config=null;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("inislizating .......");
		
	}


	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servecing.........");
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.print("<h2>Hi puja this is servlte program</h2>");
		
	}

	public void destroy() {
		System.out.println("destroying......");
		
	}


	public ServletConfig getServletConfig() {
		return this.config;
	}

	public String getServletInfo() {
		return "this is my msg";
	}


	

}
