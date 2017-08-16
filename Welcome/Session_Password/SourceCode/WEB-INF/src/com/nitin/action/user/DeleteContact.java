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
 *Feb 20, 2012 6:06:22 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-DeleteContact.java
 */
public class DeleteContact extends HttpServlet 
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
			ResultSet rs=null;
			String []chk=request.getParameterValues("chk");
			if(chk==null)
			{
				rs=userDAO.getContacts(request.getParameter("id"),path);
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/User/contacts.jsp?no=4");
				rd.forward(request,response);
			}
			else
			{
				for(int i=0;i<chk.length;i++)
				{
					userDAO.deleteContact(Integer.parseInt(chk[i]),path);
				}
				rs=userDAO.getContacts(request.getParameter("id"),path);
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/User/contacts.jsp?no=5");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in DeleteContact Servlet................."+e);
			out.println("Error in DeleteContact Servlet................."+e);
		}
	}
}
