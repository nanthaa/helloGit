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
 * @author Raja Rao.R
 * @version 1.0
 * @see DepartmentDAO
 * This Servlet acts as a controller to Delete The information of Department
 * 
 */


public class DeleteDepartmentServlet extends HttpServlet {

	
	
	/**
	 * 
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
		
		
		RequestDispatcher rd;
		try{
			
			
			//Get the departmentid to be deleted by user in the  form
			
			String deptId=req.getParameter("deptid");
			
			
			//convert the data from string to integer
			
			int deptID=Integer.parseInt(deptId);
			
			System.out.println("inside delete");
			
			//delete the department
			
			boolean flag=DepartmentDAO.deleteDepartment(deptID);
			
			
			//if deletion is successful go to DepartmentDetails.jsp otherwise Error.jsp
			
			if(flag)
			{
				
				req.setAttribute("message", "Department Deleted Successfulyy");
				
				 rd=req.getRequestDispatcher("/jsp/DepartmentDetails.jsp");
				
				rd.forward(req, resp);
				
			}
			
			
			
		}catch (Exception e) {
			
			req.setAttribute("message", "Sorry We Can't Delete The Department Unless We delete the child rows from Employee Table ");
			 rd=req.getRequestDispatcher("/jsp/DepartmentDetails.jsp");
			 rd.forward(req, resp);
			
			// TODO: handle exception
			
			e.printStackTrace();
			
			
			
		}
			
	
			
			
			
			
	}
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	
}
