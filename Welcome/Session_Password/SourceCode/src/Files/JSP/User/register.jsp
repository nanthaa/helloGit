<%@ page import="java.util.*" %>
<%@ page import="com.nitin.util.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
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
<script type="text/javascript">
function hideMessage()
{
	document.getElementById("message").style.display="none"; 
}
function startTimer() 
{
	var tim = window.setTimeout("hideMessage()", 5000);  // 5000 milliseconds = 5 seconds
}
</script>
<%
Properties pro = new Properties();
FileInputStream in=null;
String path=request.getRealPath("");
try
{
	in = new FileInputStream(path+"\\Files\\Properties\\register.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);
%>
<link href="<%=request.getContextPath() %>/Files/CSS/style.css" rel="stylesheet" type="text/css" />
</head>
<%
int no=convert(request.getParameter("no"));
int no1=convert(request.getParameter("no1"));
if(no==1)
{
	%> <form action="<%=request.getContextPath() %>/StoreImage"><%
	String id=request.getParameter("id");
	String type=request.getParameter("type");
	Vector v=new Vector();
	if(type.equalsIgnoreCase("color"))
		v=GetImages.getImages();
	else
		v=GetImages.getImages(id);
	Vector v1=new Vector();
	for(int i=0;i<no1;i++)
	{
		%><img height="100" width="100" src="<%=request.getContextPath() %>/Files/Pimages/<%=v.get(i) %>">&nbsp;&nbsp;&nbsp;	
		<%v1.add(v.get(i));
	}
	%><br><%
	for(int i=0;i<no1;i++)
	{
		%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 	<input type="text" name="i<%=i %>" size="1">
	 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<%
	}
	session.setAttribute("v",v1);
	%>
	<br>
	<input type="hidden" name="id" value="<%=id %>"></input>
	<input type="submit"></input>
</form>
<%}

else if(no==5)
{%>
	<%=pro.getProperty("SuccessMSG") %>
<%}
else
{
	if(no==4)
	{%>
		<div class="downarrowdiv" id="message">
			<p><%=pro.getProperty("SuccessMSG") %></p>
		</div>
	<%}%>
<body onload="startTimer()">
<form action="<%=request.getContextPath() %>/RegisterUser">
<table>
<tr>
	<td><%=pro.getProperty("UserName") %></td><td><input type="text" name="uname" ></input></td>
</tr>
<tr>
	<td><%=pro.getProperty("UserID") %></td><td><input type="text" name="uid" required="yes"></input></td>
</tr>
<tr>
	<td>
		<%=pro.getProperty("SelectType") %>
	</td>
	<td>
		<%=pro.getProperty("Type1") %><input type="radio" value="color" name="type" checked></input>
		<%=pro.getProperty("Type2") %><input type="radio" value="picture" name="type"></input>
	</tr>
<tr>
	<td><%=pro.getProperty("SelectNoOfImages") %></td>
	<td>
		<select name="select">
			<option value="2"><%=pro.getProperty("Two") %></option>
			<option value="4"><%=pro.getProperty("Four") %></option>
			<option value="6"><%=pro.getProperty("Six") %></option>
			<option value="8"><%=pro.getProperty("Eight") %></option>
		</select>
	</td>
</tr>
<tr>
	<td><%=pro.getProperty("UserPass") %></td><td><input type="password" name="pass" ></input></td>
</tr>
<tr>
	<td><%=pro.getProperty("City") %></td><td><input type="text" name="city" ></input></td>
</tr>
<tr>
	<td><%=pro.getProperty("State") %></td><td><input type="text" name="state" ></input></td>
</tr>
<tr>
	<td><%=pro.getProperty("ContactNo") %></td><td><input type="text" name="cno" ></input></td>
</tr>
<tr>
	<td><%=pro.getProperty("Email") %></td><td><input type="text" name="mail" ></input></td>
</tr>
<tr>
	<td>&nbsp;</td><td><input type="submit" ></input></td>
</tr>
</table>
</form>
<%
}
%>
</body>
</html>