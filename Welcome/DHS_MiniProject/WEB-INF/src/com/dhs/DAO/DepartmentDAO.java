
/*
 * @(#)DepartmentDAO.java	
 *
 * Copyright 2010 DHSInformatics, Inc. All rights reserved.
 * DHS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
* Represents Data Access Object Design Pattern 
* All data access operation methods regarding Department has been developed here  
**
@author R.RajaRao
* @version 1.0
*/


package com.dhs.DAO;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;

import com.dhs.services.ServiceLocator;


public class DepartmentDAO 
{


	/**
	 * 
	 * @param departmentNo Department No
	 * @param departmentName Department Name to be changed
	 * @return boolean 
	 * the following method will return true or false if the edition operation is successful
	 */
	
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	
	
	public static boolean editDepartment(int departmentNo,String departmentName)
	{   
		
		
		//flag variable indicates whether edition is sucessful or not
		
		boolean flag = false;
		
		//Declare the connection reference variable
		
		Connection connection=null;
		
		
		try
		
		{
			
		//get the connection from servicelocator	
			
		connection = ServiceLocator.getServerConnection();
		
		
		
		//create the statement object from connection
		
		
		
			Statement statement=connection.createStatement();
			
			
		//creating the sql query for to edit the department 	
			
			
			String query="update m_dept set Dept_Name='"+departmentName+"' where Dept_No="+departmentNo+"";
			
			
			
			
			/*the following statement will execute the query against database and returns the integer
			  
			updateCount specifying how many records have been affected by the query in the
			
			database.If the updateCount value is zero then no rows have been affected that means edtion operation is not successful*/
			
			
			
			
		     int updateCount=	statement.executeUpdate(query);
		     
		     System.out.println("updatecount"+updateCount);
			
			 if(updateCount>0)
			 {
			
			  flag = true;
			  
			 }
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			
		}
		
		
		return flag;
		
		
	}
/**
 * 
 * @param departmentID Department No to be added newly
 * @param departmentName Department Name to be added newly
 * @return boolean if operation is successful
 */
	public static boolean addDepartment(int departmentID,String departmentName)
	{
		
		
		boolean flag = false;
		
		
		String query = "INSERT INTO m_dept VALUES('"+departmentID+"',  '"+departmentName+"')";
		
		
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
	 * @param deptId Department No to be deleted from DB
	 * @return boolean if operation is successful
	 * @throws Exception
	 */
	
	public static boolean deleteDepartment(int deptId)throws Exception
	{
		
		boolean flag = false;
		
		String query="delete from m_dept where Dept_No="+deptId+"";
		
		
		
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
