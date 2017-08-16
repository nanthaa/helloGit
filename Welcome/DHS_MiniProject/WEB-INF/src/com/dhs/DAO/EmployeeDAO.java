
/*
 * @(#)DepartmentDAO.java	
 *
 * Copyright 2010 DHSInformatics, Inc. All rights reserved.
 * DHS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
* Represents Data Access Object Design Pattern 
* All data access operation methods regarding Employee has been developed here  
**
@author R.RajaRao
* @version 1.0
*/



package com.dhs.DAO;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import com.dhs.services.ServiceLocator;

/**
 * 
 * @author R.Raja Rao
 *
 */


public class EmployeeDAO 

{
	
	
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	
	/**
	 * 
	 * @param employeeID EmployeeID to be added into database 
	 * @param employeeName Employeename  to be added into database
	 * @param departmentNo department number the employee belongs to
	 * @param salary  Salary of an Employee
	 * @return boolean
	 */
	
	public static boolean addEmployee(String employeeID,String employeeName,int departmentNo,double salary)
	{
		
		
		boolean flag = false;
		
		
		String query = "INSERT INTO m_employee VALUES('"+employeeID+"',  '"+employeeName+"',"+departmentNo+", '"+salary+"')";
		
		
		try 
		{
			
			connection = ServiceLocator.getServerConnection();
			
			statement = connection.createStatement();
			
			statement.executeUpdate(query);
			
			flag = true;
			
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getStackTrace());
			System.out.println(e);
		}		
		
		return flag;
	} 
	/**
	 * 
	 * @param employeeNo EmployeeID to be edited  
	 * @param employeeName EmployeeName to be edited
	 * @param departmentNo 
	 * @param salary   Salary to be edited
	 * @return boolean 
	 * <p> the following method will return true or false if the edition operation is successful</p>
	 * 
	 */
	
	public static boolean editEmployee(String employeeNo,String employeeName,int departmentNo,double salary)
	{
		boolean flag = false;
		
		
	
		
	  
	  
	  
		String query = "UPDATE m_employee set Emp_Name='"+employeeName+"',Dept_No="+departmentNo+",Salary="+salary+" where Emp_No="+employeeNo+" ";
		
		
		
		try
		{
			connection = ServiceLocator.getServerConnection();
			statement = connection.createStatement();
			statement.executeUpdate(query);
			flag = true;
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getStackTrace());
			System.out.println(e);
		}		
		
		return flag;
	}
	
	
	
	/**
	 * 
	 * @param employeeId EmployeeID to be deleted from database 
	 * @return
	 * @throws Exception
	 * The method used to delete employee from data base
	 * 
	 *  
	 */
	
	
	
	public static boolean deleteEmployee(int employeeId)throws Exception
	{
		
		boolean flag = false;
		
		String query="delete from m_employee where Emp_No="+employeeId+"";
		
		
		
		connection = ServiceLocator.getServerConnection();
		statement = connection.createStatement();
		int updateCount=statement.executeUpdate(query);
		
		System.out.println("updatecount"+updateCount);
		
		if(updateCount>0)
		{
			flag=true;
		}
		
		return flag;
	}
	
	
	
	
	
}
