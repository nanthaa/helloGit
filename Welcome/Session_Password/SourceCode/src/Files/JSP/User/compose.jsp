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
<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/form.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/button.css" type="text/css"/>
</head>
<%
	String id=session.getAttribute("id").toString();
	ResultSet rs1=(ResultSet)request.getAttribute("rs1");
%>
<%
int no=convert(request.getParameter("no"));
if(no==1)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:100px;left:290px">
	<p>  Successfully Sent ...!!</p>
</div>
<%}
if(no==2)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:100px;left:0px">
	<p>OOP's Something Went Wrong ...!!</p>
</div>
<%}%>
<body onload="startTimer()">
<form action="<%=request.getContextPath() %>/SendMail" method="post">
<input type="submit" value="Send" class="gradientbuttons" ></input>
<br></br>
	To <select name="to">
		<%
			while(rs1.next())
			{
				%><option value="<%=rs1.getString(3) %>"><%=rs1.getString(3) %></option><%
			}
		%>
	</select>
	<br></br>
	Subject
	<input type="text" name="sub"></input><br></br>
	<textarea name="msg" rows="12" cols="60"></textarea>
	<input type="hidden" value=<%=id %> name="from"></input>
</form>
</body>
</html>