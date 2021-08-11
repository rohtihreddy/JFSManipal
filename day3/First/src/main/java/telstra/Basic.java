package telstra;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.*;


public class Basic extends HttpServlet {
	private String message;
	public void init() throws ServletException{
		message = "Welcome to servlet response";
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		
		// set response content type
		response.setContentType("text/html");
		
		//actual logic here
		
		PrintWriter out = response.getWriter();	
		out.println("<h1>"+ message +"</h1>");
		
		}

}
