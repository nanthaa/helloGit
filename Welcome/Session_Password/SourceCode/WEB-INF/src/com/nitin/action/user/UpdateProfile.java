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
 *Feb 21, 2012 2:49:35 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
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
			String state=request.getParameter("state");
			UserDAO userDAO=UserDAO.initialize();
			ResultSet rs=userDAO.getProfile(id,path);
			RequestDispatcher rd=null;
			request.setAttribute("rs", rs);
			boolean result=userDAO.editProfile(id, name, mail, Integer.parseInt(cell), city, state,path);
			if(result)
			{
				rd=request.getRequestDispatcher("/Files/JSP/User/editprof.jsp?no=1");
				rd.forward(request,response);
			}
			else
			{
				rd=request.getRequestDispatcher("/Files/JSP/User/editprof.jsp?no=2");
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
