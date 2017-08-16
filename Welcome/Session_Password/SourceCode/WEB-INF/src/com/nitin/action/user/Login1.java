/**
 * 
 */
package com.nitin.action.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nitin.DAO.UserDAO;

/**
 * @author Nitin Gudle
 *Feb 14, 2012 4:31:35 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-Login.java
 */
public class Login1 extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		try
		{
			RequestDispatcher rd=null;
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			String sessionPwd=request.getParameter("sessionPwd");
			String id=(String)hs.getAttribute("id");
			boolean result=userDAO.sessionPwdCheck(id, sessionPwd, path);
			if(result)
			{
				hs.setAttribute("id", id);
				rd=request.getRequestDispatcher("/Files/JSP/User/home.jsp");
				rd.forward(request,response);
			}
			else
			{
				response.sendRedirect("index.jsp?no=12");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in Login1 Servlet................."+e);
			out.println("Error in Login1 Servlet.................");
		}
	}
}
