<%@ page import="java.sql.*" %>
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
<%
	String id=session.getAttribute("id").toString();
	ResultSet rs=(ResultSet)request.getAttribute("rs");
%>
<script type="text/javascript">
function hideMessage()
{
	document.getElementById("message").style.display="none"; 
}
function startTimer() 
{
	var tim = window.setTimeout("hideMessage()", 3000);  // 5000 milliseconds = 5 seconds
}
</script>

<style>#pageNavPosition{cursor:hand}</style>
<script type="text/javascript" src="<%=request.getContextPath() %>/Files/JS/pagination.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/contact.css" type="text/css"/>

<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/button.css" type="text/css"/>
</head>
<%
int no=convert(request.getParameter("no"));
if(no==1)
{ResultSet rs1=(ResultSet)request.getAttribute("rs1");
%>
<div class="gradientbuttons" style="position:absolute;top:20px;left:300px">
	<form action="<%=request.getContextPath() %>/AddContact1">
	Select The Contact No......
		<select name="contact">
			<%
				while(rs1.next())
				{
					%><option value="<%=rs1.getString(2) %>"><%=rs1.getString(2) %></option><%
				}
			%>
		</select>
		<input type="hidden" name="id" value="<%=id %>"></input>
		<input type="hidden" name="task" value="add1"></input>
		<input class="gradientbuttons" type="submit" value="add" style="position:absolute;top:30px;left:180px"></input>
	</form>
</div>
<%}
if(no==2)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:50px;left:50px">
	<p>You Have Successfully Added ...!!</p>
</div>
<%}
if(no==3)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:50px;left:50px">
	<p>OOP's Something Went Wrong ...!!</p>
</div>
<%}
if(no==4)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:50px;left:50px">
	<p>Sorry Select Atleast One.....!!</p>
</div>
<%}
if(no==5)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:50px;left:50px">
	<p>You Have Successfully Deleted ...!!</p>
</div>
<%}%>
<body onload="startTimer()">


<form action="<%=request.getContextPath() %>/DeleteContact">
<a class="gradientbuttons" href="<%=request.getContextPath() %>/AddContact?id=<%=id %>">Add</a></li>
<input class="gradientbuttons" type="submit" value="Delete"></input>
		<input type="hidden" name="id" value="<%=id %>"></input>
	</div>

	<table id="results">
	<tr>
		<th>Select</th>
		<th>Name</th>
		<th>Contact ID</th>
	</tr>
	<%
		while(rs.next())
		{
	%>
	<tr id="color">
		<td><input name="chk" type="checkbox" value="<%=rs.getInt(1) %>"></input></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		
	</tr>
	<%} %>
	
</table>
<div id="pageNavPosition"></div>
</form>

<script type="text/javascript"><!--
        var pager = new Pager('results', 5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script>
</body>
</html>