package com.simplilearn.validate;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        
		String email =req.getParameter("uname");
        String password =req.getParameter("pass");
        
        
        if(email.equalsIgnoreCase("baljeet@gmail.com") && password.equalsIgnoreCase("12345")) {
            //add  user in the session once the login is done
            HttpSession session=req.getSession();
            session.setAttribute("email", email);
            session.setAttribute("pass", password);
            resp.sendRedirect("WebsiteHome.html");
        }
     
        else {
     
        	
    		
            RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
			rd.include(req, resp);
			
            out.println("<h2>UserName or Password Error!</h2>");
			out.println("<h2>Enter valid username and password<br/><br/></br></h2>");
			
    		
        }
 
		
	}
	
	

}