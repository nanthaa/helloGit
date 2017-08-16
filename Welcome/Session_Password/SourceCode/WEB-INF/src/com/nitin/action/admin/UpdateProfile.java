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
 *Feb 21, 2012 11:49:56 AM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-UpdateProfile.java
 */
public class UpdateProfile extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String path=request.getRealPath("");
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String mail=request.getParameter("mail");
			String cell=request.getParameter("cell");
			String city=request.getParameter("city");
			AdminDAO adminDAO=AdminDAO.initialize();
			ResultSet rs=adminDAO.getProfile(id,path);
			System.out.println("-=-=-=----=-=-");
			RequestDispatcher rd=null;
			request.setAttribute("rs", rs);
			boolean result=adminDAO.editProfile(id, name, mail, Integer.parseInt(cell), city,path);
			if(result)
			{
				rd=request.getRequestDispatcher("/Files/JSP/Admin/editprof.jsp?no=1");
				rd.forward(request,response);
			}
			else
			{
				rd=request.getRequestDispatcher("/Files/JSP/Admin/editprof.jsp?no=2");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in UpdateProfile Servlet................."+e);
			out.println("Error in UpdateProfile Servlet................."+e);
		}
	}
}
