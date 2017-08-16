package com.dhs.actions;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhs.DAO.EmployeeDAO;



/**
 * 
 * @author Raja Rao.R
 * @version 1.0
 * @see EmployeeDAO
 * This Servlet acts as a controller for Delete An Employee from the DB permanently
 * 
 */



public class DeleteEmployeeServlet extends HttpServlet{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		RequestDispatcher rd;
	try{
		
		
		//Get the employeetid to be deleted by user in the  form
		
		String employeeCode=req.getParameter("eid");

		
		
		//convert the data from string to integer
		
		int z_ecode=Integer.parseInt(employeeCode);
		
		System.out.println("inside delete");
		
		
		//delete the department
		
		
		boolean flag=EmployeeDAO.deleteEmployee(z_ecode);
		
		
		//if deletion is successful go to EmployeeDetails.jsp otherwise Error.jsp
		
		
		if(flag)
		{
			
			req.setAttribute("message", "Employee Deleted Successfulyy");
			
			 rd=req.getRequestDispatcher("/jsp/EmployeeDetails.jsp");
			
			rd.forward(req, resp);
			
		}
		else{
			 rd=req.getRequestDispatcher("/jsp/Error.jsp");
			 rd.forward(req, resp);
		}
		
		
	}catch (Exception e) {
		// TODO: handle exception
	}
		
		
		
		
		
		
		
	}
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(req,resp);
	}
	
	
}
