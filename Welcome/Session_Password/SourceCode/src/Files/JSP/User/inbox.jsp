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
<style>#pageNavPosition{cursor:hand}</style>
<script type="text/javascript" src="<%=request.getContextPath() %>/Files/JS/pagination.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/inbox.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/button.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/style.css" type="text/css"/>
<script src="<%=request.getContextPath() %>/Files/JS/jquery-1.6.4.min.js"></script>
<link href="<%=request.getContextPath() %>/Files/CSS/mail.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript">
$(function() {
	//slidetoggle
	$('.toggler').click(function(){
		$(this).parents(".mymail").children('.toggleMe').slideToggle('fast');
		return false; //ensures no anchor jump
	});
});
</script>
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
int no=convert(request.getParameter("no"));
if(no==1)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:200px">
	<p>OOP's Select Atleast One...!!</p>
</div>
<%}
if(no==2)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:200px">
	<p>Mail Deleted Successfully ...!!</p>
</div>
<%}%>
</head>
<body onload="startTimer()">
<%
	String id=session.getAttribute("id").toString();
	ResultSet rs=(ResultSet)request.getAttribute("rs");
%>
<form action="<%=request.getContextPath() %>/DeleteMail">
<input class="gradientbuttons" type="submit" value="Delete" class="gradientbuttons" ></input>
<input type="hidden" name="id" value="<%=id %>"></input>
<input type="hidden" name="task" value="delete"></input>
<a class="gradientbuttons" href="<%=request.getContextPath() %>/Compose?id=<%=id %>">Compose</a>

	<table id="results">
	<tr>
		<th>Select</th>
		<th>Message</th>
		<th>From</th>
		<th>Subject</th>
		<th>Day</th>
		<th>Date</th>
		<th>Time</th>
			
	</tr><div id="container">
	<%
		while(rs.next())
		{
			%>
			<tr id="color">
			<td><input name="chk" type="checkbox" value="<%=rs.getInt(1) %>"></input></td>
			<td><div class="mymail"><p><a href="#" class="toggler">Click To Read</a></p>
				<div class="toggleMe">
        			<%=rs.getString(5) %>
    			</div>
 			</div></td>
				
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getString(4) %></td>
				<td><%=rs.getString(6) %></td>
				<td><%=rs.getString(7) %></td>
				<td><%=rs.getString(8) %></td>
				
			</tr>
			
			<%
		}
	%>
</div>
</table>
</form>
<div id="pageNavPosition"></div>
<script type="text/javascript"><!--
        var pager = new Pager('results', 5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script>
</body>
</html>