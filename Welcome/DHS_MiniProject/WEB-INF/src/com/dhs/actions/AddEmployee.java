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
 * @author R.RajaRao
 * This Servlet acts as a controller for Adding the new Employee
 * Here we will get the information about new department from the form add we class
 * <code>addEmployee</code> method in <code>EmployeeDAO to insert the new Employee
 *
 */



public class AddEmployee extends HttpServlet 
{

	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
			{
	
		
		
		//Get the data provided by the user in the  form
		
		  
		  String z_employeeId = req.getParameter("eid");
		

          String z_employeeName= req.getParameter("ename");

          String z_department = req.getParameter("dept"); 
          System.out.println("value of DEPT"+ z_department);
          
          

          String z_sal= req.getParameter("salary");
		
          
          //convert the data from string to integer
          
          double z_salary=Double.parseDouble(z_sal);
          
          int z_departmentNo=Integer.parseInt(z_department);
          
		
          RequestDispatcher rd;
           
          //add the new Employee into database
          
         boolean flag= EmployeeDAO.addEmployee(z_employeeId, z_employeeName, z_departmentNo, z_salary);
		
         
       //if we successfuly add the Employee transfer the control to EmployeeDetails.jsp otherwise Error.jsp
         
         
		if(flag)
		{
			req.setAttribute("message", "Added Successfully");
			
			rd = req.getRequestDispatcher("jsp/EmployeeDetails.jsp");
			rd.forward(req, resp);
			
		}
		else
		{
req.setAttribute("message", "Sorry Unable To Add Employee");
			
			rd = req.getRequestDispatcher("jsp/AddEmployee.jsp");
			rd.forward(req, resp);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	
	
}
