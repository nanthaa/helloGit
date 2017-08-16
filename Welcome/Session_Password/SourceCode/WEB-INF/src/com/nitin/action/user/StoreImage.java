/**
 * 
 */
package com.nitin.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nitin.DAO.UserDAO;
import com.nitin.util.GetImages;

/**
 * @author Nitin Gudle
 *Feb 16, 2012 1:57:57 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.user
 *File:-StoreImage.java
 */
public class StoreImage extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		try
		{
			String no="";
			String id="";
			Enumeration e=request.getParameterNames();
			Vector v=(Vector)hs.getAttribute("v");
			while(e.hasMoreElements())
			{
				String name=(String)e.nextElement();
				if(name.equalsIgnoreCase("id"))
					id=request.getParameter(name);
				else
				{
					no+=request.getParameter(name);
				}
			}
			no = new StringBuffer(no).reverse().toString();
			String path=request.getRealPath("");
			UserDAO userDAO=UserDAO.initialize();
			boolean result=userDAO.addImages(id, no, path);
			if(result)
				result=GetImages.createPro(path,id, v, no);
			if(result)
				response.sendRedirect(request.getContextPath()+"/index.jsp?no=6");
		}
		catch(Exception e)
		{
			System.out.println("Error in RegisterUser Servlet................."+e);
			out.println("Error in RegisterUser Servlet.................");
		}
	}
}
