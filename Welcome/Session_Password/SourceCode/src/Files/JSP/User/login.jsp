<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.nitin.util.*" %>
<html>
<%! 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 
%>
<head>
<%
Properties pro = new Properties();
FileInputStream in=null;
String path=request.getRealPath("");
try
{
	in = new FileInputStream(path+"\\Files\\Properties\\lables.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);
%>
<style>
#login
{
	
	background:-moz-linear-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));
    background:-webkit-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));
	border:50px solid #eee;
	width:350px;
	-moz-border-radius:5px;
	-webkit-border-radius:5px;
	border-radius:5px;
	-moz-box-shadow:0 0 10px #4e707c;
	-webkit-box-shadow:0 0 10px #4e707c;
	box-shadow:0 0 10px #4e707c;
	text-align:center;
	position:relative;
	}
	#login a, #login a:visited{color:#0283b2;}
	#login a:hover{color:#111;}
	#login h1{
	background:-moz-linear-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));
    background:-webkit-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));
	color:#5BACC4;
	text-shadow:#007dab 0 1px 0;
	font-size:14px;
	padding:18px 23px;
	margin:0 0 1.5em 0;
	border-bottom:1px solid #007dab;
	}
	#login .field{
	border:10px solid #585858;
	color:white;
	width:180px;
	font-size:12px;
	line-height:1.5em;
	padding:4px;
	-moz-box-shadow:inset 0 0 5px #ccc;
	-webkit-box-shadow:inset 0 0 5px #ccc;
	box-shadow:inset 0 0 50px #000000;
	}	
	#login div.submit label{float:none;display:inline;font-size:11px;}
	#login button{
	border:0;
	padding:0 30px;
	height:30px;
	line-height:30px;
	text-align:center;
	font-size:12px;
	color:#fff;
	text-shadow:#007dab 0 1px 0;
	background:-moz-linear-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));
    background:-webkit-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));
	-moz-border-radius:50px;
	-webkit-border-radius:50px;
	border-radius:50px;
	cursor:pointer;
	}
</style>
</head>
<%
int no=convert(request.getParameter("no"));
if(no==10)
{%>
	<div class="downarrowdiv" id="message">
		<p><%=pro.getProperty("Invalid") %></p>
	</div>
<%
Vector v=GetImages.getImages("");
Vector v1=new Vector();
for(int i=0;i<5;i++)
{
	%>
	  	&nbsp;&nbsp;<img height="50" width="50" src="<%=request.getContextPath() %>/Files/Visual/<%=v.get(i) %>">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%v1.add(v.get(i));
}%>
<body onload="startTimer()">
	<form name="f1" id="login" method="post" action="<%=request.getContextPath() %>/UserLogin"> 
	    <h1><%=pro.getProperty("LoginHeader_U") %></h1>
    	<div>
    		<%=pro.getProperty("T1_U") %>
    		<input type="text" name="username" id="login_username" required="yes"  />
    		<input type="hidden" name="no" value="2"/>
    	</div>			
	    <div>
    		<%=pro.getProperty("T2_U") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<input type="password" name="password" id="login_password" required="yes"  /><br>
    		<%=pro.getProperty("T3_U") %>
    		<input type="text" name="code" id="login_username" required="yes"  />
    	</div>			
		<p class="forgot"><%=pro.getProperty("SignUp") %>
						<a href="<%=request.getContextPath() %>/UserLogin?no=1">
						<%=pro.getProperty("SignUpLink") %></a></p>
    	
    	<div class="submit">
        	<button type="submit"><%=pro.getProperty("Submit") %></button>   
		    <label>
        		<input type="checkbox" name="remember" id="login_remember" value="yes" />
	           <%=pro.getProperty("Remember") %>
        	</label>   
    	</div>
</form>

<%session.setAttribute("v",v1);
}
else if(no==11)
{%>
	<div class="downarrowdiv" id="message">
		<p><%=pro.getProperty("InvalidCode") %></p>
	</div>
<%
Vector v=GetImages.getImages("");
Vector v1=new Vector();
for(int i=0;i<5;i++)
{
	%>
	  	&nbsp;&nbsp;<img height="50" width="50" src="<%=request.getContextPath() %>/Files/Visual/<%=v.get(i) %>">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%v1.add(v.get(i));
}%>
<body onload="startTimer()">
	<form name="f1" id="login" method="post" action="<%=request.getContextPath() %>/UserLogin"> 
	    <h1><%=pro.getProperty("LoginHeader_U") %></h1>
    	<div>
    		<%=pro.getProperty("T1_U") %>
    		<input type="text" name="username" id="login_username" required="yes"  />
    		<input type="hidden" name="no" value="2"/>
    	</div>			
	    <div>
    		<%=pro.getProperty("T2_U") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<input type="password" name="password" id="login_password" required="yes"  /><br>
    		<%=pro.getProperty("T3_U") %>
    		<input type="text" name="code" id="login_username" required="yes"  />
    	</div>			
		<p class="forgot"><%=pro.getProperty("SignUp") %>
						<a href="<%=request.getContextPath() %>/UserLogin?no=1">
						<%=pro.getProperty("SignUpLink") %></a></p>
    	
    	<div class="submit">
        	<button type="submit"><%=pro.getProperty("Submit") %></button>   
		    <label>
        		<input type="checkbox" name="remember" id="login_remember" value="yes" />
	           <%=pro.getProperty("Remember") %>
        	</label>   
    	</div>
</form>

<%session.setAttribute("v",v1);
}
else
{%>
<body onload="startTimer()">
	<form name="f1" id="login" method="post" action="<%=request.getContextPath() %>/UserLogin"> 
	    <h1><%=pro.getProperty("LoginHeader_U") %></h1>
    	<div>
    		<%=pro.getProperty("T1_U") %>
    		<input type="text" name="username" id="login_username" required="yes"  />
    		<input type="hidden" name="no" value="0"/>
    	</div>			
	    <div>
    		<%=pro.getProperty("T2_U") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<input type="password" name="password" id="login_password" required="yes"  />
    	</div>			
		<p class="forgot"><%=pro.getProperty("SignUp") %>
						<a href="<%=request.getContextPath() %>/UserLogin?no=1">
						<%=pro.getProperty("SignUpLink") %></a></p>
    	
    	<div class="submit">
        	<button type="submit"><%=pro.getProperty("Submit") %></button>   
		    <label>
        		<input type="checkbox" name="remember" id="login_remember" value="yes" />
	           <%=pro.getProperty("Remember") %>
        	</label>   
    	</div>
</form>
<%} %>
</body>
</html>