/**
 * 
 */
package com.nitin.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nitin.DAO.UserDAO;

/**
 * @author Nitin Gudle
 *Feb 20, 2012 5:44:02 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-AddContact1.java
 */
public class AddContact1 extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		RequestDispatcher rd=null;
		try
		{
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			String contact=request.getParameter("contact");
			boolean result=userDAO.contactCheck(request.getParameter("id"),contact,path);
			if(result)
			{
				userDAO.addContact(request.getParameter("id"),contact,path);
				ResultSet rs=userDAO.getContacts(request.getParameter("id"),path);
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/User/contacts.jsp?no=2");
				rd.forward(request,response);
			}
			else
			{	
				ResultSet rs=userDAO.getContacts(request.getParameter("id"),path);
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/User/contacts.jsp?no=3");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in AddContact1 Servlet................."+e);
			out.println("Error in AddContact1 Servlet................."+e);
		}
	}
}
