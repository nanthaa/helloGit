/**
 * 
 */
package com.nitin.action.admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.nitin.DAO.UserDAO;

/**
 * @author Nitin Gudle
 *Feb 21, 2012 5:10:24 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.admin
 *File:-ChangeImage.java
 */
public class ChangeImage extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out=response.getWriter();
		try
		{
			RequestDispatcher rd=null;
			HttpSession hs=request.getSession();
			String fileName="";
			String name="";
			String [] values=new String[2];
			int i=0;
			String root = getServletContext().getRealPath("/");
            File path = new File(root + "/Files/Pimages");
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) 
	        {
				boolean result=false;
	            FileItemFactory factory = new DiskFileItemFactory();
	            ServletFileUpload upload = new ServletFileUpload(factory);
	            try 
	            {
	                List items = upload.parseRequest(request);
	                Iterator iterator = items.iterator();
	                while (iterator.hasNext()) 
	                {
	                    FileItem item = (FileItem) iterator.next();
	                    if (item.isFormField()) 
	                    {
	                    	name = item.getString();
	                    }
	                    else
	                    {
	                    	fileName = item.getName();
	                        if (!path.exists()) 
	                        {
	                        	boolean status = path.mkdirs();
	                        }
	                        File uploadedFile = new File(path + "/" + name+".jpg");
	                        item.write(uploadedFile);
	                        result=true;
	                    }
	                 }
	                if(result)
	                {
	                	Vector v=com.nitin.util.GetImages.getImages();
	        			Vector v1=com.nitin.util.GetImages.getImages("");
	        			request.setAttribute("v", v);
	        			request.setAttribute("v1", v1);
	        			rd=request.getRequestDispatcher("/Files/JSP/Admin/images.jsp?no=1");
	        			rd.forward(request,response);
	                }
	                else
	                	response.sendRedirect("/Files/JSP/Admin/images.jsp?no=2");
	             }
	            catch (FileUploadException e) 
	            {
	                e.printStackTrace();
	            } catch (Exception e) {
	                e.printStackTrace();
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
