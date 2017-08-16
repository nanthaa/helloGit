package com.dhs.actions;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhs.DAO.DepartmentDAO;
import com.dhs.DAO.EmployeeDAO;
/**
 * 
 * @author Raja Rao.R
 * @version 1.0
 * @see DepartmentDAO
 * This Servlet acts as a controller for Edit the Department information
 * 
 */
public class EditDepartmentServlet extends HttpServlet 
{

	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Get the data provided by the user in the  form
		
		String departmentid = req.getParameter("deptId");
		
		String z_departmentName = req.getParameter("deptName");
		
		
		//convert the data from string to integer
		
		
		int z_departmentNo=Integer.parseInt(departmentid);
		
		
		
		
        System.out.println("inside edit dept");
        
        
      //if we successfuly edit the department transfer the control to DepartmentDetails.jsp otherwise Error.jsp
        
		
		boolean result = DepartmentDAO.editDepartment(z_departmentNo, z_departmentName);
		
		System.out.println(result);
		RequestDispatcher rd;
		
		//create the session for the particular client
		
		HttpSession hs = req.getSession(true);
		
		
		if(result)
		{
			req.setAttribute("message", "Updated Successfully");
			
			
			rd = req.getRequestDispatcher("jsp/DepartmentDetails.jsp");
			
			rd.forward(req, resp);
			
			
				
			
			
		}
		else
		{
			resp.sendRedirect("jsp/Error.jsp");
		}
	
	
		
		
		
		
		
		
	}
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(req, resp);
	}
	
}
