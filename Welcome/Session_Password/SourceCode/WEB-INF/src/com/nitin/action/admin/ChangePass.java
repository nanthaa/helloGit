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
 *Feb 21, 2012 12:00:06 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
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
			AdminDAO adminDAO=AdminDAO.initialize();
			ResultSet rs=adminDAO.getProfile(id,path);
			RequestDispatcher rd=null;
			request.setAttribute("rs", rs);
			boolean result=adminDAO.confirm(id, opass,path);
			if(result)
			{
				if(!npass.equals(cpass))
				{
					rd=request.getRequestDispatcher("/Files/JSP/Admin/changepass.jsp?no=3");
					rd.forward(request,response);
				}
				else
				{
					adminDAO.changePass(id, cpass,path);
					rd=request.getRequestDispatcher("/Files/JSP/Admin/changepass.jsp?no=1");
					rd.forward(request,response);
				}
			}
			else
			{
				rd=request.getRequestDispatcher("/Files/JSP/Admin/changepass.jsp?no=2");
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
