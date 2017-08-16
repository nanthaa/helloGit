package com.dhs.actions;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhs.DAO.DepartmentDAO;
import com.dhs.DAO.EmployeeDAO;
/**
 * 
 * @author R.RajaRao
 * This Servlet acts as a controller for Adding the new department
 * Here we will get the information about new department from the form add we class
 * <code>addDepartment</code> method in <code>DepartmentDAO to insert the new department
 *
 */


public class AddDepartmentServlet extends HttpServlet 
{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	    boolean  flag=false;
		
		
		
		//Get the data provided by the user in the  form
		
		 String deptId = req.getParameter("deptId");

	 
         String z_departmentName= req.getParameter("deptName");
         
         //convert the data from string to integer
         
         int z_departmentId=Integer.parseInt(deptId);
                  
		
         RequestDispatcher rd;
          
        
         //add the new department into database
         
         
         
    flag=  DepartmentDAO.addDepartment(z_departmentId, z_departmentName);
        
        
        //if we successfuly add the department transfer the control to DepartmentDetails.jsp otherwise Error.jsp
        
		if(flag)
		{
			req.setAttribute("message", "Added Successfully");
			
			rd = req.getRequestDispatcher("jsp/DepartmentDetails.jsp");
			rd.forward(req, resp);
			
		}
		else
		{
			
			
req.setAttribute("message", "Sorry Unable To Add New Department");
			
			rd = req.getRequestDispatcher("jsp/AddDepartment.jsp");
			rd.forward(req, resp);
		}
		
		
		
		
		
	}
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}
	
	
}
