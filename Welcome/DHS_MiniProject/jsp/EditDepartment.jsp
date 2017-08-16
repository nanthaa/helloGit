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
      
      if(document.EditCityForm.name.value.length==0)
      {
        alert("please enter the city name");
        document.EditLocationForm.u_name.focus();
        return false;
      }
     
      if(document.EditCityForm.ctype.value.length==0)
      {
        alert("please enter the type of city");
        document.EditLocationForm.u_pin.focus();
        return false;
      }
      if(document.EditCitForm.rmk.value.length==0)
      {
        alert("please enter the user mobile");
        document.EditLocationForm.mno.focus();
        return false;
      }
     
      if(document.EditLocationForm.e_id.value.length==0)
      {
        alert("please enter the user email id");
        document.EditLocationForm.e_id.focus();
        return false;
      }
     }
        
 
 
 
   </script> 



</head>
<body>


 <center>
     <form method="post" action="<%=request.getContextPath() %>/EditDepartment" name="EditCategoryForm">
     
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
       
       <% String deptID = request.getParameter("deptid"); 
     %>
        
        <%
        Integer i=new Integer(deptID);
        int deptId=i.intValue();
        
        %>
       <input type="hidden" name="lname" value="<%=deptId%>">
       
       <%
          try{
        	  connection = ServiceLocator.getServerConnection();
        	  statement  = connection.createStatement();
        	  resultset  = statement.executeQuery("select Dept_No,Dept_Name from m_dept where Dept_No="+deptId+"");
        	  
        	 while(resultset.next())
        	 {
        		 
        		 String departmentid = resultset.getString(1);
        		 String departmentName = resultset.getString(2);
        		 
        		
        		 
        		 
        %>
        
        <tr>
                  <td><font color="red" size="5">Enter Department Details</font></td>
                  <br><br><br>
               </tr>
         <table>
                                            
               <tr>
                  <td><font face="Verdana" size="2"><b>Department ID</font></td>
                  <td><input type="text" name="deptId" value="<%=departmentid%>" readonly="readonly"></td>
               </tr>
               
               <tr>
                  <td><font face="Verdana" size="2"><b>Employee name</font></td>
                  <td><input type="text" name="deptName" value="<%=departmentName%>"></td>
               </tr>
               
               
               
              
                
               
                 
         </table>
                <br>
                <input type="submit" value="Update" onClick="return validate()">
                &nbsp&nbsp <input type="reset" value="Reset"><INPUT TYPE="button" VALUE="Back" onClick="history.go(-1);return true;">
                
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