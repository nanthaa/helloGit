<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script language="javascript">
   function validate()
   {
    if(document.AdminLoginForm.username.value.length==0)
    {
      alert("please enter the Admin UserID");
      document.AdminLoginForm.username.focus();
      return false;      
    }
    
    if(document.AdminLoginForm.adminpassword.value.length==0)
    {
      alert("please enter the admin password");
      document.AdminLoginForm.adminpassword.focus();
      return false;
    }
     
   }
 
  </script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style2.css" rel="stylesheet" type="text/css"/>
</head>
<body>


<table id="main" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
<div class="logo">
<img alt="logo" src="images/logo.gif"/>
</div>
<div class="head" align="left">
<h1> DHS RealTime Pilot Project</h1>
</div>
</td>
</tr>
<tr>
<td height="470">
<div class="content">
<br></br><br></br><br></br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>This Project depicts the real MVC Architecture for the beginners in JEE </b><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Environment</b>
<br>
</br>
<br>
</br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>JSP's acts as View Components Servlets Act as Controller and Java Classes  </b>
<br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>acts as Model components</b>
</div>
<div class="login">
<div class="inlogin">
<div> <h2> Login in with your <br /> <span> DHS account </span> </h2> </div>

 
<form name="AdminLoginForm" action="login" onsubmit="return validate();">
<label> Username: </label>
<input type="text" name="username" size="20px">
<h3> part@example.com </h3>
<label> Password: </label>
<input type="password" name="adminpassword" size="20px">
<input align="middle" class="submit" type="submit" value="submit"/>
</form>


</div>
</div>
</td>
</tr>
<tr>
<td align="center" height="50" class="foot">
<div>
<p> &copy; 2011 celestial v solutions </p>
</div>
</td>
</tr>
</table>
</body>
</html>