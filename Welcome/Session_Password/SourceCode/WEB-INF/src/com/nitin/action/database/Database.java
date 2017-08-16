/**
 * 
 */
package com.nitin.action.database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author Nitin Gudle
 *Feb 14, 2012 4:52:41 PM
 *Project:-SessionPwd
 *Package:-com.nitin.action.database
 *File:-DataBase.java
 */
public class Database 
{
	private static Database database=null;
	private Database()
	{
		
	}
	public static Database newInstance()
	{
		if(database==null)
		{
			database=new Database();
		}
		return database;	
	}
	public Connection connector(String path)
	{
		Connection con=null;
		try {
			Properties pro = new Properties();
			FileInputStream in=null;
			in = new FileInputStream(path+"\\Files\\Properties\\database.properties");
			pro.load(in);
			Class.forName(pro.getProperty("Driver"));
			System.out.println("Connection Established");
			con = DriverManager.getConnection(pro.getProperty("DBURL"),pro.getProperty("User"),pro.getProperty("Pass"));
			System.out.println("Connected" + con);

		} catch (Exception e) {
			System.out.println("Exception in serverconnector-->connector(): "+ e);
		}
		return con;
	}
}
