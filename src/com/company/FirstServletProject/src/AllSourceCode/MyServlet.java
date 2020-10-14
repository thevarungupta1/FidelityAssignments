package AllSourceCode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet {
	
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("Destroying...");
		
	}

	@Override
	public ServletConfig getServletConfig() {
	
		return this.config;
	}

	@Override
	public String getServletInfo() {
		
		return "My Servlet name is: First";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		System.out.println("Servicing...");
		response.setContentType("text/html");
	 PrintWriter out= response.getWriter();
	 out.print("<h1>Hello form my servlet service method</h1>");
	 
		
	}

}
