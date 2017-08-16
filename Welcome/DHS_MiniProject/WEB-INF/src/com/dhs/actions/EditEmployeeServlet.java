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
 * @see EmployeeDAO
 * This Servlet acts as a controller for Edit the Employee information
 * 
 */
public class EditEmployeeServlet extends HttpServlet {

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		
		
		
		
		String employeeNo = request.getParameter("eid");//hidden input from editlocation.jsp

			String employeeName = request.getParameter("name");
	
			
			String department = request.getParameter("dept");
			
			int departmentNo= Integer.parseInt(department);
			
			//String sex = request.getParameter("u_sex");
			String sal = request.getParameter("sal");
			
			double salary=Double.parseDouble(sal);
			
			
			
			boolean result = EmployeeDAO.editEmployee(employeeNo, employeeName, departmentNo, salary);
			
			System.out.println(result);
			RequestDispatcher rd;
			HttpSession hs = request.getSession(true);
			
			String utype=(String)hs.getAttribute("usertype");
			if(result)
			{
				request.setAttribute("message", "Updated Successfully");
				
				
				rd = request.getRequestDispatcher("jsp/EmployeeDetails.jsp");
				
				rd.forward(request, response);
				
				
					
				
				
			}
			else
			{
				response.sendRedirect("jsp/Error.jsp");
			}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
// TODO Auto-generated method stub
doPost(req, resp);
}
	
}
