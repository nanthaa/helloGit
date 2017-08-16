/**
 * 
 */
package com.nitin.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nitin.DAO.UserDAO;

/**
 * @author Nitin Gudle
 *Feb 16, 2012 12:21:48 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-RegisterUser.java
 */
public class RegisterUser extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String [] values=new String[7];
			values[0]=request.getParameter("uname");
			values[1]=request.getParameter("uid");
			values[2]=request.getParameter("pass");
			values[3]=request.getParameter("city");
			values[4]=request.getParameter("state");
			values[5]=request.getParameter("cno");
			values[6]=request.getParameter("mail");
			String no1=request.getParameter("select");
			String type=request.getParameter("type");
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			boolean result=userDAO.userCheck(values[1], path);
			if(result)
			{
				response.sendRedirect(request.getContextPath()+"/index.jsp?no=4");
			}
			else
			{
				result=userDAO.register(values, path);
				RequestDispatcher rd=null;
				if(result)
				{
					request.setAttribute("id", values[1]);
					System.out.println("id in Servlet "+values[1]);
					rd=request.getRequestDispatcher("/index.jsp?no=5&no1="+no1+"&type="+type);
					rd.forward(request,response);
				}
				else
				{
					response.sendRedirect(path+"index.jsp?no=3");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in RegisterUser Servlet................."+e);
			out.println("Error in RegisterUser Servlet.................");
		}
	}
}
