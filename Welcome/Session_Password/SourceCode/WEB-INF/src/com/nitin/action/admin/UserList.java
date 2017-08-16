/**
 * 
 */
package com.nitin.action.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nitin.DAO.AdminDAO;

/**
 * @author Nitin Gudle
 *Feb 21, 2012 12:19:30 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-UserList.java
 */
public class UserList extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{	
			String id=request.getParameter("id");
			String path=request.getRealPath("");
			RequestDispatcher rd=null;
			AdminDAO adminDAO=AdminDAO.initialize();
			ResultSet rs = adminDAO.getUsers(path);
			request.setAttribute("rs", rs);
			rd=request.getRequestDispatcher("/Files/JSP/Admin/userlist.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in UserList Servlet................."+e);
			out.println("Error in UserList Servlet................."+e);
		}
	}
}
