<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 
<script type="text/javascript">
function noBack(){window.history.forward();}
</script>

<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
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


<link href="../css/style2.css" rel="stylesheet" type="text/css"/>
</head>
<body onload="noBack();" onpageshow="if(event.persisted)noBack();" onunload="">
<table id="main" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
<div class="logo">
<img alt="logo" src="../images/logo.gif"/>
</div>
<div class="head" align="left">
<h1>  RealTime Pilot Project </h1>
</div>
</td>
</tr>
<tr class="bor">
<td>
<h2>Welcome,<%=AdminName%><a href="<%=request.getContextPath() %>/jsp/Signout.jsp" target="_top">[SignOut] </a> </span> </h2>
</td>
</tr>
</table>
</body>
</html>