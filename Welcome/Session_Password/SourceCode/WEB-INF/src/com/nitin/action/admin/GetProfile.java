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
 *Feb 21, 2012 11:05:28 AM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-GetProfile.java
 */
public class GetProfile extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String path=request.getRealPath("");
			String id=request.getParameter("id");
			AdminDAO adminDAO=AdminDAO.initialize();
			ResultSet rs=adminDAO.getProfile(id,path);
			RequestDispatcher rd=null;
			request.setAttribute("rs", rs);
			rd=request.getRequestDispatcher("/Files/JSP/Admin/profile.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in GetProfile Servlet................."+e);
			out.println("Error in GetProfile Servlet................."+e);
		}
	}
}
