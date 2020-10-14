package AllClasses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String e = request.getParameter("email");
		String p = request.getParameter("pass");
		
		if(LoginDao.validate(e, p)) {
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else {
			out.print("Incorrect username and password");
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
		
		out.close();
	}
	

}
