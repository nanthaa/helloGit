/**
 * 
 */
package com.nitin.DAO;

import java.sql.Connection;






import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import com.nitin.action.database.*;






/**
 * @author Nitin Gudle
 *Feb 14, 2012 4:32:38 PM
 *Project:-SessionPwd
 *Package:-com.nitin.DAO
 *File:-UserDAO.java
 */
public class UserDAO 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static UserDAO userDAO = null;
	private UserDAO()
	{
		
	}
	public static UserDAO initialize()
	{
		if(userDAO==null)
		{
			userDAO=new UserDAO();
		}
		return userDAO;
	}
	
	public boolean loginCheck(String user,String pass,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_userid='"+user+"' and u_pass='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->loginCheck(String user,String pass): "+ e);
		}
		return flag;
	}
	public boolean sessionPwdCheck(String user,String sessionPwd,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_userid='"+user+"' and sessionPass='"+sessionPwd+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User Login Status in Session : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->sessionPwdCheck(): "+ e);
		}
		return flag;
	}
	
	public boolean userCheck(String user,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_userid='"+user+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User Existence Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->userCheck(): "+ e);
		}
		return flag;
	}
	public boolean register(String [] values,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("insert into m_user (u_userid,u_pass,u_name,u_city,u_state,u_cell,u_email) values('"+values[1]+"','"+values[2]+"','"+values[0]+"','"+values[3]+"','"+values[4]+"','"+values[5]+"','"+values[6]+"')");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User register Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->register(): "+ e);
		}
		return flag;
	}
	public boolean addImages(String id,String no,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("update m_user set img_value='"+no+"' where u_userid='"+id+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->addImages(): "+ e);
		}
		return flag;
	}
	public ResultSet getUser(String id,String path)
	{
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_userid='"+id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getUser(): "+ e);
		}
		return resultSet;
	}
	
	public boolean insertSessionPass(String sessionPass,String id,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("update m_user set sessionPass='"+sessionPass+"' where u_userid='"+id+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Inser Session Password Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->insertSessionPass(): "+ e);
		}
		return flag;
	}
	public ResultSet getContacts(String u_userid,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_contact where u_userid='"+userDAO.getID(u_userid,path)+"'");
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getContacts(String u_userid): "+ e);
		}
		return resultSet;
	}
	public int getID(String u_userid,String path)
	{
		int ID=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select u_id from m_user where u_userid='"+u_userid+"'");
			while(resultSet.next())
			{
				ID=resultSet.getInt(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getID(String u_userid): "+ e);
		}
		return ID;
	}
	public static ResultSet getUser(String path)
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
			System.out.println("Exception in UserDAO-->getUser(): "+ e);
		}
		return resultSet;
	}
	public boolean contactCheck(String id,String u_userid,String path)
	{
		boolean flag=true;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			System.out.println("select * from m_contact where c_id='"+u_userid+"' and u_userid='"+userDAO.getID(id, path)+"'");
			resultSet = statement.executeQuery("select * from m_contact where c_id='"+u_userid+"' and u_userid='"+userDAO.getID(id, path)+"'");
			while(resultSet.next())
			{
				flag=false;
			}
			System.out.println("Contact Check Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->contactCheck( ): "+ e);
		}
		return flag;
	}
	public boolean addContact(String u_userid,String contact,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			System.out.println("insert into m_contact (c_name,c_id,u_userid) values('"+userDAO.getName(u_userid,path)+"','"+contact+"','"+userDAO.getID(u_userid,path)+"')");
			int i = statement.executeUpdate("insert into m_contact (c_name,c_id,u_userid) values('"+userDAO.getName(contact,path)+"','"+contact+"','"+userDAO.getID(u_userid,path)+"')");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getUser(): "+ e);
		}
		return flag;
	}
	public String getName(String u_userid,String path)
	{
		String name="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select u_name from m_user where u_userid='"+u_userid+"'");
			while(resultSet.next())
			{
				name=resultSet.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getID(String u_userid): "+ e);
		}
		return name;
	}
	public boolean deleteContact(int no,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from m_contact where id='"+no+"'");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->deleteContact(): "+ e);
		}
		return flag;
	}
	public ResultSet getMails(String u_userid,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_trans where t='"+u_userid+"'");
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getMails(String u_userid): "+ e);
		}
		return resultSet;
	}
	public boolean deleteMail(int no,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			System.out.println("-------delete from m_trans where t_id='"+no+"'");
			int i = statement.executeUpdate("delete from m_trans where t_id='"+no+"'");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->deleteMail(): "+ e);
		}
		return flag;
	}
	public String getDate()
	{
		String date="";
		try
		{
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy");
			date = formatter1.format(currentDate.getTime());
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getDate( ): "+ e);
		}
		return date;
	}
	public String getTime()
	{
		String time="";
		try
		{
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter1=new SimpleDateFormat("HH:mm:ss");
			time = formatter1.format(currentDate.getTime());
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getTime( ): "+ e);
		}
		return time;
	}
	public String getDay()
	{
		String day="";
		try
		{
			Calendar currentDate = Calendar.getInstance();
			int no=currentDate.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			if(no==1)
				day="Sunday";
			else if(no==2)
				day="Monday";
			else if(no==3)
				day="TUESDAY";
			else if(no==4)
				day="WEDNESDAY";
			else if(no==5)
				day="THURSDAY";
			else if(no==6)
				day="FRIDAY";
			else if(no==7)
				day="SATURDAY";
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getDay( ): "+ e);
		}
		return day;
	}
	public boolean sendMail(String from,String to,String sub,String msg,String day,String date,String time,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("insert into m_trans (frm,t,sub,msg,dy,dte,tim)values('"+from+"','"+to+"','"+sub+"','"+msg+"','"+day+"','"+date+"','"+time+"')");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->sendMail( ): "+ e);
		}
		return flag;
	}
	public ResultSet getProfile(String id,String path)
	{
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_userid='"+id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getProfile(String id): "+ e);
		}
		return resultSet;
	}
	public boolean editProfile(String id,String name,String mail,int cell,String city,String state,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("update m_user set u_name='"+name+"',u_city='"+city+"',u_state='"+state+"',u_cell='"+cell+"',u_email='"+mail+"' where u_userid='"+id+"'");
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
	public boolean confirm(String id,String opass,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			resultSet= statement.executeQuery("select * from m_user where u_userid='"+id+"' and u_pass='"+opass+"'");
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
	public boolean changePass(String id,String cpass,String path)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector(path);
			statement = connection.createStatement();
			int i = statement.executeUpdate("update m_user set u_pass='"+cpass+"' where u_userid='"+id+"'");
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
	
	
	public static void main(String adsf[]) throws SQLException
	{
		String path="E:\\SessionPwd";
		resultSet = getUser(path);
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(2));
		}
	}
}
