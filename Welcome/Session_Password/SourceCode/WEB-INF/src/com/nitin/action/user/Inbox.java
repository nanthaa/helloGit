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

import com.nitin.DAO.UserDAO;

/**
 * @author Nitin Gudle
 *Feb 20, 2012 6:23:28 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-Inbox.java
 */
public class Inbox extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			RequestDispatcher rd=null;
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			ResultSet rs=userDAO.getMails(request.getParameter("id"),path);
			request.setAttribute("rs", rs);
			rd=request.getRequestDispatcher("/Files/JSP/User/inbox.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in Inbox Servlet................."+e);
			out.println("Error in Inbox Servlet................."+e);
		}
	}
}
