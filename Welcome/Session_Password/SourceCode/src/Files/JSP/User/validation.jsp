<%@ page import="com.nitin.DAO.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.nitin.util.*" %>
<%@ page import="java.io.*" %>
<html>
<%! 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 
%>
<head>
<style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #A9BCF5;
}
</style>
<%
String id=session.getAttribute("id").toString();
Properties pro = new Properties();
Properties pro1 = new Properties();
FileInputStream in=null;
FileInputStream in1=null;
try
{
	in = new FileInputStream(request.getRealPath("")+"\\Files\\Properties\\"+id+".properties");
	in1 = new FileInputStream(request.getRealPath("")+"\\Files\\Properties\\lables.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);
pro1.load(in1);
%>
</head>
<%
int no=convert(request.getParameter("no"));
if(no==12)
{%>
	<p><%=pro1.getProperty("InvalidSessionPwd") %></p>
<%}
%>
<body>
<%
	String img_value="";
	String path=request.getRealPath("");
	UserDAO userDAO = UserDAO.initialize();
	ResultSet rs= userDAO.getUser(id,path);
	while(rs.next())
	{
		img_value=rs.getString(5);
	}
	Vector v=GetImages.getImageNames(request.getRealPath(""),id);
	Collections.shuffle(v);
	int count=1;
	for(int i=0;i<v.size();i++)
	{
		%>
		  	<img border="1" height="80" width="80" src="<%=request.getContextPath() %>/Files/Pimages/<%=v.get(i) %>">
		<%
		if(count%2==0)
			%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
		count++;
//			out.println(pro.getProperty((String)v.get(i))); //  prints code of each image
	}
	%></br><%
	int rows=img_value.length();
	int cols=img_value.length();
	int[][] data=new int[rows][cols];
	Random random=new Random();
	%>
		<table class="gridtable" border=1>
		<tr>
	<%
	for (int i = 0; i < rows; i++) 
	{
        for (int j = 0; j < cols; j++) 
        {
        	%><td><%
        	data[i][j]=random.nextInt(9);
       		out.print(data[i][j]);
        	%></td><%
        }
        %></tr><%
	}
	if(v.size()==2)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int pass=data[a-1][b-1];
		String sessionPass=new Integer(pass).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
	else if(v.size()==4)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int c=Integer.parseInt(pro.getProperty((String)v.get(2)));
		int d=Integer.parseInt(pro.getProperty((String)v.get(3)));
		int pass=data[a-1][b-1];
		int pass1=data[c-1][d-1];
		String sessionPass=new Integer(pass).toString();
		sessionPass+=new Integer(pass1).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
	else if(v.size()==6)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int c=Integer.parseInt(pro.getProperty((String)v.get(2)));
		int d=Integer.parseInt(pro.getProperty((String)v.get(3)));
		int e=Integer.parseInt(pro.getProperty((String)v.get(4)));
		int f=Integer.parseInt(pro.getProperty((String)v.get(5)));
		int pass=data[a-1][b-1];
		int pass1=data[c-1][d-1];
		int pass2=data[e-1][f-1];
		String sessionPass=new Integer(pass).toString();
		sessionPass+=new Integer(pass1).toString();
		sessionPass+=new Integer(pass2).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
	else if(v.size()==8)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int c=Integer.parseInt(pro.getProperty((String)v.get(2)));
		int d=Integer.parseInt(pro.getProperty((String)v.get(3)));
		int e=Integer.parseInt(pro.getProperty((String)v.get(4)));
		int f=Integer.parseInt(pro.getProperty((String)v.get(5)));
		int g=Integer.parseInt(pro.getProperty((String)v.get(6)));
		int h=Integer.parseInt(pro.getProperty((String)v.get(7)));
		int pass=data[a-1][b-1];
		int pass1=data[c-1][d-1];
		int pass2=data[e-1][f-1];
		int pass3=data[g-1][h-1];
		String sessionPass=new Integer(pass).toString();
		sessionPass+=new Integer(pass1).toString();
		sessionPass+=new Integer(pass2).toString();
		sessionPass+=new Integer(pass3).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
%>
</table>
	<form method="post" action="<%=request.getContextPath() %>/UserLogin1">
	Session Password
		<input type="text" size="4" name="sessionPwd" required="yes"></input>
		<input type="submit" value="Login"></input>
	</form>
</body>
</html>