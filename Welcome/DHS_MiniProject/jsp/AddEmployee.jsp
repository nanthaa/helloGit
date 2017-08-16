<%@ page errorPage="Error.jsp"  %>
<%@ page import="java.sql.*" %>
<%@ page import="com.dhs.services.ServiceLocator"  %>
 

<head>
  <script language="javascript">
  function validate()
  {
       if(document.AddEmployeeDetails.eid.value.length==0)
       {
         alert("Please Enter Employee Id");
         document.AddEmployeeDetails.eid.focus();
         return false;
       }
       if(document.AddEmployeeDetails.ename.value.length==0)
       {
         alert("Please Enter The Employee Name");
         document.AddEmployeeDetails.ename.focus();
         return false;
       }
       if(document.AddEmployeeDetails.salary.value.length==0)
       {
         alert("Please Enter Salary");
         document.AddEmployeeDetails.salary.focus();
         return false;
       }
        
      
      
     }  
        
   
   </script>
</head>


 <body>
<center>
    <form method="post" action="<%=request.getContextPath() %>/AddEmployee" name="AddEmployeeDetails" onsubmit="return validate()">
      <% 
       String AdminName = null;
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
    		   System.out.println(AdminName);
    	   }
    	   else
    	   {
    		   response.sendRedirect("Error.jsp");
    	   }
       }
     
       %>
     <br><br>

     
       
      <table   width="90%">
      <tr>
      <td></td><td><font color="green" size="5">New Employee Creation</font></br></br></td>
      </tr>
      
           <tr>
               <td width="20%"><font face="Verdana" size="2"><b>Employee ID</font></td>
               <td><input type="text" name="eid" size="25"></td>
          </tr>
       <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
       
               <tr>
                  <td><font face="Verdana" size="2"><b>Employee name</font></td>
                  <td><input type="text" name="ename" size="25"></textarea> </td>
               </tr>        
              
          <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
       
       <tr>
          <td width="20%"><font face="Verdana" size="2"><b>Department</font></td>
          
          
          <td><select name="dept">
          
             
					<option  value="0">Select Department<script>space(24)</script></option>
				<%!
					Connection connection = null;
					Statement statement = null;
					ResultSet resultSet = null;
				%>
				<%
				try
					{
						Connection connection = ServiceLocator.getServerConnection();
						
				
						statement=connection.createStatement();
						
						
						resultSet=statement.executeQuery("select Dept_No, Dept_Name from m_dept");
						
						
						while(resultSet.next())
							
						{
							String deptNo = resultSet.getString(1);
							String deptName = resultSet.getString(2);
						%>
							<option  value=<%=deptNo %>><%=deptName %><script>space(24)</script></option>	
						<%
						}
					}
				
				catch (Exception e){
					
					
				}%>
				</select>
         
          
          
          </td>
       </tr>
       
       <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
       
       <tr>
          <td width="20%"><font face="Verdana" size="2"><b>Salary</font></td>
          <td><input type="text" name="salary" size="25"></td>
       </tr>
       <tr></tr>
                 <tr></tr>
                  <tr></tr>
       
       
       <tr><td><td>
        <input type="submit" value="Submit" >&nbsp;&nbsp;
          <input type="reset" value="Reset">&nbsp;&nbsp;<INPUT TYPE="button" VALUE="Back" onClick="history.go(-1);return true;">
        </td>
       </tr>
        
       </table>
         <% String message;
              message = (String)request.getAttribute("message");
              if(message!=null)
              {
            	  System.out.println(message);
              %>
              
              <script type="text/javascript">
              alert("<%=message%>");
              </script>
              
              
              <%} %>
    
          
    </form>
    </center>
  </body>


</html>
