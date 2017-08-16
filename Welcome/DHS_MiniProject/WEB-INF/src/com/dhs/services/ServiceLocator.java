
/**
* Represents ServiceLocator Design Pattern 
* 
*   
**
@author R.RajaRao
* @version 1.0
*/

package com.dhs.services;

import java.sql.Connection;

import java.sql.DriverManager;


/**
 * 
 * @author R.Raja rao
 *
 */

public class ServiceLocator {

	
	/**
	 * Returns <code>Connection</code> interface implementation object to the native database 
     * based on the information such as url,username,password of the corresponding database
	 * @return a new default <code>Connection</code> object 
	 * @exception SQLException if a database access error occurs
	 */
	
	
	
	
	public static Connection getServerConnection()
	{
		
		
		System.out.println("inside server connector");
		
		
		
		
		Connection connection = null;
		
		
		try
		{
			
			//loading the corresponding driver class 
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			System.out.println("Driver loaded");
			
			
			//the following code will establish the connection to the underlying database using three parameters url,username,password
			
			
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pilotproject","root","admin");
		    
			System.out.println("Connection Established");
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}


	
	
}
