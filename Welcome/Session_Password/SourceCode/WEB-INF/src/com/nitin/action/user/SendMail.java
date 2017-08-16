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
 *Feb 21, 2012 10:34:13 AM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-SendMail.java
 */
public class SendMail extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String path=request.getRealPath("");
			String from=request.getParameter("from");
			String to=request.getParameter("to");
			String sub=request.getParameter("sub");
			String msg=request.getParameter("msg");
			RequestDispatcher rd=null;
			UserDAO userDAO=UserDAO.initialize();
			String date=userDAO.getDate();
			String time=userDAO.getTime();
			String day=userDAO.getDay();
			boolean result = userDAO.sendMail(from, to, sub, msg, day, date, time,path);
			ResultSet rs1=userDAO.getContacts(request.getParameter("from"),path);
			request.setAttribute("rs1", rs1);
			if(result)
			{
				rd=request.getRequestDispatcher("/Files/JSP/User/compose.jsp?no=1");
				rd.forward(request,response);
			}
			else
			{
				rd=request.getRequestDispatcher("/Files/JSP/User/compose.jsp?no=2");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in SendMail Servlet................."+e);
			out.println("Error in SendMail Servlet................."+e);
		}
	}
}