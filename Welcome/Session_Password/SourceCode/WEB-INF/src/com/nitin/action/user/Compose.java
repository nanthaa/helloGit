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
 *Feb 21, 2012 10:27:13 AM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-Compose.java
 */
public class Compose extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{	
			String path=request.getRealPath("");
			RequestDispatcher rd=null;
			UserDAO userDAO=UserDAO.initialize();
			ResultSet rs1=userDAO.getContacts(request.getParameter("id"),path);
			request.setAttribute("rs1", rs1);
			rd=request.getRequestDispatcher("/Files/JSP/User/compose.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in Compose Servlet................."+e);
			out.println("Error in Compose Servlet................."+e);
		}
	}
}
