package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		//create configuration
		Configuration configuration = new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		//sessionFactory creating
		//sessionFactory - session object we are getting from factory, eg. i you want to buy car u go to car factory
		//sessionFactory is your datasource means- how u will be connecting to your databse 
		//to create sessionFactory you will be needing configuration
		SessionFactory factory= HibernateUtils.getSessionFactory();
		Session session= factory.openSession();
		
		Transaction tx= session.beginTransaction();
		
		String prodname= req.getParameter("Pname");
		String proddesc= req.getParameter("Pdesc");
		String prodprice= req.getParameter("Pprice");
		
		Product s1=new Product(prodname, proddesc, prodprice);
		session.save(s1);
		
		tx.commit();
		
		session.close();
		out.print("<h4>Data inserted Successfully</h4>");	
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
