/**
 * 
 */
package com.nitin.DAO;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.nitin.action.database.*;






/**
 * @author Nitin Gudle
 *Feb 14, 2012 4:32:51 PM
 *Project:-SessionPwd
 *Package:-com.nitin.DAO
 *File:-AdminDAO.java
 */
public class AdminDAO
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static AdminDAO adminDAO=null;
	private AdminDAO()
	{
		
	}
	public static AdminDAO initialize()
	{
		if(adminDAO==null)
		{
			adminDAO=new AdminDAO();
		}
		return adminDAO;
	}
	public boolean loginCheck(String admin,String pass,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where userid='"+admin+"' and password='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->loginCheck(String admin,String pass): "+ e);
		}
		return flag;
	}
	public static ResultSet getProfile(String id,String path)
	{
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where userid='"+id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->loginCheck(String admin,String pass): "+ e);
		}
		return resultSet;
	}
	public boolean editProfile(String id,String name,String mail,int cell,String city,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("update m_admin set a_name='"+name+"',a_city='"+city+"',a_cell='"+cell+"',a_email='"+mail+"' where userid='"+id+"'");
			if(i==1)
			{
				flag=true;
			}
			System.out.println("Edit Profile Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in editProfile(String id,String name,String mail,int cell,String city): "+ e);
		}
		return flag;
	}
	public boolean changePass(String id,String cpass,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("update m_admin set password='"+cpass+"' where userid='"+id+"'");
			if(i==1)
			{
				flag=true;
			}
			System.out.println("Change Passsword Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in changePass(String id,String cpass): "+ e);
		}
		return flag;
	}
	public boolean confirm(String id,String opass,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet= statement.executeQuery("select * from m_admin where userid='"+id+"' and password='"+opass+"'");
			if(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Confirm password Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in confirm(String id,String opass): "+ e);
		}
		return flag;
	}
	public ResultSet getUsers(String path)
	{
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user");
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->getUsers(): "+ e);
		}
		return resultSet;
	}
	public boolean deleteUser(int no,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from m_user where u_id='"+no+"'");
			if(i==1)
			{
				flag=true;
			}
			System.out.println("Delete User Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in deleteUser(): "+ e);
		}
		return flag;
	}
	public String getU_userid(String u_uid,String path)
	{
		String ID="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select u_userid from m_user where u_id='"+u_uid+"'");
			while(resultSet.next())
			{
				ID=resultSet.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getU_userid(String u_userid): "+ e);
		}
		return ID;
	}
	public static void main(String adsf[]) throws SQLException
	{
		String path="E:\\SessionPwd";
		resultSet = getProfile("admin",path);
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(2));
		}
	}
}
