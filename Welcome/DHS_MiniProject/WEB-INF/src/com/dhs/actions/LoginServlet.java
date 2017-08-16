package com.dhs.actions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhs.DAO.AdministratorDAO;
import com.dhs.DAO.EmployeeDAO;


/**
 * 
 * @author Raja Rao.R
 * @version 1.0
 * @see AdministratorDAO
 * This Servlet acts as a controller for login to the application
 * 
 */


public class LoginServlet extends HttpServlet 
{
      
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
			{
		
		
		
		

		String z_adminUserName = request.getParameter("username");
		String z_adminPassWord = request.getParameter("adminpassword");
		
		RequestDispatcher rd;
		
		
		HttpSession httpSession = request.getSession(true);
		
		
		boolean result=AdministratorDAO.checkAdminUser(z_adminUserName, z_adminPassWord);
		System.out.println("here"+result);
		 if(result)
		  {
			 
			 
			 
			 httpSession.setAttribute("valid", "yes");
			 httpSession.setAttribute("AdminName", z_adminUserName);
			 
			 response.sendRedirect("jsp/frame.jsp");
		  }
		
		 else
		 {
			
			 request.setAttribute("message", "invalid user");
				
			 
			 
			 
					rd = request.getRequestDispatcher("/jsp/Login.jsp");
					rd.forward(request, response);
		 }
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	}
	
	
	
	

