    
    
<%@ page errorPage="Error.jsp"  %>
<%@ page import="java.sql.*" %>
<%@ page import="com.dhs.services.*"  %>
    
<html>

<head>




<title>Insert title here</title>

</head>

<body>

<center><font color="green" size="5">Department Details </font></center>

 <%-- --%>
<center>
<br><br>
       <br><br>
<form action="<%=request.getContextPath() %>/jsp/AddDepartment.jsp">
<table  cellpadding=4 cellspacing=0 border="1" >
 <th><font color="black" size="3">Dept NO</font></th>
        <th width="39" ><font color="black" size="3">Dept Name</font></th>
        
        
        
        <th><font color="#100000"  size="3">Edit</font></th>
        <th><font color="#100000"  size="3">Delete</font></th>
 
 <tr>
  <%!
           Connection connection = null;
           Statement statement = null;
           ResultSet resultset = null;
           
           %>
  <%
           try
           {
        	   connection = ServiceLocator.getServerConnection();
        	   statement = connection.createStatement();
        	   resultset = statement.executeQuery("select * from m_dept");
        	   
        	   while(resultset.next())
        	   {
        		   int deptid = resultset.getInt(1);
        		 
        		       		   String deptname = resultset.getString(2);
        		 
        		       		  
        		       		   
        		   
        		 
        		   %>
 <tr>
  <td width="55"><font face="Verdana" size="2" color="666600"><%=deptid %></font></td>
        		   <td width="39"><div align="center"><font face="Verdana" size="2" color="666600"><%=deptname %></font></div></td>
        		   
        		  
        		   
        		  
        		   <td width="18"><div align="center"><font face="Verdana" size="2" color="#778899"><a href="<%=request.getContextPath() %>/jsp/EditDepartment.jsp?deptid=<%=deptid%>" >Edit</a></font></div></td>
        		           		   <td width="18"><div align="center"><font face="Verdana" size="2" color="#778899"><a href="<%=request.getContextPath() %>/DeleteDepartment?deptid=<%=deptid%>" onClick="return confirm('Are you sure you want to delete the Department?')">Delete</a></font></div></td>
        		   
 </tr>
 <%
        	   }
        	   
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
           }
           
           %>
 
</table>
<% String message;
              message = (String)request.getAttribute("message");
              if(message!=null)
              {
            	  System.out.println(message);
              %>
              <p align="center"><font color="red" size="4"><%=message%></font></p>
              
              
              
              <%} %>

<br><br>
          <input type="submit" value="Add New Department"> 
          
</center>


</body>

</html>