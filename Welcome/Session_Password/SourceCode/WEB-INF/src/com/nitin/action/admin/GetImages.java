/**
 * 
 */
package com.nitin.action.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nitin.util.*;
import com.nitin.DAO.AdminDAO;

/**
 * @author Nitin Gudle
 *Feb 21, 2012 3:18:35 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-GetImages.java
 */
public class GetImages extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			RequestDispatcher rd=null;
			String path=request.getRealPath("");
			Vector v=com.nitin.util.GetImages.getImages();
			Vector v1=com.nitin.util.GetImages.getImages("");
			request.setAttribute("v", v);
			request.setAttribute("v1", v1);
			rd=request.getRequestDispatcher("/Files/JSP/Admin/images.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			System.out.println("Error in GetImages Servlet................."+e);
			out.println("Error in GetImages Servlet................."+e);
		}
	}
}
