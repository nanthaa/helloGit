
/*
 * @(#)AdminstratorDAO.java	
 *
 * Copyright 2010 DHSInformatics, Inc. All rights reserved.
 * DHS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
* Represents Data Access Object Design Pattern 
* All data access operation methods regarding Administrator has been developed here  
**
@author R.RajaRao
* @version 1.0
*/

package com.dhs.DAO;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.Statement;

import com.dhs.services.ServiceLocator;

public class AdministratorDAO 
{

	
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	
	/**
	 * 
	 * @param adminUserName 
	 * @param adminPassword
	 * @return boolean
	 * 
	 * The following method used to check whether the user is in DB or Not.if user is registerd
	 * then it will return true otherwise false
	 * 
	 * 
	 */
	
	
	public static boolean checkAdminUser(String adminUserName,String adminPassword)
	{
		boolean flag = false;
				
		try {
			 connection = ServiceLocator.getServerConnection();
			 statement = connection.createStatement();
			 resultSet = statement.executeQuery("select * from m_admin where Admin_Id='"+adminUserName+"' and Admin_Pass='"+adminPassword+"' ");
			if(resultSet.next())
			{
				
					flag = true;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
		return flag;
	}
	
	/**
	 * 
	 * @param AdminId  Admin userd id
	 * @param oldPassword Admin user old password
	 * @param newPassword  Admin User New password to be changed
	 * @return boolean
	 * The following method used to change the pass word of existing admin user
	 * 
	 */
	
	public static boolean changePassword(String AdminId,String oldPassword,String newPassword)
	{
		boolean flag = false;		
		
		String sql = "UPDATE m_admin set Admin_Pass='"+newPassword+"' where Admin_Pass='"+oldPassword+"' and Admin_Id ='"+AdminId+"'  ";
		try {
			connection = ServiceLocator.getServerConnection();
			
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery("select * from m_admin");
			
			while(resultSet.next())
			{
				if(oldPassword.equals(resultSet.getString(2)))
				{
					flag = true;
				}
			}
			if(flag)
			{
				statement.executeUpdate(sql);
			}			
			
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getStackTrace());
			System.out.println(e);
		}		
		
		return flag;
	}
	
}
