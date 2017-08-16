<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
       
<%@ page errorPage="Error.jsp"  %>
<%@ page import="java.sql.*" %>
<%@ page import="com.dhs.services.*"  %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <script language="javascript">
   
     function validate()
     {
      
      if(document.EditEmp.name.value.length==0)
      {
        alert("please enter the Employee name");
        document.EditLocationForm.u_name.focus();
        return false;
      }
     
     
      if(document.EditEmp.eid.value.length==0)
      {
        alert("please enter the Employee ID");
        document.EditLocationForm.eid.focus();
        return false;
      }
     
      if(document.EditEmp.dept.value.length==0)
      {
        alert("please enter the Department");
        document.EditLocationForm.dept.focus();
        return false;
      }
     }
        
 
 
 
   </script> 



</head>
<body>


 <center>
     <form method="post" name="EditEmp" action="<%=request.getContextPath() %>/EditEmployee" name="EditCategoryForm">
     
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
       <%!
         Connection connection = null;
         Statement statement = null;
         ResultSet resultset = null;         
       %>
       
       <% String codee = request.getParameter("code"); 
     %>
        
        <%
        Integer i=new Integer(codee);
        int code=i.intValue();
        
        %>
     
       
       <%
          try{
        	  connection = ServiceLocator.getServerConnection();
        	  statement  = connection.createStatement();
        	  resultset  = statement.executeQuery("select Emp_No,Emp_Name,Dept_No,Salary from m_employee where Emp_No='"+code+"'");
        	  
        	 while(resultset.next())
        	 {
        		 
        		 String eid = resultset.getString(1);
        		 String ename = resultset.getString(2);
        		 
        		 String dept = resultset.getString(3);
        		 String salary= resultset.getString(4);
        		 
        		 
        %>
        
        <center><font color="green" size="5">Enter Employee Details</font></center><br></br>
        <table>
       
 
                                            
               <tr>
                  <td><font face="Verdana" size="2"><b>Employee ID</font></td>
                  <td><input type="text" name="eid" value="<%=code%>" readonly="readonly"></td>
               </tr>
               <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
               <tr>
                  <td><font face="Verdana" size="2"><b>Employee name</font></td>
                  <td><input type="text" name="name" value="<%=ename%>"></td>
               </tr>
               
              <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
               
               <tr>
                  <td><font face="Verdana" size="2"><b>Department name</font></td>
                  <td><select name="dept">
          
             
					<option  value="0">Select Department<script>space(24)</script></option>
				<%!
					
				%>
				<%
				try
					{
						Connection connection = ServiceLocator.getServerConnection();
						
				
						statement=connection.createStatement();
						
						
						resultset=statement.executeQuery("select Dept_No, Dept_Name from m_dept");
						
						
						while(resultset.next())
							
						{
							String deptNo = resultset.getString(1);
							String deptName = resultset.getString(2);
						%>
							<option  value=<%=deptNo %>><%=deptName %><script>space(24)</script></option>>	
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
                  <td><font face="Verdana" size="2"><b>Salary</font></td>
                  <td><input type="text" name="sal" value="<%=salary%>"> </td>

               </tr> 
                
               <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
                 
         </table>
                <br>
                <input type="submit" value="Update" onClick="return validate()">
                &nbsp&nbsp <input type="reset" value="Reset">&nbsp;&nbsp;<INPUT TYPE="button" VALUE="Back" onClick="history.go(-1);return true;">
                
                <%   
        	 }
        	 
        	  
          }catch(Exception e)
          {
        	  e.printStackTrace();
          }
           
       %>
       

     </form>
    </center>


</body>
</html>