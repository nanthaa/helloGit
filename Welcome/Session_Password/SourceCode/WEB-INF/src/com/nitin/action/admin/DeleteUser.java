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
import com.nitin.util.GetImages;

/**
 * @author Nitin Gudle
 *Feb 21, 2012 1:04:41 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-DeleteUser.java
 */
public class DeleteUser extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{	
			String id=request.getParameter("id");
			String path=request.getRealPath("");
			RequestDispatcher rd=null;
			AdminDAO adminDAO=AdminDAO.initialize();
			ResultSet rs = adminDAO.getUsers(path);
			String []chk=request.getParameterValues("chk");
			if(chk==null)
			{
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/Admin/userlist.jsp?no=1");
				rd.forward(request,response);
			}
			else
			{
				for(int i=0;i<chk.length;i++)
				{
					GetImages.deletePro(path, adminDAO.getU_userid(chk[i],path));
					adminDAO.deleteUser(Integer.parseInt(chk[i]),path);
				}
				rs = adminDAO.getUsers(path);
				request.setAttribute("rs", rs);
				rd=request.getRequestDispatcher("/Files/JSP/Admin/userlist.jsp?no=2");
				rd.forward(request,response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in DeleteUser Servlet................."+e);
			out.println("Error in DeleteUser Servlet................."+e);
		}
	}
}
