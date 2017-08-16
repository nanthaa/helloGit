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
 *Feb 20, 2012 4:11:32 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-AddContact.java
 */
public class AddContact extends HttpServlet 
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
			ResultSet rs=userDAO.getContacts(request.getParameter("id"),path);
			ResultSet rs1=userDAO.getUser(path);
			request.setAttribute("rs", rs);
			request.setAttribute("rs1", rs1);
			rd=request.getRequestDispatcher("/Files/JSP/User/contacts.jsp?no=1");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in AddContact Servlet................."+e);
			out.println("Error in AddContact Servlet................."+e);
		}
	}
}
