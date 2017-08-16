    
    
<%@ page errorPage="Error.jsp"  %>
<%@ page import="java.sql.*" %>
<%@ page import="com.dhs.services.*"  %>
    
<html>

<head>




<title>Insert title here</title>

</head>

<body>

<center><font color="red" size="5">Employee Details </font></center>

 <%-- --%>
<center>
<br><br>
       <br><br>
<form action="<%=request.getContextPath() %>/jsp/AddEmployee.jsp">
<table  cellpadding=4 cellspacing=0 border="1" >
 <th><font color="black" size="3">Employee ID</font></th>
        <th width="39" ><font color="black" size="3"> Name</font></th>
        
        <th width="150"><font color="black" size="3">Department</font></th>
           <th width="150"><font color="black" size="3">Salary</font></th>
        
        <th><font color="#100000"  size="4">Edit</font></th>
        <th><font color="#100000"  size="4">Delete</font></th>
 
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
        	   resultset = statement.executeQuery("select  e.Emp_No,e.Emp_Name,d.Dept_Name, e.Salary from m_employee e,m_dept d where d.Dept_No=e.Dept_No");
        	   
        	
        	   
        	   
        	   while(resultset.next())
        	   {
        		   int eid = resultset.getInt(1);
        		 
        		       		   String name = resultset.getString(2);
        		 
        		       		   String dept=resultset.getString(3);
        		       		   
        		   String salary= resultset.getString(4);
        		 
        		   %>
        		   
        		   
        		   
        		   
        		   
 <tr>
  <td width="55"><font face="Verdana" size="2" color="666600"><%=eid %></font></td>
        		   <td width="39"><div align="center"><font face="Verdana" size="2" color="666600"><%=name %></font></div></td>
        		   
        		   <td width="150"><div align="center"><font face="Verdana" size="2" color="666600"><%=dept %></font></div></td>
        		   
        		   <td width="150"><div align="center"><font face="Verdana" size="2" color="666600"><%=salary %></font></div></td>
        		   
        		  
        		   <td width="18"><div align="center"><font face="Verdana" size="2" color="#778899"><a href="<%=request.getContextPath() %>/jsp/EditEmployee.jsp?code=<%=eid%>" >Edit</a></font></div></td>
        		           		   <td width="18"><div align="center"><font face="Verdana" size="2" color="#778899"><a href="<%=request.getContextPath() %>/DeleteEmployee?eid=<%=eid%>" onClick="return confirm('Are you sure you want to delete the Employee?')">Delete</a></font></div></td>
        		   
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
            	  System.out.println("#########"+message);
              %>
              <p align="center"><font color="red" size="4"><%=message%></font></p>
              
              
              
              <%} %>

<br><br>
          <input type="submit" value="Add New Employee"> 
          
</center>
</form>

</body>

</html>