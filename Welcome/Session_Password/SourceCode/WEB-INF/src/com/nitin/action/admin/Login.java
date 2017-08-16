/**
 * 
 */
package com.nitin.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nitin.DAO.AdminDAO;

/**
 * @author Nitin Gudle
 *Feb 14, 2012 4:31:35 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-Login.java
 */
public class Login extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			String name=request.getParameter("username");
			String pass=request.getParameter("password");
			System.out.println(name+"---"+pass);
			AdminDAO adminDAO=AdminDAO.initialize();
			String path=request.getRealPath("");
			boolean result=adminDAO.loginCheck(name, pass,path);
			if(result)
			{
				RequestDispatcher rd=null;
				HttpSession hs=request.getSession();
				hs.setAttribute("admin", name);
				rd=request.getRequestDispatcher("/Files/JSP/Admin/home.jsp");
				rd.forward(request,response);
			}
			else
			{
				response.sendRedirect("index.jsp?no=1");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in AdminLogin Servlet................."+e);
			out.println("Error in AdminLogin Servlet.................");
		}
	}
}
