package com.dhs.actions;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhs.DAO.AdministratorDAO;



/**
 * 
 * @author Raja Rao.R
 * @version 1.0
 * @see AdministratorDAO
 * This Servlet acts as a controller for change the password of admin
 * 
 */




public class UserChangePassword_Action extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		System.out.println();
		RequestDispatcher reqdispatcher=null;
		
			
		String z_AdminId=request.getParameter("user_id").trim();
		String z_oldPassword=request.getParameter("old_password").trim();
		String z_newPassword=request.getParameter("new_password").trim();
		String z_confirmpassword=request.getParameter("confirm_password").trim();
		
		
		
		
		boolean updateflag=AdministratorDAO.changePassword(z_AdminId, z_oldPassword, z_newPassword);
		
		System.out.println("Update Flag "+updateflag);
		
		if(updateflag)
		{
			request.setAttribute("passwordstatus", "success");
			reqdispatcher=request.getRequestDispatcher("/jsp/ChangeUserPass.jsp");
			reqdispatcher.forward(request, response);
			
		}
		
		else
		{
			request.setAttribute("passwordstatus", "failure");
			reqdispatcher=request.getRequestDispatcher("/jsp/ChangeUserPass.jsp");
			reqdispatcher.forward(request, response);
		}
	}

	
	
}
