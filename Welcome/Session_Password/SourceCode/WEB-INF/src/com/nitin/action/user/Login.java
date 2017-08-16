/**
 * 
 */
package com.nitin.action.user;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Vector;

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
public class Login extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		boolean result=false;
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		try
		{
			RequestDispatcher rd=null;
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			String name=request.getParameter("username");
			String pass=request.getParameter("password");
			String no=request.getParameter("no");
			if(no.equals("1"))
			{
				response.sendRedirect("index.jsp?no=3");
			}
			else if(no.equals("2"))
			{
				System.out.println(name+"---"+pass);
				result=userDAO.loginCheck(name, pass, path);
				if(result)
				{
					Vector v=(Vector)hs.getAttribute("v");
					String code=request.getParameter("code");
					for(int i=0;i<v.size();i++)
					{
						String c=(String)v.get(i);
						if(code.charAt(i)==c.charAt(0))
						{
							result=true;
						}
						else
						{
							response.sendRedirect("index.jsp?no=11");
						}
					}
					hs.setAttribute("id", name);
					rd=request.getRequestDispatcher("/index.jsp?no=2");
					rd.forward(request,response);
				}
				else
				{
					response.sendRedirect("index.jsp?no=10");
				}
			}
			else
			{
				System.out.println(name+"---"+pass);
				result=userDAO.loginCheck(name, pass, path);
				if(result)
				{
					hs.setAttribute("id", name);
					rd=request.getRequestDispatcher("/index.jsp?no=2");
					rd.forward(request,response);
				}
				else
				{
					response.sendRedirect("index.jsp?no=10");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in Login Servlet................."+e);
			out.println("Error in Login Servlet.................");
		}
	}
}
