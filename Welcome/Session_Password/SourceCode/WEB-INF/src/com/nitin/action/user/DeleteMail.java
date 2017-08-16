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
 *Feb 21, 2012 10:18:37 AM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-DeleteMail.java
 */
public class DeleteMail extends HttpServlet 
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
			String []chk=request.getParameterValues("chk");
			if(chk==null)
			{
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/User/inbox.jsp?no=1");
				rd.forward(request,response);
			}
			else
			{
				for(int i=0;i<chk.length;i++)
				{
					userDAO.deleteMail(Integer.parseInt(chk[i]),path);
				}
				rs=userDAO.getMails(request.getParameter("id"),path);
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/User/inbox.jsp?no=2");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in DeleteMail Servlet................."+e);
			out.println("Error in Inbox DeleteMail................."+e);
		}
	}
}
