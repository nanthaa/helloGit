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
 *Feb 21, 2012 3:03:52 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-ChangePass.java
 */
public class ChangePass extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String path=request.getRealPath("");
			String id=request.getParameter("id");
			String opass=request.getParameter("opass");
			String npass=request.getParameter("npass");
			String cpass=request.getParameter("cpass");
			UserDAO userDAO=UserDAO.initialize();
			ResultSet rs=userDAO.getProfile(id,path);
			RequestDispatcher rd=null;
			request.setAttribute("rs", rs);
			boolean result=userDAO.confirm(id, opass, path);
			if(result)
			{
				if(!npass.equals(cpass))
				{
					rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no=3");
					rd.forward(request,response);
				}
				else
				{
					userDAO.changePass(id, cpass, path);
					rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no=1");
					rd.forward(request,response);
				}
			}
			else
			{
				rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no=2");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in ChangePass Servlet................."+e);
			out.println("Error in ChangePass Servlet................."+e);
		}
	}
}
