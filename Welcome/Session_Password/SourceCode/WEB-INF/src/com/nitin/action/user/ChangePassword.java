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
 *Feb 21, 2012 3:00:37 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-ChangePassword.java
 */
public class ChangePassword extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String id=request.getParameter("id");
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			ResultSet rs=userDAO.getProfile(id,path);
			RequestDispatcher rd=null;
			request.setAttribute("rs", rs);
			rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in ChangePassword Servlet................."+e);
			out.println("Error in ChangePassword Servlet................."+e);
		}
	}
}
