<%@ page errorPage="Error.jsp"  %>
<%@ page import="java.sql.*" %>
<%@ page import="com.dhs.services.ServiceLocator"  %>
 

<head>
  <script language="javascript">
  function validate()
  {
       if(document.AddDepartmentDetails.deptId.value.length==0)
       {
         alert("Please Enter Department Id");
         document.AddDepartmentDetails.deptId.focus();
         return false;
       }
       if(document.AddDepartmentDetails.deptName.value.length==0)
       {
         alert("Please Enter The Employee Name");
         document.AddDepartmentDetails.deptName.focus();
         return false;
       }
       
        
      
      
     }  
        
   
   </script>
</head>


 <body>
<center>
    <form method="post" action="<%=request.getContextPath() %>/AddDepartment" name="AddDepartmentDetails" onsubmit="return validate()">
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
      <td></td><td><font color="green" size="5">New Department Creation</font></br></br></td>
      </tr>
      
           <tr>
               <td width="20%"><font face="Verdana" size="2"><b>Department ID</font></td>
               <td><input type="text" name="deptId" size="25"></td>
          </tr>
       <tr></tr>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
       
               <tr>
                  <td><font face="Verdana" size="2"><b>Department name</font></td>
                  <td><input type="text" name="deptName" size="25"></textarea> </td>
               </tr>        
              
          
      
       
       
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
