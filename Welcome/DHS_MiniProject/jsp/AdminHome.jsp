<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%
   String AdminName = "";
   HttpSession hs = request.getSession();

   
   
    if(hs==null)
    {
      response.sendRedirect("Error.jsp");
    }
    
    
    else
    {
      if(hs.getAttribute("valid").equals("yes"))
      {
       AdminName = (String)hs.getAttribute("AdminName");
      }
      else
      {
       response.sendRedirect("Error.jsp");
      }
    }
    System.out.println(AdminName);
    %>
    
<title>Admin Home</title>
<link href="../css/style2.css" rel="stylesheet" type="text/css"/>
</head>
<body> 
<div class="admin_main">
<ul>
<li><a href="EmployeeDetails.jsp" target="right">Employee&nbsp;Details</a></li>
 
 
 
 <li><a href="DepartmentDetails.jsp" target="right">Department Details</a></li>
 
 
 
 <li><a href="ChangeUserPass.jsp" target="right">Change PassWord</a></li>
 
</ul>
</div>
</body>
</html>