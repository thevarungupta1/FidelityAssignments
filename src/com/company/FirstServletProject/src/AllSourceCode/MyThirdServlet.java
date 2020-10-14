package AllSourceCode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyThirdServlet extends HttpServlet{
	 public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 System.out.println("Servicing method");
		 res.setContentType("txt/html");
		 PrintWriter out = res.getWriter();
		 out.print("<h1>Servicing method of third servlet class<h3>");
	 }

}
