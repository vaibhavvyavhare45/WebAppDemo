package com.prowings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyFirstServlet extends HttpServlet {
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hello, world!");
		
		out.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Get the values from the request using 'getParameter'
        String name = request.getParameter("name");
        String phNum = request.getParameter("phone");
            // set the content type of response to 'text/html'
        response.setContentType("text/html");
          
        // Get the PrintWriter object to write 
        // the response to the text-output stream
        PrintWriter out = response.getWriter();
          
        // Print the data
        out.print("<html><body>");
        out.print("<h3>Details Entered</h3><br/>");
          
        out.print("Full Name: "+ name + "<br/>");
        out.print("Phone Number: "+ phNum +"<br/>");
        out.print("</body></html>");
          
    }
	
	
	 

}
