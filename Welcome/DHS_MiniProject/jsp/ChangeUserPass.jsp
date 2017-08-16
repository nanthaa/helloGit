

<html>
<body>
<script language="javascript">

	function window_Onload()
 	{
 	     document.changepasswordform.old_password.focus();
 	     document.changepasswordform.old_password.value="";
 	     document.changepasswordform.new_password.value="";
   	     document.changepasswordform.confirm_password.value="";
 	    
 	}
 	
 	function checkFormValidator()
 	{
 		 var xpw1 = document.changepasswordform.new_password.value;
    	var xpw2 = document.changepasswordform.confirm_password.value;
    
 		if(document.changepasswordform.old_password.value=="")
 		{
 			alert("Plese Enter your Old PassWord");
 			document.changepasswordform.old_password.focus();
 			return false;
 		}
 		
 		else if(document.changepasswordform.new_password.value=="")
 		{
 			alert("Plese Enter your New PassWord");
 			document.changepasswordform.new_password.focus();
 			return false;
 		}
 		
 		else if(document.changepasswordform.confirm_password.value=="")
 		{
 			alert("Plese Enter Confirm  PassWord");
 			document.changepasswordform.confirm_password.focus();
 			return false;
 		}
 		
 		
 		if (xpw1 != xpw2) 
		{
   			alert ("New & Confirm Pin Mismatch");
   			document.changepasswordform.new_password.value = "";
   			document.changepasswordform.confirm_password.value = "";
   			document.changepasswordform.new_password.focus();
   			document.changepasswordform.new_password.select();
   			return false;
   		} 
 		
 		
 				
 	}
javascript:window.history.forward(1);
	
</script>


<%!
	String userid="";
	String changepasswordstatus="";

%>

<%
	if(session.getAttribute("AdminName")==null)
	{
		//response.sendRedirect("SessionExpired.jsp");
		request.getRequestDispatcher("/Error.jsp").forward(request,response);
	}

	else
	{
		userid=(String)session.getAttribute("AdminName");		
	}

	changepasswordstatus=(String)request.getAttribute("passwordstatus");

%>

<center><font size="5" color="green">User Change PassWord</font></center><br></br>

<form name="changepasswordform" method="post" action="<%=request.getContextPath()%>/changePassword" onsubmit="return checkFormValidator()">


<%
	if(changepasswordstatus==null)
	{
		
		
		
	}

	else if(changepasswordstatus.equals("success"))
	{
		%>
		<script language="javascript">
		
			alert("Password Changed Succesfully!!!");
			
		</script>
<%
	}

	else if(changepasswordstatus.equals("failure"))
	{
		%>
		<script language="javascript">
		
			alert("Old Password Mismatch!!!");
			
		</script>
<%
	}
%>

<center>
  <table border="0" width="38%" align="center" height="147">
    <tr>
      <td><b><font face="Verdana" size="2">User ID</font></b></td>
      <td ><input type="text" name="user_id" size="20" value=<%=userid%> readonly></td>
    </tr>
    <tr>
      <td ><b><font face="Verdana" size="2">Old Password</font></b></td>
      <td ><input type="password" name="old_password" size="20"></td>
    </tr>
    <tr>
      <td ><b><font face="Verdana" size="2">New Password</font></b></td>
      <td ><input type="password" name="new_password" size="20"></td>
    </tr>
    <tr>
      <td ><b><font face="Verdana" size="2">Confirm Password</font></b></td>
      <td ><input type="password" name="confirm_password" size="20"></td>
    </tr>
    
      
    
  </table>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="Submit" name="B1">&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="reset" value="Reset" >&nbsp;&nbsp;&nbsp;&nbsp;<INPUT TYPE="button" VALUE="Back" onClick="history.go(-1);return true;">
</center>
</form>


</body>

</html>
